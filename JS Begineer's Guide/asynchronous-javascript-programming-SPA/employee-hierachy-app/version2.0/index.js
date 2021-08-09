// (
// function()
// {
    var hasChildrens;
    var bosses;
    var level = -1;
    var hierachyMap = new Map();
    var empDataMap = new Map();
    var dataPar = document.getElementById("data");
    var xhr = new XMLHttpRequest();
    var getButton = document.getElementById("get-btn");
    getButton.addEventListener("click", loadEmpData);

    function loadEmpData()
    {
        xhr.addEventListener("load", function()
                                    {
                                        getDataOrError()
                                            .then( function(res) 
                                            { 
                                                parseAndStoreEmpData(res);
                                            })
                                            .catch(function(error)
                                            {
                                                document.getElementById("emp-details").innerHTML = error;
                                            });
                                    } );
        xhr.open("POST", "https://swabhav-tech.firebaseapp.com/emp.txt", true);
        xhr.send();
    }



    function getDataOrError()
    {
        return new Promise(function(resolve, reject)
                            {
                                if (xhr.status >= 200 && xhr.status < 300)
                                {
                                    resolve( xhr.responseText );
                                    return;
                                }
                                reject( xhr.status);
                            });
    }


    function parseAndStoreEmpData(response)
    {
        let data = response.split("\n"); 
        for (let i = 0; i < data.length; i++)
        {
            let empData = data[i].split(",");
            var empObject = 
            {
                id : empData[0],
                name : empData[1].substring(1, empData[1].length),
                designation : empData[2].substring(1, empData[2].length),
                managerId : empData[3],
                DOJ : empData[4].substring(1, empData[4].length),
                salary : empData[5],
                commission : empData[6],
                deptId : empData[7],
            }
            var childrens = hierachyMap.get(empData[3]);
            if (childrens == undefined)
            {
                childrens = new Set();
            }
            childrens.add(empData[0]);
            hierachyMap.set(empData[3], childrens);
            empDataMap.set(empData[0], empObject);
        }
        bosses = Array.from(hierachyMap.get("NULL"));
        renderHierachy();
    }

    function renderHierachy()
    {
        var childrens = [];
        let div = document.createElement("div");
        div.id = ++level;
        let i, j;
        for (i = 0; i < bosses.length; i++)
        {
            let button = document.createElement("button");
            button.id = empDataMap.get(bosses[i]).id;
            button.innerHTML = empDataMap.get(bosses[i]).name;
            button.addEventListener("click", function(e) { printReporteeDetails(e); })
            div.appendChild(button);
            let set = hierachyMap.get(bosses[i]);
            if (set == undefined)
            {
                hasChildrens = false;
                continue;
            }
            hasChildrens = true;
            let array = Array.from(set);
            for (j = 0; j < array.length; j++)
            {
                childrens.push(array[j]);
            }
        }
        document.body.appendChild(div);
        document.body.appendChild(document.createElement("br"));
        bosses = childrens;
        if (hasChildrens)
        {
            renderHierachy();
        }
    }

    function printReporteeDetails(e)
    {
        let paragraph = document.getElementById("emp-details");
        document.body.removeChild(paragraph);
        let newParagraph = document.createElement("h4");
        newParagraph.id = "emp-details";
        let emp = empDataMap.get(e.currentTarget.id);
        newParagraph.innerHTML = JSON.stringify(empDataMap.get(emp.managerId));
        document.body.appendChild(newParagraph);
    }

// }
// )();