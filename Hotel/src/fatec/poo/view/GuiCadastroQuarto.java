/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoQuarto;
import fatec.poo.model.Quarto;
import javax.swing.JOptionPane;
/**
 *
 * @author mateu
 */
public class GuiCadastroQuarto extends javax.swing.JFrame {

    /**
     * Creates new form GuiCadastroQuarto
     */
    public GuiCadastroQuarto() {
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

        btngrpTipo = new javax.swing.ButtonGroup();
        pnlTipo = new javax.swing.JPanel();
        rbtnCasal = new javax.swing.JRadioButton();
        rbtnSolteiro = new javax.swing.JRadioButton();
        lblNquarto = new javax.swing.JLabel();
        lblValorDiaria = new javax.swing.JLabel();
        txtNquarto = new javax.swing.JTextField();
        txtValorDiaria = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro do Quarto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));

        btngrpTipo.add(rbtnCasal);
        rbtnCasal.setText("Casal");
        rbtnCasal.setEnabled(false);

        btngrpTipo.add(rbtnSolteiro);
        rbtnSolteiro.setSelected(true);
        rbtnSolteiro.setText("Solteiro");
        rbtnSolteiro.setEnabled(false);

        javax.swing.GroupLayout pnlTipoLayout = new javax.swing.GroupLayout(pnlTipo);
        pnlTipo.setLayout(pnlTipoLayout);
        pnlTipoLayout.setHorizontalGroup(
            pnlTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTipoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnSolteiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(rbtnCasal)
                .addGap(32, 32, 32))
        );
        pnlTipoLayout.setVerticalGroup(
            pnlTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTipoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnSolteiro)
                    .addComponent(rbtnCasal))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        lblNquarto.setText("Nº Quarto");

        lblValorDiaria.setText("Valor Diária");

        txtValorDiaria.setEnabled(false);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/rem.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValorDiaria)
                                    .addComponent(lblNquarto))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValorDiaria)
                                    .addComponent(txtNquarto)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNquarto)
                    .addComponent(txtNquarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorDiaria)
                    .addComponent(txtValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("BD2211023","BD2211023");//usuario e senha
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@192.168.1.6:1521:xe");
        daoQuarto = new DaoQuarto(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        int numeroQuarto = Integer.parseInt(txtNquarto.getText());
        double valorDiaria = Double.parseDouble(txtValorDiaria.getText());
        
        String tipoQuarto = "";
        if (rbtnCasal.isSelected()) {
            tipoQuarto = "Casal";
        } else if (rbtnSolteiro.isSelected()) {
            tipoQuarto = "Solteiro";
        }
        
        quarto = new Quarto(numeroQuarto, tipoQuarto, valorDiaria);
        daoQuarto.inserir(quarto);
         
        txtNquarto.setText("");
        txtValorDiaria.setText("");      
        btnInserir.setEnabled(false);
        txtNquarto.setEnabled(true);
        txtValorDiaria.setEnabled(false);
        rbtnCasal.setEnabled(false);
        rbtnSolteiro.setEnabled(false);
        txtNquarto.requestFocus();
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            int codigo = Integer.parseInt(txtNquarto.getText());

       quarto = null;
       quarto = daoQuarto.consultar(Integer.parseInt(txtNquarto.getText()));       
       if (quarto == null){//não encontrou o objeto na BD
           txtNquarto.setEnabled(false);
           txtValorDiaria.setEnabled(true);
           rbtnCasal.setEnabled(true);
           rbtnSolteiro.setEnabled(true);
           txtValorDiaria.requestFocus();
           
           btnConsultar.setEnabled(false);
           btnInserir.setEnabled(true);
           btnAlterar.setEnabled(false);
           btnExcluir.setEnabled(false);
       }
       else{ //encontrou o objeto na BD
          txtValorDiaria.setText(String.valueOf(quarto.getValorDiaria()));
       
          txtNquarto.setEnabled(false); 
          txtValorDiaria.setEnabled(true);
          rbtnCasal.setEnabled(true);
          rbtnSolteiro.setEnabled(true);
          txtValorDiaria.requestFocus();
          
          btnConsultar.setEnabled(false);
          btnInserir.setEnabled(false);
          btnAlterar.setEnabled(true);
          btnExcluir.setEnabled(true);
       }    
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Formato errado, o numero do quarto deve ser valido.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
           }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?") == 0) { // Sim
            String textoValorDiaria = txtValorDiaria.getText();
            // Converte o texto para double e chama o método setValorDiaria
            double valorDiaria = Double.parseDouble(textoValorDiaria);
            quarto.setValorDiaria(valorDiaria);
            daoQuarto.alterar(quarto);
        }         
        txtNquarto.setText("");
        txtValorDiaria.setText("");
        txtNquarto.setEnabled(true); 
        rbtnCasal.setEnabled(false);
        rbtnSolteiro.setEnabled(false);
        txtValorDiaria.setEnabled(false);
        txtNquarto.requestFocus();
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);       
       
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
    if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão?") == 0){
            daoQuarto.excluir(quarto); 
            
            txtNquarto.setText("");
            txtValorDiaria.setText("");
            txtNquarto.setEnabled(true); 
            txtValorDiaria.setEnabled(false);
            rbtnCasal.setEnabled(false);
            rbtnSolteiro.setEnabled(false);
            txtNquarto.requestFocus();
            btnConsultar.setEnabled(true);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
    }
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup btngrpTipo;
    private javax.swing.JLabel lblNquarto;
    private javax.swing.JLabel lblValorDiaria;
    private javax.swing.JPanel pnlTipo;
    private javax.swing.JRadioButton rbtnCasal;
    private javax.swing.JRadioButton rbtnSolteiro;
    private javax.swing.JTextField txtNquarto;
    private javax.swing.JTextField txtValorDiaria;
    // End of variables declaration//GEN-END:variables
    private DaoQuarto daoQuarto=null;
    private Quarto quarto=null;
    private Conexao conexao=null;
}