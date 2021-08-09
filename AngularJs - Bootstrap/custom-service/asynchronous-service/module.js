var app = angular.module('modulePrime', [])
        .controller('primeController', ['$scope','mathService', function($scope, mathService)
    {
        $scope.model = { };
        
        $scope.model.number = 'Enter number here';

        $scope.model.output = 'Result will display here.';

        $scope.checkPrime = function()
        {
            mathService.isPrime($scope.model.number)
                                                    .then(function(result)
                                                    {
                                                        $scope.model.output = 'prime';
                                                    })
                                                    .catch(function(result)
                                                    {
                                                        $scope.model.output = 'not prime';
                                                    })
            console.log('end of program');
        }
    }])