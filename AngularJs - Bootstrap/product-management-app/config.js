app.config(['$routeProvider', function($routeProvider)
{
    $routeProvider
                .when('/',
                {
                    templateUrl : 'Templates/welcome.html',
                    controller : 'WelcomeController'
                })
                .when('/products',
                {
                    templateUrl : 'Templates/products.html',
                    controller : 'ProductListController'
                })
                .when('/products/:id',
                {
                    templateUrl : 'Templates/productDetails.html',
                    controller : 'ProductListController'
                })
                .otherwise(
                {
                        templateurl : 'Templates/error.html',
                })
}])