
function title(){
    document.getElementById('title').addEventListener('mouseover',()=>{
        document.getElementById('title').style.color = "red";
    })

    document.getElementById('title').addEventListener('mouseleave',()=>{
        document.getElementById('title').style.color = "";
    })
}

title();