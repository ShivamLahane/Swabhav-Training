var colorChanger = function buttonListener(listener)
{
    listener();
}

function redListener()
{
    document.body.style.backgroundColor = "red";
}

function blueListener()
{
    document.body.style.backgroundColor = "blue";
}

var button1 = document.getElementById("red");
button1.addEventListener("click", function(){colorChanger(redListener)});

button2 = document.getElementById("blue");
button2.addEventListener("click", function(){colorChanger(blueListener)});
