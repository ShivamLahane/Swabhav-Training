

function makeCustomer()
{
    var customer = { };
    var _id, _name;

    customer.setId = function(id) { _id = id; };
    customer.setName = function(name) { _name = name; };

    customer.getDetails = function () {return "id : " + _id + ", name : " + _name ; };
    return customer;
}

var c1 = makeCustomer();
c1.setId(1);
c1.setName("Shivam");
console.log("details : " + c1.getDetails());

console.log(c1);