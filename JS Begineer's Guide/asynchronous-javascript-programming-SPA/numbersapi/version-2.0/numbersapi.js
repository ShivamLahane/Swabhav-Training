"use strict";

// import { SearchHistoryModel } from './SearchHistoryModel.js';

(   
    function()
    {
        function createAndAddLiToUl(id, number,fact,  date)
        {
            let li = document.createElement("li");
            li.innerHTML = "number :" + number + " fact : "  + fact
            + " Date & Time : " + date + " ";
            li.id = id;
            let deleteButton = document.createElement("button");
            deleteButton.innerHTML = "delete search";
            deleteButton.addEventListener("click", function (e) { deleteHistory(e); });
            let div = document.createElement("div");
            if (number % 2 == 0)
            {
                div.style.backgroundColor = "cyan";
                li.style.color = "black";
                deleteButton.className = "btn btn-warning btm-sm";
            }
            else
            {
                div.style.backgroundColor = "red";
                li.style.color = "white";
                deleteButton.className = "btn btn-success btm-sm";
            }
            li.appendChild(deleteButton);
            div.appendChild(li);
            recentSearchesUl.prepend(div);
        }

        function printSearchHistory()
        {
            let array = getPrevSearchesFromDataBase();
            count = array.length - 1;
            for (let i = 0; i <= array.length - 1; i++)
            {
                if (!array[i].isDeleted)
                {
                    createAndAddLiToUl(count - i, array[i].number, array[i].fact, array[i].date);
                }
            }
        }

        function addToUl(object)
        {
            createAndAddLiToUl(++count, object.number, object.fact, object.date);
        }

        function deleteHistory(e)
        {
            let li = e.currentTarget.parentElement;
            li.style.display = "none";
            let array = getPrevSearchesFromDataBase();
            array[li.id].isDeleted = true;
            setSearchToDataBase(array);
        }

        function getFactOnSearch()
        {
            number  = document.getElementById("number-input").value;
            if (!isNaN(number))
            {
                connectNumbersAPIandGET();
                return ;
            }
            alert("enter number");
        }

        function connectNumbersAPIandGET()
        {
            xhr.open("GET", "http://numbersapi.com/" + number);
            xhr.send();
        }

        function getFactFromHistoryElement(e)
        {
            let num = e.targetElement.id;
            number = num;
            connectNumbersAPIandGET();
        }

        function printFactAndColorIt()
        {
            paragraph.innerHTML = xhr.responseText;
            addToUl(addSearchLog(number));
            if (number % 2 == 0)
            {
                paragraph.style.color = "black";
                paragraph.parentElement.style.backgroundColor = "cyan";
                return;
            }
            paragraph.style.color = "white";
            paragraph.parentElement.style.backgroundColor = "red";
        }

        function addSearchLog(no)
        {
            let array = getPrevSearchesFromDataBase(); 
            var searchedNumberDetails = 
            { 
                number : no, 
                date : new Date(), 
                isDeleted : false, 
                fact :  xhr.responseText
            };
            array.push(searchedNumberDetails);
            setSearchToDataBase(array);   
            return searchedNumberDetails;        
        }

        function getPrevSearchesFromDataBase()
        {
            if (localStorage.getItem("searchedNumbers"))
            {
                return JSON.parse(localStorage.getItem("searchedNumbers")) || [];
            }
            localStorage.setItem("searchedNumbers", []);
            return [];
        }

        function setSearchToDataBase(array)
        {
            localStorage.setItem("searchedNumbers", JSON.stringify(array));
        }

        var paragraph = document.getElementById("fact");

        var recentSearchesUl = document.getElementById("recent-searches");
        recentSearchesUl.addEventListener("click", function(e) { getFactFromHistoryElement(e); })
        printSearchHistory();

        var number;
        var count;
        let fact;

        let xhr = new XMLHttpRequest();
        xhr.addEventListener("load", printFactAndColorIt );

        document.getElementById("get-facts").addEventListener("click", getFactOnSearch);

        var closebtns = document.getElementsByClassName("close");
        for (let i = 0; i < closebtns.length; i++) 
        {
            closebtns[i].addEventListener("click", function(e) { deleteHistory(e); });
        }
    }
)  ();