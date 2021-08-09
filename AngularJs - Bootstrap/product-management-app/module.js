var app = angular.module('ProductManagementModule', ['ngRoute'])
                .controller('WelcomeController', ['$scope', 
                    function($scope)
                    {
                        $scope.developer = { };
                        $scope.developer.name = 'Shivam Lahane'
                        $scope.developer.email = 'lahaneshivam@gmail.com';
                    }])
                .controller('ProductListController', ['$scope', '$http', '$routeParams', '$window',
                    function($scope, $http, $routeParams, $window)
                    {
                        $routeParams.id;

                        $scope.productList;
                        $scope.searchText;

                        $http.get('DB/products.json')
                            .then(function(products)
                            {
                                $scope.productList = products.data;
                            })

                        $scope.hideOrShowImages = function()
                        {
                            var imageTd = document.getElementsByClassName('img');
                            var showOrHideButton = document.getElementById('ShowHideButton');
                            if (imageTd[0].style.display == 'none')
                            {
                                for (let i = 0; i < imageTd.length; i++)
                                {
                                    imageTd[i].style.display = 'block'
                                }
                                showOrHideButton.innerHTML = 'Hide Images'
                                return ;
                            }
                            for (let i = 0; i < imageTd.length; i++)
                            {
                                imageTd[i].style.display = 'none'
                            }
                            showOrHideButton.innerHTML = 'Show Images'
                        }

                        $scope.directTo = function(productCode)
                        {
                            $routeParams.id = productCode;
                            $window.location.href = '#/products/' + $routeParams.id; 
                        }
                    }])
                .controller('ProductDetailsController', ['$scope', '$http', '$routeParams', '$window',
                    function($scope, $http, $routeParams, $window)
                    {
                        $scope.product;
                        $http.get('DB/products.json')
                        .then(function(products)
                        {
                            var id = $routeParams.id;
                            var productList = products.data;
                            for (let i = 0; i < productList.length; i++)
                            {
                                if(productList[i].productCode == id)
                                {
                                    $scope.product = productList[i];
                                }
                            }
                        })

                        $scope.goBack = function()
                        {
                            $window.location.href = '#/products';
                        }

                    }])
                .directive('starRating', function () {
                    return {
                        restrict: 'A',
                        template: '<ul class="rating">' + 
                            '<li ng-repeat="star in stars">' + 
                            '<div ng-class="star">' + '\u2605' +  '</div>' + 
                            '</li>' +
                            '</ul>',
                        scope: 
                        {
                            ratingValue: '=',
                            max: '='
                        },
                        link: function (scope, elem, attrs) {
                            scope.stars = [];
                            for (var i = 0; i < scope.max; i++) {
                                scope.stars.push(
                                            {
                                                filled: i < scope.ratingValue - 1,
                                                halfFilled : i == Math.floor(scope.ratingValue) && 
                                                (scope.ratingValue % 1) > (0 % 1),
                                            });
                            }
                        }
                    }
                });