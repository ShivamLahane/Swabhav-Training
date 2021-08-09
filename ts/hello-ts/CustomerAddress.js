"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Address = exports.Customer = void 0;
var Customer = /** @class */ (function () {
    function Customer(id, fName, lName) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
    }
    Object.defineProperty(Customer.prototype, "fullName", {
        get: function () {
            return this.fName + " " + this.lName;
        },
        enumerable: false,
        configurable: true
    });
    return Customer;
}());
exports.Customer = Customer;
var Address = /** @class */ (function () {
    function Address(id, city, loc) {
        this.id = id;
        this.city = city;
        this.loc = loc;
    }
    Object.defineProperty(Address.prototype, "fullAddress", {
        get: function () {
            return this.loc + " " + this.city;
        },
        enumerable: false,
        configurable: true
    });
    return Address;
}());
exports.Address = Address;
