function getCustomer(id, name)
{
    var obj = {id : id, name : name, isGold : true, email : "lahaneshivam@gmail.com"}
    return new Promise(function(resolve, reject)
                        {
                            setTimeout( function()
                                {   if (obj.isGold)
                                    {
                                        resolve(obj);
                                        return ;
                                    }
                                    reject({ error : "customer is not gold." });
                                }, 4000
                                )
                        });
}

function getMovies()
{
    return new Promise(function(resolve, reject)
                        {
                            setTimeout(function(){ resolve(['movie1', 'movie2']) }, 4000);
                        });
}

function sendEmail()
{
    return new Promise(function(resolve, reject)
                        {
                            setTimeout(function(){ resolve("email sent.") }, 4000);
                        })
}

getCustomer(1, "shivam")
                        .then(function(data)
                        {
                            console.log(data);
                            return getMovies();
                        })
                        .then(function(movies)
                        {
                            console.log(movies);
                            return sendEmail();
                        })
                        .then(function(msg)
                        {
                            console.log(msg);
                        })
                        .catch(function (error)
                        {
                            console.log(error);
                        })
console.log("end of program");