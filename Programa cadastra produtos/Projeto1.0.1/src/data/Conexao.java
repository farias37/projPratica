/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author u15195
 */

//Classe conexão.
//informações do banco de dados e da conta.
public class Conexao {
    private Connection conexao;
    public Conexao() throws Exception{
       Class.forName("net.sourceforge.jtds.jdbc.Driver");
       String url = "jdbc:jtds:sqlserver://REGULUS:1433/BDGRUPO3";
       conexao = DriverManager.getConnection(url,"BDGRUPO3","BDGRUPO3");
   }
   
   //Função que retorna a conexão.
   public Connection getConexao(){
       return conexao;
   }
}
