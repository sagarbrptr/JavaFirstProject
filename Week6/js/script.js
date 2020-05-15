
var display=document.querySelector('#display');
function addToDisplay(val)
{
    display.value+=val;
}
var btns = document.querySelectorAll("#calculatorButton");

for(var i=0;i<btns.length;i++)
{
    btns[i].addEventListener("click",
    function(){
        // alert(this.value);
        addToDisplay(this.value);
    });
}

document.getElementById("res").addEventListener("click",function(){
    var res=eval(display.value);
    display.value=res;
})

document.getElementById("clearDisplay").addEventListener("click",function(){
    display.value='';
})