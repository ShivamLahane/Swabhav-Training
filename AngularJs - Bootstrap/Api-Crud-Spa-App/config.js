app.config(function($routeProvider)
{
    $routeProvider
                .when('/', 
                {
                    templateUrl : 'Templates/home.html',
                    controller : "HomeController"
                })
                .when('/add', 
                {
                    templateUrl : 'Templates/add.html',
                    controller : "AddController"
                })
                .when('/update/:id', 
                {
                    templateUrl : 'Templates/update.html',
                    controller : "UpdateController"
                })
                .otherwise({
                    templateUrl: "Templates/error.html",
                  });
})