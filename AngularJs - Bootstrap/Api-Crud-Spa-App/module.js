var app = angular.module('StudentAPI', ['ngRoute'])
                .controller('HomeController', ['HttpService', '$routeParams', '$scope', '$window',
                function(HttpService, $routeParams, $scope, $window)
                {
                    $scope.students;

                    $scope.getStudents = function()
                    {
                        HttpService.GET()
                                        .then(function(result)
                                        {
                                            $scope.students = result;
                                            $scope.student = { };
                                        })
                                        .catch(function(error)
                                        {
                                            console.log(error);
                                        })
                    }
                    
                    $scope.getStudents();

                    $scope.edit = function(id)
                    {
                        $routeParams.id = id;
                        $window.location.href = '#/update/' + $routeParams.id;
                    }

                    $scope.delete = function(id)
                    {
                        HttpService.DELETE(id)
                                                .then(function(result)
                                                {
                                                    $scope.getStudents();
                                                })
                                                .catch(function(error)
                                                {
                                                    console.log(error)
                                                })
                    }
                }])
                .controller('AddController', ['HttpService', '$scope', '$window',
                function(HttpService ,$scope, $window)
                {
                    
                    $scope.addStudentInfo = function()
                    {
                        HttpService.POST($scope.student)
                                                        .then(function(result)
                                                        {
                                                            console.log(result);
                                                            $window.location.href = '#/';
                                                        })
                                                        .catch(function(error)
                                                        {
                                                            console.log(error)
                                                        })
    
                    }
                }])
                .controller('UpdateController', ['HttpService', '$routeParams', '$scope', '$window',
                function(HttpService, $routeParams, $scope, $window)
                {
                    $scope.student = { };

                    HttpService.getStudent($routeParams.id)
                                .then(function(student)
                                {
                                    $scope.student = student;
                                    $scope.student.date = new Date(student.date);
                                })
                                .catch(function(error)
                                {
                                    console.log(error);
                                })

                    $scope.updateStudentInfo = function()
                    {
                        HttpService.PUT($scope.student)
                                        .then(function(result)
                                        {
                                            console.log(result);
                                            $window.location.href = '#/';
                                        })
                                        .catch(function(error)
                                        {
                                            console.log(error)
                                        })
                    }
                }])
                .filter('gender', [function()
                    {
                        return function(gender)
                        {
                            switch(gender)
                            {
                                case true:
                                    return 'M';
                                case false:
                                    return 'F';
                            }
                        }
                    }])
