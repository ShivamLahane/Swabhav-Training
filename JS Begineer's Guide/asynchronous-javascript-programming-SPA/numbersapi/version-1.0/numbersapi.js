"use strict";
function getFact()
{
    let number  = document.getElementById("number-input").value;
    let xhr = new XMLHttpRequest();
    xhr.addEventListener("load", function()
    {
        document.getElementById("fact").innerHTML = xhr.responseText;
    });
    if (!isNaN(number))
    {
        xhr.open("GET", "http://numbersapi.com/" + number);
        xhr.send();
        return ;
    }
    alert("enter number");
}

document.getElementById("get-facts").addEventListener("click", getFact);