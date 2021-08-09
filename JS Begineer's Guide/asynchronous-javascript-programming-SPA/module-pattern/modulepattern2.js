
var service = function ()
            {
                var obj = { };
                console.log("service called.");
                obj.doSomething1 = function () { console.log("something done first time"); };
                obj.doSomething2 = function () { console.log("Something done second time"); };
                obj.doSomething3 = function () { console.log("something done 3rd time."); };

                return obj;
            }();

service.doSomething1();
service.doSomething2();
service.doSomething3();