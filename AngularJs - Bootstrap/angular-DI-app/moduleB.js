angular.module('modB', [])
        .controller('controllerB',['$scope', '$rootScope', function($scope, $rootScope,)
        {
            $scope.message = "Hello there, Controller A here.";
            console.log($rootScope.developer);
        }] );