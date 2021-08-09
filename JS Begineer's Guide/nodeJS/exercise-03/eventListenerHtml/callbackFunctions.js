
function filterByOdd(no)
{
    return (no % 2 != 0);
}

function filterByEven(no)
{
    return (no % 2  == 0);
}

function filterGreaterThanTen(no)
{
    return (no > 10);
}

function filterNumbers(nos, filterStrategy)
{
    var resultArray = [];
    for (var i = 0; i < nos.length; i++)
    {
        if (filterStrategy(nos[i]))
        {
            resultArray.push(nos[i]);
        }
    }
    return resultArray;
}

var nos = [10, 20, 31, 40];
console.log(filterNumbers(nos, filterByOdd));
console.log(filterNumbers(nos, filterByEven));
console.log(filterNumbers(nos, filterGreaterThanTen));