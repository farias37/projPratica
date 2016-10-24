<html>
<meta charset="utf-8">
    <title>Loja Oficial Porussia Dortmund</title>
    <head>
        
        <!-- Jquery rolagem -->
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.5.2/jquery.min.js"></script>
<script type="text/javascript">// <![CDATA[
$(document).ready(function() {
function filterPath(string) {
return string
.replace(/^\//,'')
.replace(/(index|default).[a-zA-Z]{3,4}$/,'')
.replace(/\/$/,'');
}
$('a[href*=#]').each(function() {
if ( filterPath(location.pathname) == filterPath(this.pathname)
&& location.hostname == this.hostname
&& this.hash.replace(/#/,'') ) {
var $targetId = $(this.hash), $targetAnchor = $('[name=' + this.hash.slice(1) +']');
var $target = $targetId.length ? $targetId : $targetAnchor.length ? $targetAnchor : false;
if ($target) {
var targetOffset = $target.offset().top;
$(this).click(function() {
$('html, body').animate({scrollTop: targetOffset}, 300);
return false;
});
}
}
});
});
// ]]></script>
        
        
        <link rel="stylesheet" type="text/css" href="loja.css">
        <link rel="shortcut icon" href="favicon-1.png">
        <script type="text/javascript" src="home.js"></script>
        
        
        
        

    </head>
    <body onscroll="barraMenu()" onload="font()">

    <div id="tela" onclick="loginSome()"></div>
    <div id="login">
    Login
    
    <hr>
    <div id="form-login">Login
        <form action="validarAcesso.php" method="post">
            <li><input type="text" class="login" placeholder="Login"></li>
            <br>
            <li><label class="lbl-senha-login">Senha</label></li>
            <br>
            <li><input type="password" class="senha-login" placeholder="Senha"></li>
            <br>
            <li><input type="submit" class="submit-login" value="LOGAR"></li>
            
        </form>
        </div>    
    </div>


        <div id="fundo">
            <div id="rodape">
                <div id="logo-rodape"></div>
                <div id="escrito-parceiros">Parceiros:</div>
                    <div id="parceiros">
                        <a href="http://www.matera.com/br/"><div id="matera"></div></a>
                        <a href="http://www2/u16180/php/projeto/"><div id="grademanager">Grade Manager</div></a>
                    </div>
            </div>
            
            
        </div>
        
        <div id="tudo">
            <div id="slogan">Loja Oficial do time</div>
<!--        <div id="pic-time"></div>-->
       
    </div>
        
        <div id="produtos"></div>





     <div id="head">
        <div id="head-branco">
            <div id="head-vermelho">
                <div id="nome">
                </div>
            </div>
            <div id="menu" onmouseover="menu()" onmouseout="foramenu()">
                <div id="menu-login" onmouseover="menuLogin()">LOGIN</div>
                <div id="menu-loja" onmouseover="menuLoja()">LOJA</div>
                <div id="menu-planos" onmouseover="menuPlanos()">PLANOS</div>
                <div id="menu-cadastro" onmouseover="menuCadastro()">CADASTRO</div>
                <div id="menu-parceiros" onmouseover="menuParceiros()">PARCEIROS</div>
                <div id="menu-contato" onmouseover="menuContato()">CONTATO</div>
                
                
            </div>
            
            </div>
            <div id="menuCategorias"></div>
        </div>
        
        <div id="logo"></div>



    </body>
    
</html>