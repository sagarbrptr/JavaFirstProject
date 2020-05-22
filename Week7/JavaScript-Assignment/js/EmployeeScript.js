let Employees = [
    {empcode:"1",name:"sagar",city:"nagpur"},
    {empcode:"2",name:"tejas",city:"pune"},
    {empcode:"3",name:"mihir",city:"amravati"},
    {empcode:"4",name:"vedang",city:"pune"}
]
var tablebody = document.querySelector("#tablebody");
var inputName = document.querySelector("#searchEmp");
var searchOutput = document.querySelector("#searchOutput");
displayTable(tablebody,Employees);
function displayTable(tablebody,Employees)
{
    for(i in Employees)
    {
        tablebody.innerHTML+= " <tr><th scope='row'>"+Employees[i].empcode+
        "</th><td>"+Employees[i].name+
        "</td><td>"+Employees[i].city+"</td></tr>";
    }
}
function searchEmployee()
{
    let result =[];
    for(i in Employees)
    {
        if(Employees[i].name==inputName.value)
            result.push(Employees[i]);
    }
    if(result.length==0)
    {
        searchOutput.innerHTML="No result";
    }
    else{
        searchOutput.innerHTML="<table class='table'><thead><tr><th scope='col'>Employee Code</th><th scope='col'>Name</th><th scope='col'>City</th></tr></thead><tbody id='searchbody'></tbody></table>";
        var searchbody = document.querySelector("#searchbody");
        displayTable(searchbody,result);
    }
}
