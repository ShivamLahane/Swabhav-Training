
window.addEventListener('hashchange',function(e) { getFromApi(e) });

function getFromApi(e)
{
        console.log(e.event);
        console.log('http://127.0.0.1:5500/html-fragment-app/index.html' + location.hash);
}