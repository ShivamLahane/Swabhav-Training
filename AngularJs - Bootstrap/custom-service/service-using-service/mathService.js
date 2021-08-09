app.service('mathSquareService', ['mathFactory', function(mathFactory)
    {
        var square = function(input)
        {
            return mathFactory.squareOfNumber(input);
        }
    }])