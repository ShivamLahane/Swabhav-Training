angular.module('modA', [])
        .controller('controllerA', function($scope, $rootScope, $log)
        {
            console.log("inside controller A");
            $log.info("using log service");
            $rootScope.company = { name : 'Aurionpro', strength : '500'};
            $scope.developer = { name : 'Shivam', role : 'Jr. Engineer.'};
            $log.info($rootScope);
            $log.info($scope);
        });