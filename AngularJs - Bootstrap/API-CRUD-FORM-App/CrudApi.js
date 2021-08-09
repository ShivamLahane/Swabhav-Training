var app = angular.module('crudApi', [])
                .controller('crudController', ['$scope', 'httpService', '$http', function($scope, httpService, $http)
            {
                $scope.students;
                
                $scope.student = {};

                $scope.error;

                $scope.getStudents = function()
                {
                    httpService.GET()
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

                $scope.setStudentForm = function(student)
                {
                    $scope.student = student
                    $scope.student.date = new Date(student.date);
                }

                $scope.addStudentInfo = function()
                {
                    httpService.POST($scope.student)
                                                    .then(function(result)
                                                    {
                                                        $scope.getStudents();
                                                    })
                                                    .catch(function(error)
                                                    {
                                                        console.log(error)
                                                    })

                }

                $scope.updateStudentInfo = function(id)
                {
                    httpService.PUT($scope.student)
                                                    .then(function(result)
                                                    {
                                                        $scope.getStudents();
                                                    })
                                                    .catch(function(error)
                                                    {
                                                        console.log(error)
                                                    })
                }

                $scope.deleteStudent = function(id)
                {
                    httpService.DELETE(id)
                                            .then(function(result)
                                            {
                                                console.log(result);
                                                $scope.getStudents();
                                            })
                                            .catch(function(error)
                                            {
                                                console.log(error)
                                            })
                }
            }])