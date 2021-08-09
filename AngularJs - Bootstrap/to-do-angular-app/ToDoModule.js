angular.module('toDoModule', ['ngStorage'])
        .controller('taskController', ['$scope', '$localStorage' , function($scope, $localStorage)
        {

            $scope.newTask = 'Add new task';

            $scope.$storage = $localStorage;

            $scope.taskList = getTasksFromDB(); 

            $scope.addTask = function()
            {
                var text = $scope.newTask;   
                text.trim();
                if (text.length > 0)
                {
                    addTaskToDB();
                }
            }

            function getTasksFromDB()
            {
                var taskList = $scope.$storage.tasks || [];
                if (taskList.length == 0)
                {
                    $scope.$storage.tasks = taskList;
                    return taskList;
                }
                return taskList;
            }

            function addTaskToDB()
            {
                var tasks = getTasksFromDB();
                tasks.unshift({ text : $scope.newTask, time : new Date(), isDeleted : false });
            }

            $scope.getRelativeTime = function (time)
            {
                return moment(time).fromNow();
            }

            $scope.deletetask = function(time)
            {
                var tasks = getTasksFromDB();
                for (let i = 0; i < tasks.length; i++)
                {
                    if(tasks[i].time == time)
                    {
                        tasks[i].isDeleted = true;
                        break;
                    }
                }
            }

        }],)