function Customer(id, customerName)
{
    console.log(this);
    var _id, _name;

    if (id > 0)
    {
        _id = id;
    }

    if (customerName.length > 0)
    {
        _name = customerName;
    }

    this.foo = "I am foo, just to test";

    this.setName = function(name) { _name = name; }

    this.getName = function() { return _name; }

    this.getId = function() { return _id }
}

var c1 = new Customer(1, "Shivam");
var c2 = new Customer(2,"Nikhil")

Customer.prototype.getDetails = function () {  }
// console.log(c1);
// console.log({ c1 });
// c1.setName("Shiv");
// console.log(c1.getName());
// console.log(c1.foo);
// console.log({ c1 });

