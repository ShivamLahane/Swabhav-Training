angular.module('mainModule', [])
        .controller('controllerMain',['$rootScope', function($rootScope)
    {
        $rootScope.student = {
            name : 'Shivam',
            rollNo : 21,
            email : 'lahaneshivam@gmail.com'
        }
    }])