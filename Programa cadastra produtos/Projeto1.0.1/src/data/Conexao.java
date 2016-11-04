/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.conexao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Conexao other = (Conexao) obj;
        if (!Objects.equals(this.conexao, other.conexao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conexao{" + "conexao=" + conexao + '}';
    }
   
   
}
