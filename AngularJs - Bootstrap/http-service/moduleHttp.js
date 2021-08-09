var app = angular.module('moduleHttp', [])
        .controller('controllerHttp', ['$http', '$scope', function($http, $scope)
        {
            $scope.number = 'Enter a number';
            $scope.output = 'Result will display here';

            $scope.getFact = function()
            {
                $http.get('http://numbersapi.com/' + $scope.number)
                        .then(function(result)
                        {
                            $scope.output = result.data;
                        })
                        .catch(function(result)
                        {
                            console.log(result);
                            $scope.output = result;
                        })
                console.log('end of program');
            }
        }])