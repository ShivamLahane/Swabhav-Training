(function ()
{
    "use strict";
    function startGame()
    {
        attempts = 5;
        rulesContainer.style.display = "none";
        gameContainer.style.display = "block";
        renderBalls();
        let resetButton = document.createElement("button");
        resetButton.className = "btn btn-primary btn-lg";
        resetButton.addEventListener("click", endGame);
        resetButton.addEventListener("click", startGame);
        resetButton.innerHTML = "Reset";
        gameContainer.appendChild(resetButton);
        attemptDisplayer.innerHTML = attempts + " attempts left.";
    }

    function changeBallColor(e)
    {
        let buttonId = e.target.id;
        let button = document.getElementById(buttonId.toString());
        if (buttonId == blueBallNumber)
        {
            button.style.backgroundColor = "blue";
            setTimeout(function() { alert("well done! you won."); }, 1000);
            setTimeout(function() { location.reload(); }, 1000);
            return ;
        }
        if (buttonId > blueBallNumber)
        {
            button.style.backgroundColor = "green";
            return ;
        }
        button.style.backgroundColor = "red";
    }

    function analyseResult()
    {
        attempts--;
        if (attempts == 0)
        {
            setTimeout(function() { alert("sorry you have no attempts left, try again."); }, 1000);
            setTimeout(function() { location.reload(); }, 2000);
            return ;
        }
        attemptDisplayer.innerHTML = attempts + " attempts left.";
    }

    function renderBalls()
    {
        let count = 1;
        for (let i = 0; i < numberOfBalls; i++)
        {
            let rowDiv = document.createElement("div");
            rowDiv.className = "row border";
            for (let j = 0; j < numberOfBalls; j++)
            {
                let colDiv = document.createElement("div");
                colDiv.className = "col col-sm col-md col-lg col-lg border justify-content-center"
                let button = document.createElement("button");
                button.className = "ball";
                button.innerHTML = count;
                button.id = count;
                button.addEventListener("click", function(e) { changeBallColor(e); analyseResult(); });
                count++;
                colDiv.appendChild(button);
                rowDiv.appendChild(colDiv);
            }
            gameContainer.appendChild(rowDiv);
        }
    }

    function endGame()
    {
        rulesContainer.style.display = "block";
        gameContainer.style.display = "none";
        while (gameContainer.firstChild)
        {
            gameContainer.removeChild(gameContainer.firstChild);
        }
    }

    var numberOfBalls = 7;
    var attempts;
    var blueBallNumber =  Math.floor(Math.random() * (numberOfBalls * numberOfBalls)) + 1;
    console.log(blueBallNumber);
    var attemptDisplayer = document.getElementById("attempts-displayer");
    var rulesContainer = document.getElementById("rules-container");
    var gameContainer = document.getElementById("game-container");
    var startButton = document.getElementById("start");
    startButton.addEventListener("click", startGame);

}) ();