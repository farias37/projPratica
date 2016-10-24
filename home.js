var souSocio;

function font(){
    document.getElementById("menu-planos").style.minWidth = document.getElementById("menu-planos").style.width;
//    document.getElementById("menu-planos").style.backgroundColor = "red";
}

function barraMenu()
{
    //quando desce o scroll

    document.getElementById("head").style.height = "10%";
//    document.getElementById("logo").style.backgroundImage = "url('logo-pd15.png')";
    document.getElementById("logo").style.height = "10%";
    document.getElementById("logo").style.width = "9.6%";
//    document.getElementById("head-vermelho").attributes = document.getElementById("head-vermelho-scroll");
    document.getElementById("head-vermelho").style.height = "0%";
    document.getElementById("head-branco").style.height = "0%";
    document.getElementById("nome").style.left = "-500px";
    //document.getElementById("nome").style.fontSize = "30px";
    document.getElementById("nome").style.fontSize = "0px";
    document.getElementById("nome").style.height = "0%";
    
    document.getElementById("menu").style.height = "10%";
    document.getElementById("menu").style.top = "0%";
    document.getElementById("menu").style.width = "90%";
    document.getElementById("menu").style.left = "10%";
    
    document.getElementById("menu-login").style.left = "10%";
    document.getElementById("menu-login").style.height = "10%";
    document.getElementById("menu-login").style.top = "0%";
    
    document.getElementById("menu-loja").style.left = "20%";
    document.getElementById("menu-loja").style.height = "10%";
    document.getElementById("menu-loja").style.top = "0%";
    
    document.getElementById("menu-planos").style.left = "30%";
    document.getElementById("menu-planos").style.height = "10%";
    document.getElementById("menu-planos").style.top = "0%";
    
    document.getElementById("menu-cadastro").style.left = "43%";
    document.getElementById("menu-cadastro").style.height = "10%";
    document.getElementById("menu-cadastro").style.top = "0%";
    document.getElementById("menu-cadastro").style.text = "0%";
    
    document.getElementById("menu-parceiros").style.left = "60%";
    document.getElementById("menu-parceiros").style.height = "10%";
    document.getElementById("menu-parceiros").style.top = "0%";
    document.getElementById("menu-parceiros").style.text = "0%";
    
    document.getElementById("menu-contato").style.right = "10%";
    document.getElementById("menu-contato").style.height = "10%";
    document.getElementById("menu-contato").style.top = "0%";
    document.getElementById("menu-contato").style.text = "0%";
    
    document.getElementById("menuCategorias").style.bottom = "85%";

    // if (souSocio == 1)
    // document.getElementById("login").style.position = "scrollY";


    
    
    //quando o scroll volta para o topo
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
    //document.getElementById("nome").style.fontSize = "60px";
    document.getElementById("nome").style.fontSize = "60px";
    document.getElementById("nome").style.height = "10%";
    
    document.getElementById("menu").style.height = "6%";
    document.getElementById("menu").style.top = "14%";
    document.getElementById("menu").style.width = "70%";
    document.getElementById("menu").style.left = "28%";    
        
        document.getElementById("menu-login").style = "menu-login";
        document.getElementById("menu-loja").style = "menu-loja";
        document.getElementById("menu-planos").style = "menu-planos";
        document.getElementById("menu-cadastro").style = "menu-cadastro";
        document.getElementById("menu-parceiros").style = "menu-parceiros";
        document.getElementById("menu-contato").style = "menu-contato";
                document.getElementById("menuCategorias").style.bottom = "75%";
        
    }
    

}

function menu(){

//    document.getElementById("menu-login").style.color = "darkgrey";
//    document.getElementById("menu-loja").style.color = "darkgrey";
//    document.getElementById("menu-planos").style.color = "darkgrey";
//    document.getElementById("menu-cadastro").style.color = "darkgrey";
//    document.getElementById("menu-parceiros").style.color = "darkgrey";
//    document.getElementById("menu-contato").style.color = "darkgrey";
//    document.getElementById("menu").style.opacity = 0.5;
    document.getElementById("menu").style.zIndex = 500;
    
}

function menuLogin(){
//    document.getElementById("menu-login").style.backgroundColor = "hotpink";
//    document.getElementById("menu-login").style.opacity = 0.5;
    document.getElementById("menu-login").style.zIndex = 800;
    
    document.getElementById("menu-loja").style.opacity = 0.3;
    document.getElementById("menu-planos").style.opacity = 0.3;
    document.getElementById("menu-cadastro").style.opacity = 0.3;
    document.getElementById("menu-parceiros").style.opacity = 0.3;
    document.getElementById("menu-contato").style.opacity = 0.3;
    
}

function menuLoja(){
//    document.getElementById("menu-loja").style.backgroundColor = "hotpink";  
//    document.getElementById("menu-loja").style.color = "white";
    
    document.getElementById("menu-login").style.opacity = 0.3;
    document.getElementById("menu-planos").style.opacity = 0.3;
    document.getElementById("menu-cadastro").style.opacity = 0.3;
    document.getElementById("menu-parceiros").style.opacity = 0.3;
    document.getElementById("menu-contato").style.opacity = 0.3;
}

function menuPlanos(){
    document.getElementById("menu-login").style.opacity = 0.3;
    document.getElementById("menu-loja").style.opacity = 0.3;
    document.getElementById("menu-cadastro").style.opacity = 0.3;
    document.getElementById("menu-parceiros").style.opacity = 0.3;
    document.getElementById("menu-contato").style.opacity = 0.3;
}

function menuCadastro(){
    document.getElementById("menu-login").style.opacity = 0.3;
    document.getElementById("menu-planos").style.opacity = 0.3;
    document.getElementById("menu-loja").style.opacity = 0.3;
    document.getElementById("menu-parceiros").style.opacity = 0.3;
    document.getElementById("menu-contato").style.opacity = 0.3;
}

function menuParceiros(){
    document.getElementById("menu-login").style.opacity = 0.3;
    document.getElementById("menu-planos").style.opacity = 0.3;
    document.getElementById("menu-cadastro").style.opacity = 0.3;
    document.getElementById("menu-loja").style.opacity = 0.3;
    document.getElementById("menu-contato").style.opacity = 0.3;
}

function menuContato(){
    document.getElementById("menu-login").style.opacity = 0.3;
    document.getElementById("menu-planos").style.opacity = 0.3;
    document.getElementById("menu-loja").style.opacity = 0.3;
    document.getElementById("menu-parceiros").style.opacity = 0.3;
    document.getElementById("menu-cadastro").style.opacity = 0.3;
}

function foramenu(){
    document.getElementById("menu-login").style.opacity = 1;
    document.getElementById("menu-loja").style.opacity = 1;
    document.getElementById("menu-planos").style.opacity = 1;
    document.getElementById("menu-cadastro").style.opacity = 1;
    document.getElementById("menu-parceiros").style.opacity = 1;
    document.getElementById("menu-contato").style.opacity = 1;
    document.getElementById("menu").style.opacity = 1;
}

function loginShow(){
    document.getElementById("login").style.top = "30%";
    document.getElementById("login").style.backgroundColor = "white";
    document.getElementById("login").style.position = "fixed";

    document.getElementById("tela").style.zIndex = "9998";
    document.getElementById("tela").style.opacity = "0.8";
    
    souSocio = 1; // quer dizer que o botao sou socio foi pressionado
}

function loginSome(){
    document.getElementById("login").style.top = "-100%";
    document.getElementById("login").style.backgroundColor = "white";
    document.getElementById("login").style.position = "absolute";

    document.getElementById("tela").style.zIndex = "0";
    document.getElementById("tela").style.opacity = "0";

    souSocio = 0; // quer dizer que o botao sou socio foi despressionado
}

//function contatoTela(){
// window.screenY = 1000;
//}

