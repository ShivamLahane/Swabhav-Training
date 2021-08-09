
function doSomething(input, successFn, errFunction)
{
    var randomValue = Math.random() * input;
    if (randomValue > 5)
    {
        successFn({ success : "success" });
        return ;
    }
    errFunction({ error : "error" });
}

successFuntion = function(data) { console.log("success happened" + JSON.stringify(data)) };
errorFunction = function(data) { console.log("error occured" + data) };

doSomething(235, successFuntion, errorFunction);
console.log("end of program.");