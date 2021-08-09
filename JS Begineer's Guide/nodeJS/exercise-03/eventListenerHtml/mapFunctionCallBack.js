
function addTen(no)
{
    return no + 10;
}

function sqaure(no)
{
    return no * no;
}

function mapFunction(nos, mapFun)
{
    var resultArray = [];
    for (var i = 0; i < nos.length; i++)
    {
        resultArray.push(mapFun(nos[i]));
    }
    return resultArray;
}

var nos = [10, 20, 31, 40]

console.log(mapFunction(nos, sqaure));
console.log(mapFunction(nos, addTen));