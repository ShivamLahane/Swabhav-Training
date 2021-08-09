var app = angular.module('CustomDirectives', [])
                .controller('DirectiveController', ['$scope', function($scope)
                {
                    $scope.companyName = 'aurionpro';
                }])
                .directive('aurionproHeader', function()
                {
                    return { templateUrl : 'Templates/header.html' };
                })
                // .directive('aurionproFooter', function()
                // {
                //     return {
                //     restrict : 'E',
                //     companyName : '=', 
                //     templateUrl : 'Templates/footer' + companyName + '.html' };
                // })
                .directive('aurionproFooter', function()
                {
                    return { 
                        restrict : 'E',
                        companyName : '=',
                        template : '<h2>{{ companyName }} Footer</h2>' };
                })