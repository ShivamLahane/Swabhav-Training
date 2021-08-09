
interface ICustomer
{
    id : number;
    f_name : string;
    l_name : string;
    loc? : string;
}

function printInfo(customers : ICustomer[])
{
    for (let c of customers)
    {
        console.log(c);
    }
}

printInfo([
    {id : 1, f_name : 'Snjkd', l_name : 'eagf', loc : 'asdg'},
    {id : 2, f_name : 'sdg', l_name : 'dfh', loc : 'ewrh'},
    {id : 3, f_name : 'sdr', l_name : 'sd', loc : 'dfb'}
]);