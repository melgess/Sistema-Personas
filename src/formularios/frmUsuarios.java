/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package formularios;

/**
 *
 * @author Melges
 */
public class frmUsuarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form formulariosUsuarios
     */
    public frmUsuarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        txtPerfil = new javax.swing.JLabel();
        comboBoxPerfil = new javax.swing.JComboBox<>();
        txtIdUsuario = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        txtSenha = new javax.swing.JLabel();
        inputIdUsuario = new javax.swing.JTextField();
        inputNome = new javax.swing.JTextField();
        txtConfirmaSenha = new javax.swing.JLabel();
        inputSenha = new javax.swing.JPasswordField();
        inputConfirmaSenha = new javax.swing.JPasswordField();
        btnIrParaPrimeiroCadastro = new javax.swing.JButton();
        btnVoltarUmCadastro = new javax.swing.JButton();
        btnAvancarUmCadastro = new javax.swing.JButton();
        btnIrParaUltimoCadastro = new javax.swing.JButton();
        btnAdicionarCadastro = new javax.swing.JButton();
        btnEditarCadastro = new javax.swing.JButton();
        btnSalvarCadastro = new javax.swing.JButton();
        btnExcluirCadastro = new javax.swing.JButton();
        btnCancelarCadastro = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuarios:");

        txtPerfil.setText("Perfil:");

        comboBoxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Colaborador" }));
        comboBoxPerfil.setEnabled(false);
        comboBoxPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPerfilActionPerformed(evt);
            }
        });

        txtIdUsuario.setText("ID Usuário:");

        txtNome.setText("Nome:");

        txtSenha.setText("Senha:");

        inputIdUsuario.setEnabled(false);
        inputIdUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdUsuarioActionPerformed(evt);
            }
        });

        inputNome.setEnabled(false);

        txtConfirmaSenha.setText("Cofirmar Senha:");

        inputSenha.setEnabled(false);
        inputSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSenhaActionPerformed(evt);
            }
        });

        inputConfirmaSenha.setEnabled(false);
        inputConfirmaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputConfirmaSenhaActionPerformed(evt);
            }
        });

        btnIrParaPrimeiroCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-esquerda-2-50 (1).png"))); // NOI18N
        btnIrParaPrimeiroCadastro.setToolTipText("Navegar para o primeiro cadastro");

        btnVoltarUmCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-voltar-50.png"))); // NOI18N
        btnVoltarUmCadastro.setToolTipText("Navegar para o cadastro anterior");

        btnAvancarUmCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-avançar-50.png"))); // NOI18N
        btnAvancarUmCadastro.setToolTipText("Navegar para o pr[oximo cadastro");

        btnIrParaUltimoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-direita-2-50.png"))); // NOI18N
        btnIrParaUltimoCadastro.setToolTipText("Navegar para o último cadastro");

        btnAdicionarCadastro.setText("Novo");
        btnAdicionarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCadastroActionPerformed(evt);
            }
        });

        btnEditarCadastro.setText("Editar");
        btnEditarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCadastroActionPerformed(evt);
            }
        });

        btnSalvarCadastro.setText("Salvar");
        btnSalvarCadastro.setEnabled(false);
        btnSalvarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadastroActionPerformed(evt);
            }
        });

        btnExcluirCadastro.setText("Excluir");

        btnCancelarCadastro.setText("Cancelar");
        btnCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCadastroActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPerfil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputIdUsuario))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome)
                                    .addComponent(txtSenha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputSenha)
                                    .addComponent(inputNome)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtConfirmaSenha)
                                .addGap(18, 18, 18)
                                .addComponent(inputConfirmaSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)))
                        .addGap(150, 150, 150))))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnIrParaPrimeiroCadastro)
                .addGap(18, 18, 18)
                .addComponent(btnVoltarUmCadastro)
                .addGap(18, 18, 18)
                .addComponent(btnAvancarUmCadastro)
                .addGap(18, 18, 18)
                .addComponent(btnIrParaUltimoCadastro)
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdicionarCadastro)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarCadastro)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvarCadastro))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnExcluirCadastro)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPerfil)
                    .addComponent(comboBoxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdicionarCadastro)
                            .addComponent(btnEditarCadastro)
                            .addComponent(btnSalvarCadastro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExcluirCadastro)
                            .addComponent(btnCancelarCadastro)
                            .addComponent(btnPesquisar))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdUsuario)
                            .addComponent(inputIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome)
                            .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSenha)
                            .addComponent(inputSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtConfirmaSenha)
                            .addComponent(inputConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIrParaPrimeiroCadastro)
                            .addComponent(btnVoltarUmCadastro)
                            .addComponent(btnAvancarUmCadastro)
                            .addComponent(btnIrParaUltimoCadastro))
                        .addGap(28, 28, 28))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxPerfilActionPerformed

    private void inputIdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIdUsuarioActionPerformed

    private void inputSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSenhaActionPerformed

    private void inputConfirmaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputConfirmaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputConfirmaSenhaActionPerformed

    private void btnAdicionarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCadastroActionPerformed
        btnIrParaPrimeiroCadastro.setEnabled(false);
        btnVoltarUmCadastro.setEnabled(false);
        btnAvancarUmCadastro.setEnabled(false);
        btnIrParaUltimoCadastro.setEnabled(false);
        btnAdicionarCadastro.setEnabled(false);
        btnEditarCadastro.setEnabled(false);
        btnExcluirCadastro.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnSalvarCadastro.setEnabled(true);
        btnCancelarCadastro.setEnabled(true);
        
        //caixas de texto 
        inputIdUsuario.setEnabled(true);
        inputNome.setEnabled(true);
        inputSenha.setEnabled(true);
        inputConfirmaSenha.setEnabled(true);
        comboBoxPerfil.setEnabled(true);
        
        //limpar os campos 
        inputIdUsuario.setText("");
        inputNome.setText("");
        inputSenha.setText("");
        inputConfirmaSenha.setText("");
        comboBoxPerfil.setSelectedIndex(0);
                
        
    }//GEN-LAST:event_btnAdicionarCadastroActionPerformed

    private void btnSalvarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadastroActionPerformed
        btnIrParaPrimeiroCadastro.setEnabled(true);
        btnVoltarUmCadastro.setEnabled(true);
        btnAvancarUmCadastro.setEnabled(true);
        btnIrParaUltimoCadastro.setEnabled(true);
        btnAdicionarCadastro.setEnabled(true);
        btnEditarCadastro.setEnabled(true);
        btnExcluirCadastro.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvarCadastro.setEnabled(false);
        btnCancelarCadastro.setEnabled(false);
        
        //desabilitar os campos 
         
        inputIdUsuario.setEnabled(false);
        inputNome.setEnabled(false);
        inputSenha.setEnabled(false);
        inputConfirmaSenha.setEnabled(false);
        comboBoxPerfil.setEnabled(false );
        
        inputIdUsuario.requestFocus();
        
    }//GEN-LAST:event_btnSalvarCadastroActionPerformed

    private void btnCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCadastroActionPerformed
        btnIrParaPrimeiroCadastro.setEnabled(true);
        btnVoltarUmCadastro.setEnabled(true);
        btnAvancarUmCadastro.setEnabled(true);
        btnIrParaUltimoCadastro.setEnabled(true);
        btnAdicionarCadastro.setEnabled(true);
        btnEditarCadastro.setEnabled(true);
        btnExcluirCadastro.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvarCadastro.setEnabled(false);
        btnCancelarCadastro.setEnabled(false);
    }//GEN-LAST:event_btnCancelarCadastroActionPerformed

    private void btnEditarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCadastroActionPerformed
        btnIrParaPrimeiroCadastro.setEnabled(false);
        btnVoltarUmCadastro.setEnabled(false);
        btnAvancarUmCadastro.setEnabled(false);
        btnIrParaUltimoCadastro.setEnabled(false);
        btnAdicionarCadastro.setEnabled(false);
        btnEditarCadastro.setEnabled(false);
        btnExcluirCadastro.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnSalvarCadastro.setEnabled(true);
        btnCancelarCadastro.setEnabled(true);
        
        //desabilitar os campos 
         
        
        inputNome.setEnabled(true);
        inputSenha.setEnabled(true);
        inputConfirmaSenha.setEnabled(true);
        comboBoxPerfil.setEnabled(true );
        
        inputNome.requestFocus();
    }//GEN-LAST:event_btnEditarCadastroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarCadastro;
    private javax.swing.JButton btnAvancarUmCadastro;
    private javax.swing.JButton btnCancelarCadastro;
    private javax.swing.JButton btnEditarCadastro;
    private javax.swing.JButton btnExcluirCadastro;
    private javax.swing.JButton btnIrParaPrimeiroCadastro;
    private javax.swing.JButton btnIrParaUltimoCadastro;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvarCadastro;
    private javax.swing.JButton btnVoltarUmCadastro;
    private javax.swing.JComboBox<String> comboBoxPerfil;
    private javax.swing.JPasswordField inputConfirmaSenha;
    private javax.swing.JTextField inputIdUsuario;
    private javax.swing.JTextField inputNome;
    private javax.swing.JPasswordField inputSenha;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel txtConfirmaSenha;
    private javax.swing.JLabel txtIdUsuario;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtPerfil;
    private javax.swing.JLabel txtSenha;
    // End of variables declaration//GEN-END:variables
}
