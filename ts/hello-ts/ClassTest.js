var Customer = /** @class */ (function () {
    function Customer(id, fName, lName) {
        this._id = id;
        this._fName = fName;
        this._lName = lName;
    }
    Object.defineProperty(Customer.prototype, "Id", {
        get: function () {
            return this._id;
        },
        set: function (id) {
            this._id = id;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Customer.prototype, "fName", {
        get: function () {
            return this._fName;
        },
        set: function (fName) {
            this._fName = fName;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Customer.prototype, "lName", {
        get: function () {
            return this._lName;
        },
        set: function (lName) {
            this._lName = lName;
        },
        enumerable: false,
        configurable: true
    });
    return Customer;
}());
var c = new Customer(1, "Sjoj", "HJGse");
console.log(c.Id);
console.log(c.fName);
c.fName = "skdjkg";
console.log(c.fName);
