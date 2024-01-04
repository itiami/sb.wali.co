
function title(){
    document.getElementsByClassName('navItems').forEach(el=>{
    el.addEventListener('mouseover',()=>{
            el.style.color = "red";
        });

        el.addEventListener('mouseleave',()=>{
            el.style.color = "";
        })
    })


}

title();