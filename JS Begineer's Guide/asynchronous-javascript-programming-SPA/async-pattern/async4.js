
// returns a promise

function doSomething(input)
{
    console.log("inside doSomething()");
    return new Promise(function(resolve, reject)
    {
        console.log(resolve + " " + reject);
        console.log("inside promise");
        var result = Math.random() * input;
        console.log(result);
        if (result > 5)
        {
            resolve({ success : result });
            retrun;
        }
        reject({ error : "something went wrong" });
    });
}

doSomething(10)
            .then(function(result)
            {
               console.log("success happened : " + JSON.stringify(result)); 
            })
            .catch(function(error)
            {
                console.log("error : " + JSON.stringify(error));
            })

console.log("end of program");