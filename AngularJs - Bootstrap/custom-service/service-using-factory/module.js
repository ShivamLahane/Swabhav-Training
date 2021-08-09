var app = angular.module('moduleS', [])
        .controller('controllerS', ['$scope', 'stringService', function($scope, stringService)
    {
        $scope.inputString = 'Enter String Here.'

        $scope.outputString = '';

        $scope.transformString = function()
        {
            $scope.outputString = stringService.processString($scope.inputString);
        }
    }])