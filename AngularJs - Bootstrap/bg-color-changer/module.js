angular.module('moduleColor', [])
        .controller('colorController', ['$scope', function($scope)
    {
        $scope.changeColor = function(color)
        {
            $scope.myStyle = { "background-color" : color, }
            return;
        }
    }])