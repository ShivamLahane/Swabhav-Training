
var diceFrequencyMap = new Map();

for (var i = 1; i < 7; i++)
{
    diceFrequencyMap.set(i, 0);
}

var die = 10;

for (var i = 0; i < 10; i++)
{
    var number = Math.floor(Math.random() * 6) + 1;
    var count = diceFrequencyMap.get(number) + 1;
    diceFrequencyMap.set(number ,count);
}

for (var i = 1; i < 7; i++)
{
    console.log( i + " : " + diceFrequencyMap.get(i));
}