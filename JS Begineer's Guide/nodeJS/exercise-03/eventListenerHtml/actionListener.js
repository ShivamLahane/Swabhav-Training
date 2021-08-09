function god()
{
    document.getElementById("para1").innerHTML = "god";
    // console.log("god is listening to you.");
}

function devil()
{
    document.getElementById("para2").innerHTML = "devil";
    // console.log("devil is listening to you.");
}

function callBackFun(a, b)
{
    a();
    b();
}

var button = document.getElementById("button");
button.addEventListener("click", function() { callBackFun(god, devil);});