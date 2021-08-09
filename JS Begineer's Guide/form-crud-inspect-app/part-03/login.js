function validateInput()
{
    let email = document.getElementById("email").value;
    let pass = document.getElementById("pwd").value;
    if (email == "")
    {
        alert("input email required");
        return false;
    }
    if (pass == "")
    {
        alert("password required");
        return false;
    }
    return true;
}