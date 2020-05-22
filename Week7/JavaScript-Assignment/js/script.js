
var number1=document.querySelector('#number1');
var number2=document.querySelector('#number2');
var result=document.querySelector('#result');
var radiobtns = document.querySelectorAll("input[name='operator']");
console.log(radiobtns);

function writeToResult(val)
{
    result.innerHTML=val;
}
function performOperation(op)
{
    if(op=="Add")
    {
        writeToResult(Number(number1.value)+Number(number2.value));
    }
    else if(op=="Subtract")
    {
        writeToResult(Number(number1.value)-Number(number2.value));
    }
    else if(op=="Multiply")
    {
        writeToResult(Number(number1.value)*Number(number2.value));
    }
    else
    {
        if(Number(number2.value)==0)
        {
                alert('Divide by zero');
            return;
        }
        writeToResult(Number(number1.value)/Number(number2.value));
    }
}
for(var i=0;i<radiobtns.length;i++)
{
    radiobtns[i].addEventListener("click",
    function(){
        //  alert(this.value);
        performOperation(this.value);
    });
}
