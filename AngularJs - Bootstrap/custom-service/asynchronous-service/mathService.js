app.service('mathService', ['$q', function($q)
{
    var math = {};
    math.isPrime = function(number)
    {
        return $q(function(resolve, reject)
        {
            var i = 2;
            while(i < number)
            {
                if((number % i) == 0)
                {
                    return reject(false);
                }
                i++;
            }
            return resolve(true);
        })
    }
    return math;
}])