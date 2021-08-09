app.factory('HttpService', ['$http', '$q', function($http, $q)
{
    return {
        GET : function()
        {
            return $q(function(resolve, reject)
            {
                $http.get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students")
                        .then(function(students)
                        {
                            resolve(students.data);
                        })
                        .catch(function(error)
                        {
                            reject(error);
                        })
            })
        },

        getStudent : function(id)
        {
            return $q(function(resolve, reject)
            {
                $http.get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/" + id)
                .then(function(student)
                {
                    resolve(student.data[0]);
                })
                .catch(function(error)
                {
                    reject(error);
                })
            })
        },

        POST : function(student)
        {
            return $q(function(resolve, reject)
            {
                $http.post("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students", student
                , )
                .then(function(result)
                {
                    resolve(true);
                })
                .catch(function(error)
                {
                    console.log(error);
                    reject(error);
                })
            })
        },

        PUT : function(student)
        {
            return $q(function(resolve, reject)
            {
                $http.put("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/" + student.id, student
                , 'Content-Type: application/json')
                .then(function(result)
                {
                    resolve(true);
                })
                .catch(function(error)
                {
                    reject(error);
                })
            })
        },

        DELETE : function(id)
        {
            return $q(function(resolve, reject)
            {
                $http.delete("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/" + id)
                .then(function(result)
                {
                    resolve(true);
                })
                .catch(function(error)
                {
                    reject(error);
                })
            })
        }
    }
}])