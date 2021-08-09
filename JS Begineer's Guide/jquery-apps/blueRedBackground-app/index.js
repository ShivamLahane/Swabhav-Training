$("#red").on("click", function(event) { changeBgColor(event); });
$("#blue").on("click", function(event) { changeBgColor(event); });

function changeBgColor(event)
{
    $('body').css("backgroundColor", event.target.id);
}