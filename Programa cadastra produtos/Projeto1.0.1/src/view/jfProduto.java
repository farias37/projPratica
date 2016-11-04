/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import data.produtoData;
import java.util.Objects;
import javax.swing.JOptionPane;
import model.produto;

/**
 *
 * @author u15195
 */
public class jfProduto extends javax.swing.JFrame {
    private produtoData DAO;
    private produto objProd;
    private int acao;
    
    //construtor.
    public jfProduto() {
        initComponents();
        DAO = new produtoData(); // intancia o objeto para não ficar null, e não dar erro.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtCodProduto = new javax.swing.JTextField();
        jtNome = new javax.swing.JTextField();
        jtPreco = new javax.swing.JTextField();
        jtDescricao = new javax.swing.JTextField();
        jtEndImagem = new javax.swing.JTextField();
        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbPesquisar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtEndImagem2 = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código do produto");

        jLabel2.setText("Nome");

        jLabel3.setText("Preço");

        jLabel4.setText("Descriçao");

        jLabel5.setText("Endereço da imagem");

        jtNome.setEnabled(false);

        jtPreco.setEnabled(false);

        jtDescricao.setEnabled(false);

        jtEndImagem.setEnabled(false);

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.setEnabled(false);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.setEnabled(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jLabel6.setText("Endereço da imagem");

        jtEndImagem2.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbExcluir)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbCancelar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jtEndImagem2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtEndImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jbPesquisar))
                                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtDescricao))))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtEndImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtEndImagem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovo)
                    .addComponent(jbSalvar)
                    .addComponent(jbCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExcluir)
                    .addComponent(jbEditar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Clique do botão novo.
    //limpa os campos.
    //habilita e desabilita o que for necessário.
    //ativa ação 1 para saber que é um insert e não um update.
    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
       limparCampos();
       jtCodProduto.setEnabled(false);
       jtNome.setEnabled(true);
       jtPreco.setEnabled(true);
       jtDescricao.setEnabled(true);
       jtEndImagem.setEnabled(true);
       jtEndImagem2.setEnabled(true);
       
       jbNovo.setEnabled(false);
       jbSalvar.setEnabled(true);
       jbEditar.setEnabled(false);
       jbExcluir.setEnabled(false);
       jbPesquisar.setEnabled(false);
       jbCancelar.setEnabled(true);
       
       acao = 1;
    }//GEN-LAST:event_jbNovoActionPerformed

    //Clique do botão cancelar.
    //limpa os campos.
    //habilita e desabilita o que for necessário.
    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
       limparCampos();
       jtCodProduto.setEnabled(true);
       jtNome.setEnabled(false);
       jtPreco.setEnabled(false);
       jtDescricao.setEnabled(false);
       jtEndImagem.setEnabled(false);
       jtEndImagem2.setEnabled(false);
       
       jbNovo.setEnabled(true);
       jbSalvar.setEnabled(false);
       jbEditar.setEnabled(false);
       jbExcluir.setEnabled(false);
       jbPesquisar.setEnabled(true);
       jbCancelar.setEnabled(false);
    }//GEN-LAST:event_jbCancelarActionPerformed

    //Clique do botão salvar.
    //valida os campos, verificando se estão preenchidos.
    //se estiver preenchido e a ação for 1 (insert), preenche o objeto e mostra mensagem se foi ou não salvo.
    //se estiver preenchido e a ação for 2 (update), preenche o objeto e mostra mensagem se foi ou não editado.
    //simula o botão cancelar, para limpar os campos após incluir ou editar.
    //Caso de erro, mostra mensagem de erro.
    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        try{
        if (validarCampos()){
            if (acao == 1){
            if (preencherObjeto()){
                if (DAO.Incluir(objProd)){
                  JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                  jbCancelarActionPerformed(evt);
            }
        
        }else {
            JOptionPane.showMessageDialog(this, "Não foi possivel inserir o registro!");
        }
            }
            if (acao == 2){
                if (preencherObjeto2()){
                if (DAO.Editar(objProd)){
                  JOptionPane.showMessageDialog(this, "Editado com sucesso!");
                  jbCancelarActionPerformed(evt);
            }
        
        }else {
            JOptionPane.showMessageDialog(this, "Não foi possivel editar o registro!");
        }
            }
        }
        }catch(Exception erro){
            JOptionPane.showMessageDialog(this, "Erro: " + erro.getMessage());
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    //Clique do botão editar.
    //habilita e desabilita o que for necessário.
    //ativa ação 2 para saber que é um update e não um insert.
    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
       jtCodProduto.setEnabled(false);
       jtNome.setEnabled(true);
       jtPreco.setEnabled(true);
       jtDescricao.setEnabled(true);
       jtEndImagem.setEnabled(true);
       jtEndImagem2.setEnabled(true);
       
       jbNovo.setEnabled(false);
       jbSalvar.setEnabled(true);
       jbEditar.setEnabled(false);
       jbExcluir.setEnabled(false);
       jbPesquisar.setEnabled(false);
       jbCancelar.setEnabled(true);

       acao = 2;
    }//GEN-LAST:event_jbEditarActionPerformed

    //Clique do botão pesquisar.
    //verifica se o campo código do produto está preenchido
    //se estiver vazio, manda mensagem para usuário e redireciona o foco para o campo vazio.
    //Passa para a função pesquisar o valor digitado no campo do codigo.
    //se não for encontrado o registro, mostra menssagem para o usuário, limpa os campos e redireciona o foco.
    //se for encontrado, os campos recebem o conteúdo encontrado no banco de dados.
    //habilita e desabilita o que for necessário.
    //Caso de erro, mostra mensagem de erro.
    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
       try{ 
        if(jtCodProduto.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha o campo Código do produto");
            jtCodProduto.requestFocus();
        } else {
            produto objProd = DAO.Pesquisar(Integer.parseInt(jtCodProduto.getText()));
            if(objProd == null){
            JOptionPane.showMessageDialog(this, "Não foi possivel encontrar o registro!");
            //jtCodProduto.setText("");
            limparCampos();
            jtCodProduto.requestFocus();
            } else {
                jtNome.setText(objProd.getNome());
                jtPreco.setText(Float.toString(objProd.getPreco()));
                jtDescricao.setText(objProd.getDescricao());
                jtEndImagem.setText(objProd.getEndImagem());
                jtEndImagem2.setText(objProd.getEndImagem());
                jbEditar.setEnabled(true);
                jbCancelar.setEnabled(true);
                jbExcluir.setEnabled(true);
                jbPesquisar.setEnabled(true);
            }
        }
       }catch(Exception erro ){
           JOptionPane.showMessageDialog(this, "Erro: " + erro.getMessage());
       }
    }//GEN-LAST:event_jbPesquisarActionPerformed

    //Clique do botão excluir.
    //verifica se o campo código do produto está preenchido
    //se estiver vazio, manda mensagem para usuário e redireciona o foco para o campo vazio.
    //Passa para a função excluir o valor digitado no campo do codigo.
    //se for excluido, mostra mensagem, e simula o botão cancelar, para limpar os campos.
    //se não for excluido, mostra mensagem, e simula o botão cancelar, para limpar os campos.
    //Caso de erro, mostra mensagem de erro.
    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
       try{
        if(jtCodProduto.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Preencha o campo Código do produto");
       } else {
           if (DAO.Excluir(Integer.parseInt(jtCodProduto.getText()))){
           JOptionPane.showMessageDialog(this, "Registro excluído com sucesso!");
           jbCancelarActionPerformed(evt);
       } else {
           JOptionPane.showMessageDialog(this, "Não foi possível excluir o registro!");
           jbCancelarActionPerformed(evt);
        }
       }
       }catch (Exception erro){
           JOptionPane.showMessageDialog(this, "Erro: " + erro.getMessage());
       }
    }//GEN-LAST:event_jbExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jfProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTextField jtCodProduto;
    private javax.swing.JTextField jtDescricao;
    private javax.swing.JTextField jtEndImagem;
    private javax.swing.JTextField jtEndImagem2;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtPreco;
    // End of variables declaration//GEN-END:variables
    
    //Método que limpa os campos.
    //campos recebem vazio.
    public void limparCampos() {
      jtCodProduto.setText("");
      jtNome.setText("");
      jtPreco.setText("");
      jtDescricao.setText("");
      jtEndImagem.setText("");
      jtEndImagem2.setText("");
    }
    
    //Função que verifica se os campos estão preenchidos.
    //se estiver vazio, manda mensagem para usuário e redireciona o foco para o campo vazio.
    public boolean validarCampos(){
        if(jtNome.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha o campo Nome!");
            jtNome.requestFocus();
            return false;
        }
        
        if(jtPreco.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha o campo Preço!");
            jtPreco.requestFocus();
            return false;
        }
                
        if(jtDescricao.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha o campo Descrição!");
            jtDescricao.requestFocus();
            return false;
        }
        
        if(jtEndImagem.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha o campo Endereço da imagem!");
            jtEndImagem.requestFocus();
            return false;
        }
        
        if(jtEndImagem2.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha o campo Endereço da imagem!");
            jtEndImagem2.requestFocus();
            return false;
        }
        
        return true;
    }
    
    //Função que preenche o objeto com o conteúdo dos campos.
    //para a ação 1 (insert).
    public boolean preencherObjeto(){
        objProd = new produto();
        objProd.setNome(jtNome.getText());
        objProd.setPreco(Float.parseFloat(jtPreco.getText()));
        objProd.setDescricao(jtDescricao.getText());
        objProd.setEndImagem(jtEndImagem.getText());
        objProd.setEndImagem2(jtEndImagem2.getText());
        
        return true;
    }
    
    //Função que preenche o objeto com o conteúdo dos campos.
    //para a ação 2 (update).
    public boolean preencherObjeto2(){
        objProd = new produto();
        objProd.setCodProduto(Integer.parseInt(jtCodProduto.getText()));
        objProd.setNome(jtNome.getText());
        objProd.setPreco(Float.parseFloat(jtPreco.getText()));
        objProd.setDescricao(jtDescricao.getText());
        objProd.setEndImagem(jtEndImagem.getText());
        objProd.setEndImagem2(jtEndImagem2.getText());
        
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.DAO);
        hash = 83 * hash + Objects.hashCode(this.objProd);
        hash = 83 * hash + this.acao;
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
        final jfProduto other = (jfProduto) obj;
        if (this.acao != other.acao) {
            return false;
        }
        if (!Objects.equals(this.DAO, other.DAO)) {
            return false;
        }
        if (!Objects.equals(this.objProd, other.objProd)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jfProduto{" + "DAO=" + DAO + ", objProd=" + objProd + ", acao=" + acao + '}';
    }
    
    
}
