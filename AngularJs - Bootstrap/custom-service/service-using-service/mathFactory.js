app.factory('mathFactory', [function()
{
    return {
        squareOfNumber : function(number)
        {
            return (number * number);
        },
        cubeOfNumber : function(number)
        {
            return (number * number * number);
        }
    }
}])