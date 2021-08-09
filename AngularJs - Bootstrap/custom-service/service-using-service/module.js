var app = angular.module('mathModule', [])
                    .controller('mathController', ['$scope', 'mathFactory', 'mathSquareService',
                    function($scope, mathFactory, mathSquareService)
                    {
                        $scope.number;
                        $scope.result = 'Result will display here';

                        $scope.square = function()
                        {
                            $scope.result = mathSquareService.square($scope.number);
                        }

                        $scope.cube = function()
                        {
                            $scope.result = mathFactory.cubeOfNumber($scope.number);
                        }

                    }])