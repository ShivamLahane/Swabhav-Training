export class Customer
{
    constructor(private id : number, private fName : string, private lName : string)
    {

    }

    get fullName()
    {
        return this.fName + " " + this.lName;
    }
}

export class Address
{
    constructor(private id : number, private city : string, private loc : string)
    {

    }

    get fullAddress()
    {
        return this.loc + " " + this.city;
    }
}