/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Objects;
import model.produto;

/**
 *
 * @author u15195
 */
public class produtoData {
    Conexao con;
    
    //Função Incluir.
    //realiza a conexão.
    //passa a linha de código/comandos a ser realizada no banco de dados.
    //verifica se incluiu.
    //caso algo de errado, lança execção.
    public boolean Incluir(produto objProd) throws Exception{
        con = new Conexao();
        String sql = "insert into produto values (?,?,?,?,?)";
        PreparedStatement ps = con.getConexao().prepareStatement(sql);
        ps.setString(1, objProd.getNome());
        ps.setFloat(2, objProd.getPreco());
        ps.setString(3, objProd.getDescricao());
        ps.setString(4, objProd.getEndImagem());
        ps.setString(5, objProd.getEndImagem2());
        if(ps.executeUpdate() > 0)
          return true;
        else
          return false;
    }
    
    //Função pesquisar.
    //realiza a conexão.
    //passa a linha de código/comandos a ser realizada no banco de dados.
    //preenche o objeto com as informações do banco de dados.
    //caso algo de errado, lança execção.
    public produto Pesquisar(int codProduto) throws Exception{
        con = new Conexao();
        produto objProd = null;
        String SQL = "select * from produto where codProduto = ?";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setInt(1, codProduto);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            objProd = new produto();
            objProd.setNome(rs.getString("nome"));
            objProd.setPreco(rs.getFloat("preco"));
            objProd.setDescricao(rs.getString("descricao"));
            objProd.setEndImagem(rs.getString("endImagem"));
            objProd.setEndImagem2(rs.getString("endImagem2"));
        }
        return objProd;      
    }
    
    //Função editar.
    //realiza a conexão.
    //passa a linha de código/comandos a ser realizada no banco de dados.
    //edita as informações do banco de dados com as do objeto.
    //caso algo de errado, lança execção.
    public boolean Editar(produto objProd) throws Exception{
        con = new Conexao();
        String SQL = "update produto set nome = ?, preco = ?, descricao = ?, endImagem = ?, endImagem2 = ? where codProduto = ?";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setString(1, objProd.getNome());
        ps.setFloat(2, objProd.getPreco());
        ps.setString(3, objProd.getDescricao());
        ps.setString(4, objProd.getEndImagem());
        ps.setString(5, objProd.getEndImagem2());
        ps.setInt(6, objProd.getCodProduto());
        if(ps.executeUpdate() > 0)
          return true;
        else
          return false;
    }
    
    //Função excluir.
    //realiza a conexão.
    //passa a linha de código/comandos a ser realizada no banco de dados.
    //edita as informações do banco de dados com as do objeto.
    //verifica de excluiu.
    //caso algo de errado, lança execção.
    public boolean Excluir(int codProduto) throws Exception{
        con = new Conexao();
        String SQL = "delete from produto where codProduto = ?";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setInt(1, codProduto);
        if(ps.executeUpdate() > 0)
          return true;
        else
          return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.con);
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
        final produtoData other = (produtoData) obj;
        if (!Objects.equals(this.con, other.con)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "produtoData{" + "con=" + con + '}';
    }
    
    
}