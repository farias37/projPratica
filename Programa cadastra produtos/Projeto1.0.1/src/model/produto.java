/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author u15195
 */

//Produtos iguais os da tabela produto do banco de dados.
public class produto {
    private int codProduto;
    private String nome;
    private float preco;
    private String descricao;
    private String endImagem;
    private String endImagem2;

    //construtor nulo.
    //para caso eu tentar instanciar um objeto dessa classe.
    public produto() {
    }

    //construtor com parâmetros.
    //para passar parâmetros pro objeto.
    public produto(int codProduto, String nome, float preco, String descricao, String endImagem) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.endImagem = endImagem;
    }

    //Getters e Setters.
    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }
    
        public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndImagem() {
        return endImagem;
    }

    public void setEndImagem(String endImagem) {
        this.endImagem = endImagem;
    }
    
    public String getEndImagem2() {
        return endImagem2;
    }

    public void setEndImagem2(String endImagem2) {
        this.endImagem2 = endImagem2;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.codProduto;
        hash = 19 * hash + Objects.hashCode(this.nome);
        hash = 19 * hash + Float.floatToIntBits(this.preco);
        hash = 19 * hash + Objects.hashCode(this.descricao);
        hash = 19 * hash + Objects.hashCode(this.endImagem);
        hash = 19 * hash + Objects.hashCode(this.endImagem2);
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
        final produto other = (produto) obj;
        if (this.codProduto != other.codProduto) {
            return false;
        }
        if (Float.floatToIntBits(this.preco) != Float.floatToIntBits(other.preco)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.endImagem, other.endImagem)) {
            return false;
        }
        if (!Objects.equals(this.endImagem2, other.endImagem2)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "produto{" + "codProduto=" + codProduto + ", nome=" + nome + ", preco=" + preco + ", descricao=" + descricao + ", endImagem=" + endImagem + ", endImagem2=" + endImagem2 + '}';
    }
    
    
}
