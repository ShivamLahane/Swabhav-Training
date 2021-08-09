angular.module('modA', [])
        .controller('controllerA',['$rootScope', '$timeout',function($rootScope, $timeout)
            {
                $rootScope.name = 'Shivam';
                $timeout(function () 
                    {
                            $rootScope.name = "Shivam Lahane";
                    }, 5000);
            }]);