
onmessage = function(e)
                {
                    console.log(e.data);
                    var result ;
                    for (var i = 0; i <= 1000000000; i += 1) 
                    {
                        result = i;
                    }
                    postMessage(result);
                }