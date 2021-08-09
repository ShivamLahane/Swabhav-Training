// hoisting
function codeHoist()
{
    a = 10;
    let b = 50;
}
codeHoist();
  
console.log(a); // 10
console.log(b); // ReferenceError : b is not defined

// Hoisting in javascript means the variable can be used even before declaration