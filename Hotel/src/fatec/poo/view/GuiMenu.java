/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

/**
 *
 * @author mateu
 */
public class GuiMenu extends javax.swing.JFrame {

    /**
     * Creates new form GuiMenu
     */
    public GuiMenu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        MiQuarto = new javax.swing.JMenuItem();
        MiRecepcionista = new javax.swing.JMenuItem();
        MiHospede = new javax.swing.JMenuItem();
        MiServicoDeQuarto = new javax.swing.JMenuItem();
        MenuRegistro = new javax.swing.JMenu();
        MiReservarLiberar = new javax.swing.JMenuItem();
        MITotalFaturadoTipoQuarto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel POO");

        MenuCadastro.setText("Cadastro");

        MiQuarto.setText("Quarto");
        MiQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiQuartoActionPerformed(evt);
            }
        });
        MenuCadastro.add(MiQuarto);

        MiRecepcionista.setText("Recepcionista");
        MiRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiRecepcionistaActionPerformed(evt);
            }
        });
        MenuCadastro.add(MiRecepcionista);

        MiHospede.setText("Hospede");
        MiHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiHospedeActionPerformed(evt);
            }
        });
        MenuCadastro.add(MiHospede);

        MiServicoDeQuarto.setText("Serviço de Quarto");
        MiServicoDeQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiServicoDeQuartoActionPerformed(evt);
            }
        });
        MenuCadastro.add(MiServicoDeQuarto);

        jMenuBar1.add(MenuCadastro);

        MenuRegistro.setText("Registro");

        MiReservarLiberar.setText("Reservar/Liberar");
        MiReservarLiberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiReservarLiberarActionPerformed(evt);
            }
        });
        MenuRegistro.add(MiReservarLiberar);

        MITotalFaturadoTipoQuarto.setText("Total Faturado por Tipo de quarto");
        MITotalFaturadoTipoQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MITotalFaturadoTipoQuartoActionPerformed(evt);
            }
        });
        MenuRegistro.add(MITotalFaturadoTipoQuarto);

        jMenuBar1.add(MenuRegistro);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MiQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiQuartoActionPerformed
        GuiCadastroQuarto objCadastroQuarto;
        objCadastroQuarto = new GuiCadastroQuarto();
        objCadastroQuarto.setVisible(true);
    }//GEN-LAST:event_MiQuartoActionPerformed

    private void MiRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiRecepcionistaActionPerformed
        GuiCadastroRecepcionista objRecepcionista;
        objRecepcionista = new GuiCadastroRecepcionista();
        objRecepcionista.setVisible(true);
    }//GEN-LAST:event_MiRecepcionistaActionPerformed

    private void MiHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiHospedeActionPerformed
        GuiCadastroHospede objHospede;
        objHospede = new GuiCadastroHospede();
        objHospede.setVisible(true);
    }//GEN-LAST:event_MiHospedeActionPerformed

    private void MiServicoDeQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiServicoDeQuartoActionPerformed
        GuiServicoDeQuarto objServicoQuarto;
        objServicoQuarto = new GuiServicoDeQuarto();
        objServicoQuarto.setVisible(true);
    }//GEN-LAST:event_MiServicoDeQuartoActionPerformed

    private void MiReservarLiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiReservarLiberarActionPerformed
        GuiCadastroReservaLiberacaoQuarto objLiberaQuarto;
        objLiberaQuarto = new GuiCadastroReservaLiberacaoQuarto();
        objLiberaQuarto.setVisible(true);
    }//GEN-LAST:event_MiReservarLiberarActionPerformed

    private void MITotalFaturadoTipoQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MITotalFaturadoTipoQuartoActionPerformed
        GuiTotalFaturadoTipoQuarto objTotalFaturadoTipoQuarto;
        objTotalFaturadoTipoQuarto = new GuiTotalFaturadoTipoQuarto();
        objTotalFaturadoTipoQuarto.setVisible(true);
    }//GEN-LAST:event_MITotalFaturadoTipoQuartoActionPerformed

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
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MITotalFaturadoTipoQuarto;
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenu MenuRegistro;
    private javax.swing.JMenuItem MiHospede;
    private javax.swing.JMenuItem MiQuarto;
    private javax.swing.JMenuItem MiRecepcionista;
    private javax.swing.JMenuItem MiReservarLiberar;
    private javax.swing.JMenuItem MiServicoDeQuarto;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
