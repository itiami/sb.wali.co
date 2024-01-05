
function title() {
    document.addEventListener("DOMContentLoaded", function() {
        var myDataElement = document.getElementById('myData');
        var myData = myDataElement.dataset.myattribute;
        const jsonArr = JSON.parse(myData);
        jsonArr.map(el=>{
            console.log(el)
            /*console.log({
                name: el.name,
                path: el.path
            })*/
        })
    });
}

title();