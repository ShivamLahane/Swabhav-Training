document.getElementById("async").addEventListener("click", printAsynchronously );
document.getElementById("hello").addEventListener("click", printHello );
document.getElementById("sync").addEventListener("click", printSynchronously );

function printSynchronously()
{
    var counter = 0;
    while(true)
    {
        console.log(++counter);
    }
}

function printHello()
{
    document.getElementById("result").innerHTML = "Hello, How are you?";
}

function printAsynchronously() 
{
    var worker = new Worker('worker.js');
    worker.postMessage("Start Worker");

    worker.onmessage = function(e)
    {
        document.getElementById("async-counter").innerHTML = e.data;
    };
}