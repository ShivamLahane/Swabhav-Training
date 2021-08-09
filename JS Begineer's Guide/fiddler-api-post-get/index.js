function displaySliderValue()
{
    para.innerHTML = slider.value; 
}

var slider = document.getElementById("age-slider");
var para = document.getElementById("age-para");
slider.addEventListener("input", displaySliderValue);

$("#add").click(function()
{
    $("#loader").css("visibility", "visible");
    setTimeout(function()
    {
        var data = JSON.stringify($('#myForm').serialize());
        $.post("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students",
        data,
        function(data1, status)
        {
            console.log("Data: " + data1 + "\nStatus: " + status)
        });
        $("#loader").css("visibility", "hidden");
    }, 2000);
})

$('#getStudentsBtn').click(function()
{
    $.getJSON("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students", function(data)
    {
        $('#total').html(data.length);
        var tableData = "";
        $.each(data, function(key, value)
        {
            tableData += '<tr>';
            tableData += '<td>' + value.rollNo + '</td>';
            tableData += '<td>' + value.name + '</td>';
            tableData += '<td>' + value.age + '</td>';
            tableData += '<td>' + value.email + '</td>';
            tableData += '<td>' + value.date + '</td>';
            tableData += '<td>' + value.isMale + '</td>';
        });
        $('#students-data').append(tableData);
    })
})
