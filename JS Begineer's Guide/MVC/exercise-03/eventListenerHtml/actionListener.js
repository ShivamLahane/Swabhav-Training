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

function callBackFun()
{
    god();
    devil();
}

var button = document.getElementById("button");
button.addEventListener("click", callBackFun);