function Customer(id, customerName)
{
    this.id = id;
    this.name = customerName;

    this.foo = "I am foo, just to test";
    this.getName = function() { return this.name; }
    this.getId = function() { return this.id; }
}

var c1 = new Customer(1, "Shivam");
var c2 = new Customer(2,"Nikhil");

console.log(c1.__proto__ === c2.__proto__);
console.log(Customer.prototype === c1.__proto__);
console.log(Customer.prototype === c2.__proto__)

Customer.prototype.getDetails = function () 
                                { 
                                    return "Customer Details : " + "id : " + this.id + " ,name : " + this.name;
                                }
console.log(c1);
console.log(c1.getDetails());
console.log(c2);
console.log(c2.getDetails());

var obj = new Object();
console.log(Object.prototype == obj.__proto__);
console.log(Object.prototype == Customer.prototype);
console.log(obj.__proto__);