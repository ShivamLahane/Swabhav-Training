
function doSomething(input)
{
    var randomValue = Math.random() * input;
    if (randomValue > 5)
    {
        return {result : "success"};
    }
    return { Error : "something is wrong"};
}

console.log(doSomething(235));
console.log("end of program.");