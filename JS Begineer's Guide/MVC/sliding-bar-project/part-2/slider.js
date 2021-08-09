(
    function ()
    {
        function displaySliderValue()
        {
            para.innerHTML = slider.value;
            removeAllChildNodes(ul);
            renderButtons(slider.value);
        }

        function removeAllChildNodes(parent) 
        {
            while (parent.firstChild) 
            {
                parent.removeChild(parent.firstChild);
            }
        }

        function buttonClick(value)
        {
            alert(value);
        }

        function renderButtons(number)
        {
            for (let i = 1; i <= number; i++)
            {
                let li = document.createElement("li");
                let button = document.createElement("button");
                button.innerHTML = i;
                button.addEventListener("click", function () { buttonClick(button.innerHTML) });
                li.appendChild(button);
                ul.appendChild(li);
            }
        }

        var slider = document.getElementById("range-slider");
        var para = document.getElementById("slider-op");
        var ul = document.getElementById("buttonsList");
        slider.addEventListener("input", displaySliderValue);
    }
) ();