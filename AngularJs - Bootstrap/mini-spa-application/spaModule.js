var app = angular.module('spa', ["ngRoute"])
                    .config(function($routeProvider)
                    {
                        $routeProvider
                                    .when('/home', 
                                    {
                                        templateUrl : 'Fragments/Home.html',
                                        controller : "homeController"
                                    })
                                    .when('/about', 
                                    {
                                        templateUrl : 'Fragments/About.html',
                                        controller : "aboutController"
                                    })
                                    .when('/career', 
                                    {
                                        templateUrl : 'Fragments/Career.html',
                                        controller : "careerController"
                                    })
                    })
                    .controller('homeController', ['$scope', function($scope)
                    {
                        $scope.home = { };
                        $scope.home.data = "Home Page";
                    }])
                    .controller('aboutController', ['$scope', function($scope)
                    {
                        $scope.about = { };
                        $scope.about.data = "About Page";
                    }])
                    .controller('careerController', ['$scope', function($scope)
                    {
                        $scope.career = { };
                        $scope.career.data = "Career Page";
                    }])