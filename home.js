function barraMenu()
{
    document.getElementById("head").style.height = "10%";
//    document.getElementById("logo").style.backgroundImage = "url('logo-pd15.png')";
    document.getElementById("logo").style.height = "10%";
    document.getElementById("logo").style.width = "9.6%";
//    document.getElementById("head-vermelho").attributes = document.getElementById("head-vermelho-scroll");
    document.getElementById("head-vermelho").style.height = "0%";
    document.getElementById("head-branco").style.height = "0%";
    document.getElementById("nome").style.left = "-500px";
    document.getElementById("nome").style.fontSize = "30px";
    document.getElementById("nome").style.fontSize = "30px";
    
    if (window.scrollY < 101)
    {
    document.getElementById("head").style.height = "20%";
//    document.getElementById("logo").style.backgroundImage = "logo-pd15.png";
    document.getElementById("logo").style.height = "20%";
    document.getElementById("logo").style.width = "30%";
//    document.getElementById("head-vermelho").attributes = document.getElementById("head-vermelho-scroll");
    document.getElementById("head-vermelho").style.height = "10%";
    document.getElementById("head-branco").style.height = "12%";
    document.getElementById("nome").style.left = "30%";
    document.getElementById("nome").style.fontSize = "60px";
    document.getElementById("nome").style.fontSize = "60px";
        
    }
    
//    document.getElementById("corpo").scrollTop = "50";
    
//    if (document.getElementById("corpo").scrollTop)
}