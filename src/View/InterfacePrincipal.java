/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
package View;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class InterfacePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form InterfacePrincipal
     */
    public InterfacePrincipal() {
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

        msgSair = new javax.swing.JDialog();
        painelSair = new javax.swing.JPanel();
        btSim = new javax.swing.JButton();
        btNao = new javax.swing.JButton();
        painelPrincipal = new javax.swing.JPanel();
        btConsulta = new javax.swing.JButton();
        btReserva = new javax.swing.JButton();
        btGerenciamento = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        menuGeral = new javax.swing.JMenuBar();
        menuConsulta = new javax.swing.JMenu();
        menuConsultar = new javax.swing.JMenuItem();
        menuHospedar = new javax.swing.JMenuItem();
        menuGerenciamento = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenuItem();

        msgSair.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        msgSair.setTitle("Deseja realmente sair?");
        msgSair.setLocation(new java.awt.Point(500, 250));
        msgSair.setMinimumSize(new java.awt.Dimension(190, 90));
        msgSair.setPreferredSize(new java.awt.Dimension(190, 90));
        msgSair.setResizable(false);

        painelSair.setPreferredSize(new java.awt.Dimension(45, 45));

        btSim.setText("Sim");
        btSim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimActionPerformed(evt);
            }
        });

        btNao.setText("Não");
        btNao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelSairLayout = new javax.swing.GroupLayout(painelSair);
        painelSair.setLayout(painelSairLayout);
        painelSairLayout.setHorizontalGroup(
            painelSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSairLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btSim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btNao)
                .addGap(24, 24, 24))
        );
        painelSairLayout.setVerticalGroup(
            painelSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSairLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSim)
                    .addComponent(btNao))
                .addContainerGap())
        );

        javax.swing.GroupLayout msgSairLayout = new javax.swing.GroupLayout(msgSair.getContentPane());
        msgSair.getContentPane().setLayout(msgSairLayout);
        msgSairLayout.setHorizontalGroup(
            msgSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelSair, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        msgSairLayout.setVerticalGroup(
            msgSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menu Principal");
        setLocation(new java.awt.Point(500, 250));

        painelPrincipal.setToolTipText("");

        btConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consulta.png"))); // NOI18N
        btConsulta.setText("Consulta de quartos");
        btConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaActionPerformed(evt);
            }
        });

        btReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon-reserve.png"))); // NOI18N
        btReserva.setText("Reservar quarto");
        btReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btReserva.setMaximumSize(new java.awt.Dimension(389, 265));
        btReserva.setMinimumSize(new java.awt.Dimension(389, 265));
        btReserva.setPreferredSize(new java.awt.Dimension(389, 265));
        btReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReservaActionPerformed(evt);
            }
        });

        btGerenciamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconmonstr-gear-10-icon-256.png"))); // NOI18N
        btGerenciamento.setText("Gerenciamento");
        btGerenciamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btGerenciamento.setMaximumSize(new java.awt.Dimension(389, 265));
        btGerenciamento.setMinimumSize(new java.awt.Dimension(389, 265));
        btGerenciamento.setPreferredSize(new java.awt.Dimension(389, 265));
        btGerenciamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerenciamentoActionPerformed(evt);
            }
        });

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Error-icon.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/hotel.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btGerenciamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSair)))
                .addContainerGap())
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(btConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(35, 35, 35)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(36, 36, 36)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btGerenciamento, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSair)
                .addGap(6, 6, 6))
        );

        menuGeral.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuConsulta.setText("Arquivo");

        menuConsultar.setText("Consulta de quartos");
        menuConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarActionPerformed(evt);
            }
        });
        menuConsulta.add(menuConsultar);

        menuHospedar.setText("Reservar quarto");
        menuHospedar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuHospedar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHospedarActionPerformed(evt);
            }
        });
        menuConsulta.add(menuHospedar);

        menuGerenciamento.setText("Gerenciamento");
        menuGerenciamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuGerenciamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGerenciamentoActionPerformed(evt);
            }
        });
        menuConsulta.add(menuGerenciamento);

        menuSair.setText("Sair");
        menuSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuConsulta.add(menuSair);

        menuGeral.add(menuConsulta);

        menuAjuda.setText("Ajuda");

        menuSobre.setText("Sobre");
        menuSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(menuSobre);

        menuGeral.add(menuAjuda);

        setJMenuBar(menuGeral);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        msgSair.setVisible(true);
    }//GEN-LAST:event_btSairActionPerformed

    private void btConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaActionPerformed
        ConsultaQuartos exibir=new ConsultaQuartos();
        exibir.setVisible(true);
    }//GEN-LAST:event_btConsultaActionPerformed

    private void menuConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarActionPerformed
        btConsultaActionPerformed(evt);
    }//GEN-LAST:event_menuConsultarActionPerformed

    private void btReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReservaActionPerformed
        ReservaFrame exibir=new ReservaFrame();
        exibir.frameConsulta.setVisible(true);
    }//GEN-LAST:event_btReservaActionPerformed

    private void menuHospedarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHospedarActionPerformed
        btReservaActionPerformed(evt);
    }//GEN-LAST:event_menuHospedarActionPerformed

    private void btGerenciamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGerenciamentoActionPerformed
        GerenciamentoFrame exibir= new GerenciamentoFrame();
        exibir.setVisible(true);
    }//GEN-LAST:event_btGerenciamentoActionPerformed

    private void menuGerenciamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGerenciamentoActionPerformed
        btGerenciamentoActionPerformed(evt);
    }//GEN-LAST:event_menuGerenciamentoActionPerformed

    private void btSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimActionPerformed
        msgSair.dispose();
        this.dispose();
    }//GEN-LAST:event_btSimActionPerformed

    private void btNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNaoActionPerformed
        msgSair.dispose();
    }//GEN-LAST:event_btNaoActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        this.btSairActionPerformed(evt);
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
         JOptionPane.showMessageDialog(null,"Projeto de Laboratorio de Programação");
    }//GEN-LAST:event_menuSobreActionPerformed

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
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfacePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsulta;
    private javax.swing.JButton btGerenciamento;
    private javax.swing.JButton btNao;
    private javax.swing.JButton btReserva;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuConsulta;
    private javax.swing.JMenuItem menuConsultar;
    private javax.swing.JMenuBar menuGeral;
    private javax.swing.JMenuItem menuGerenciamento;
    private javax.swing.JMenuItem menuHospedar;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuSobre;
    private javax.swing.JDialog msgSair;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelSair;
    // End of variables declaration//GEN-END:variables
}
