(
    function ()
    {
        function displaySliderValue()
        {
            para.innerHTML = slider.value; 
        }

        var slider = document.getElementById("range-slider");
        var para = document.getElementById("slider-op");
        slider.addEventListener("input", displaySliderValue);
    }
) ();