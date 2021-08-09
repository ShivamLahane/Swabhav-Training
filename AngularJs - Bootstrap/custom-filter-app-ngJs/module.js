angular.module('filterModule', [])
        .filter('gender', [function()
        {
            return function(gender)
            {
                switch(gender)
                {
                    case 1:
                        return 'Male';
                    case 2:
                        return 'Female';
                    case 3:
                        return 'Other';
                }
            }
        }])
        .controller('controllerFilter', ['$scope', function($scope)
        {
           $scope.students = [
               { name : 'Robert Pattinson', gender : 1, rollNo : 21, cgpa : 7.0 },
               { name : 'Rupert Grint', gender : 1, rollNo : 1, cgpa : 9.0 },
               { name : 'Scarllett Johannson', gender : 2, rollNo : 3, cgpa : 9.5 },
               { name : 'Lavender Brown', gender : 2, rollNo : 21, cgpa : 7.0},
               { name : 'Emma Watson', gender : 2, rollNo : 21, cgpa : 10.0}
           ];
           
        }])