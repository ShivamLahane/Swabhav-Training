
getCustomer(1, function(customer)
{
  console.log('Customer: ', customer);
  if (customer.isGold) 
  {
        getTopMovies(function(movies)
        {
            console.log('Top movies: ', movies);
            sendEmail(customer.email, movies, function() 
                                            {
                                                console.log('Email sent...')
                                            });
        });
  } 
});

function getCustomer(id, callback) 
{
  setTimeout(function()
            {
              callback({ id: id, name: 'Nikhil', isGold: true, email: 'email' });
            }, 4000);  
}

function getTopMovies(callback) 
{
  setTimeout(function()
            {
              callback(['movie1', 'movie2']);
            }, 4000);
}

function sendEmail(email, movies, callback) 
{
  setTimeout(function()
            {
              callback();
            }, 4000);
}

console.log("end of program");