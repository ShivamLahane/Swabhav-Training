class Customer
{
    _id : number;
    _fName : string;
    _lName : string;

    constructor(id : number, fName : string, lName : string)
    {
        this._id = id;
        this._fName = fName;
        this._lName = lName;
    }

    get  Id()
    {
        return this._id;
    }

    set Id(id : number)
    {
        this._id = id;
    }

    get fName()
    {
        return this._fName;
    }

    set fName(fName : string)
    {
        this._fName = fName;
    }

    get lName()
    {
        return this._lName;
    }

    set lName(lName : string)
    {
        this._lName = lName;
    }

}

let c = new Customer(1, "Sjoj", "HJGse");
console.log(c.Id);
console.log(c.fName);
c.fName = "skdjkg";
console.log(c.fName);