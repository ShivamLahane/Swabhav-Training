angular.module('modA', ['modB'])
        .controller('controllerA',['$scope', '$rootScope', function($scope, $rootScope,)
        {
            $scope.message = "Hello there, Controller A here.";
            console.log($rootScope.developer);
        }] );
