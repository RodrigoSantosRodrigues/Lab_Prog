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
import Controller.*;
import java.awt.Color;
import javax.swing.JOptionPane;
public class ConsultaQuartos extends javax.swing.JFrame {
    ConsultaController consulta=new ConsultaController();
    GerenciamentoController gerController=new GerenciamentoController();
    /**
     * Creates new form ConsultaQuartos
     */
    public ConsultaQuartos() {
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

        frameNumQuarto = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        campoNumQuarto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campoCategoria = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        campoStatus = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        campoDiaria = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btOk = new javax.swing.JButton();
        campoWf = new javax.swing.JTextField();
        campoAr = new javax.swing.JTextField();
        campoFrigobar = new javax.swing.JTextField();
        frameSelecionados = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        comboSelecionados = new javax.swing.JComboBox<>();
        btVoltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        giratorioNumQuarto = new javax.swing.JSpinner();
        btNumQuarto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        caixaTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        campoPreco = new javax.swing.JTextField();
        btConsultarTudo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        selecaoAr = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        selecaoWifi = new javax.swing.JCheckBox();
        selecaoFrigobar = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        frameNumQuarto.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        frameNumQuarto.setLocation(new java.awt.Point(500, 150));
        frameNumQuarto.setMinimumSize(new java.awt.Dimension(159, 480));
        frameNumQuarto.setResizable(false);

        jPanel2.setMinimumSize(new java.awt.Dimension(159, 400));

        jLabel8.setText("Número:");

        campoNumQuarto.setEditable(false);

        jLabel9.setText("Categoria:");

        campoCategoria.setEditable(false);

        jLabel10.setText("Status:");

        campoStatus.setEditable(false);

        jLabel11.setText("Diaria");

        campoDiaria.setEditable(false);

        jLabel12.setText("Wi-Fi:");

        jLabel13.setText("Ar-Condicionado:");

        jLabel14.setText("Frigobar:");

        btOk.setText("OK");
        btOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        campoWf.setEditable(false);
        campoWf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoWfActionPerformed(evt);
            }
        });

        campoAr.setEditable(false);
        campoAr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoArActionPerformed(evt);
            }
        });

        campoFrigobar.setEditable(false);
        campoFrigobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFrigobarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(campoNumQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCategoria)
                    .addComponent(campoStatus)
                    .addComponent(campoDiaria)
                    .addComponent(btOk, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(campoWf)
                    .addComponent(campoAr)
                    .addComponent(campoFrigobar))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNumQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(2, 2, 2)
                .addComponent(campoWf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(3, 3, 3)
                .addComponent(campoAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFrigobar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btOk)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frameNumQuartoLayout = new javax.swing.GroupLayout(frameNumQuarto.getContentPane());
        frameNumQuarto.getContentPane().setLayout(frameNumQuartoLayout);
        frameNumQuartoLayout.setHorizontalGroup(
            frameNumQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frameNumQuartoLayout.setVerticalGroup(
            frameNumQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, Short.MAX_VALUE)
        );

        frameSelecionados.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        frameSelecionados.setLocation(new java.awt.Point(500, 100));
        frameSelecionados.setMinimumSize(new java.awt.Dimension(150, 170));
        frameSelecionados.setName("Quartos disponíveis"); // NOI18N
        frameSelecionados.setResizable(false);

        jPanel3.setMinimumSize(new java.awt.Dimension(120, 121));

        comboSelecionados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btVoltar.setText("Voltar");
        btVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboSelecionados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                .addGap(0, 53, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboSelecionados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btVoltar)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frameSelecionadosLayout = new javax.swing.GroupLayout(frameSelecionados.getContentPane());
        frameSelecionados.getContentPane().setLayout(frameSelecionadosLayout);
        frameSelecionadosLayout.setHorizontalGroup(
            frameSelecionadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frameSelecionadosLayout.setVerticalGroup(
            frameSelecionadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Consultas");
        setLocation(new java.awt.Point(500, 100));
        setResizable(false);

        giratorioNumQuarto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btNumQuarto.setText("Consultar");
        btNumQuarto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNumQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNumQuartoActionPerformed(evt);
            }
        });

        jLabel2.setText("Número do quarto:");

        jLabel3.setText("Categoria do quarto:");

        caixaTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Duplo Solteiro", "Casal" }));
        caixaTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setText("Diária:");

        btConsultarTudo.setText("Consultar selecionados");
        btConsultarTudo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btConsultarTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarTudoActionPerformed(evt);
            }
        });

        jLabel5.setText("Ar-Condicionado:");

        selecaoAr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setText("Wi-Fi:");

        selecaoWifi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        selecaoFrigobar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setText("Frigobar:");

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Error-icon.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/consulta.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 198, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSair)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btConsultarTudo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btNumQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(giratorioNumQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(campoPreco, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(caixaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(selecaoFrigobar)
                                        .addComponent(selecaoAr)
                                        .addComponent(selecaoWifi)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(giratorioNumQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btNumQuarto)
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addComponent(caixaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(selecaoAr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selecaoWifi)))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(selecaoFrigobar))
                .addGap(18, 18, 18)
                .addComponent(btConsultarTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.gerController.verificarPrazoReserva();
        this.frameSelecionados.dispose();
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btConsultarTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarTudoActionPerformed
        String selecionados[]=new String[5];
        selecionados[0]=String.valueOf(this.caixaTipo.getSelectedItem());
        selecionados[1]=this.campoPreco.getText();
        if(this.selecaoAr.isSelected()){
            selecionados[2]="true";
        }
        else{
            selecionados[2]="false";
        }
        if(this.selecaoWifi.isSelected()){
            selecionados[3]="true";
        }
        else{
            selecionados[3]="false";
        }
        if(this.selecaoFrigobar.isSelected()){
            selecionados[4]="true";
        }
        else{
            selecionados[4]="false";
        }
        
        try{
            int num[]=consulta.consultarSelecionados(selecionados);
            for(int i=0;i<num.length;i++){
                comboSelecionados.addItem(String.valueOf(num[i]));
            }
            this.frameSelecionados.setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Não existem quartos com essas descrições!");
        }  
    }//GEN-LAST:event_btConsultarTudoActionPerformed

    private void btNumQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNumQuartoActionPerformed
        String vetor[]=consulta.consultarQuarto(Integer.parseInt(this.giratorioNumQuarto.getValue().toString()));
        try{
            this.campoNumQuarto.setText(vetor[0]);
            this.campoCategoria.setText(vetor[1]);
            this.campoDiaria.setText(vetor[2]);
            this.campoStatus.setText(vetor[3]);
            if(this.campoStatus.getText().equals("Desocupado")){
                this.campoStatus.setBackground(Color.green);
            }
            else{
                this.campoStatus.setBackground(Color.red);
            }
            if(vetor[4].equals("true")){
                this.campoAr.setText("Possui");
            }else{
                this.campoAr.setText("Não possui");
            }
            if(vetor[5].equals("true")){
                this.campoWf.setText("Possui");
            }else{
                this.campoWf.setText("Não possui");
            }

            if(vetor[6].equals("true")){
                this.campoFrigobar.setText("Possui");
            }else{
                this.campoFrigobar.setText("Não possui");
            }
            frameNumQuarto.setVisible(true);
        }
        catch(Exception e){}
    }//GEN-LAST:event_btNumQuartoActionPerformed

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        frameNumQuarto.dispose();
    }//GEN-LAST:event_btOkActionPerformed

    private void campoWfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoWfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoWfActionPerformed

    private void campoArActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoArActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoArActionPerformed

    private void campoFrigobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFrigobarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoFrigobarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.comboSelecionados.removeAllItems();
        this.frameSelecionados.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed
    public String getCampoNumQuarto(){
        return this.giratorioNumQuarto.getToolTipText();
    }
    
    public String getCampoTipo(){
        return this.caixaTipo.getToolTipText();
    }
    
    public String getCampoPreco(){
        return this.campoPreco.getText();
    }
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
            java.util.logging.Logger.getLogger(ConsultaQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaQuartos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultarTudo;
    private javax.swing.JButton btNumQuarto;
    private javax.swing.JButton btOk;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> caixaTipo;
    private javax.swing.JTextField campoAr;
    private javax.swing.JTextField campoCategoria;
    private javax.swing.JTextField campoDiaria;
    private javax.swing.JTextField campoFrigobar;
    private javax.swing.JTextField campoNumQuarto;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JTextField campoStatus;
    private javax.swing.JTextField campoWf;
    private javax.swing.JComboBox<String> comboSelecionados;
    private javax.swing.JFrame frameNumQuarto;
    private javax.swing.JFrame frameSelecionados;
    private javax.swing.JSpinner giratorioNumQuarto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JCheckBox selecaoAr;
    private javax.swing.JCheckBox selecaoFrigobar;
    private javax.swing.JCheckBox selecaoWifi;
    // End of variables declaration//GEN-END:variables
}
