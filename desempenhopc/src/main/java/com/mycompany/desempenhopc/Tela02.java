/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.desempenhopc;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author gabsg
 */
public class Tela02 extends javax.swing.JFrame {
    Integer maximoCPU= 0;
    Integer minimoCPU= 0;
    Double medioCPU= 0.0;
    Integer valoresCPU = 0;
    Integer i = 2;
    public Tela02() {
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

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNomeCpu = new javax.swing.JLabel();
        pbarCpu = new javax.swing.JProgressBar();
        btnGeraValor = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblMinimo = new javax.swing.JLabel();
        lblNomeRAM = new javax.swing.JLabel();
        pbarRAM = new javax.swing.JProgressBar();
        pbarHD = new javax.swing.JProgressBar();
        lblNomeHD = new javax.swing.JLabel();
        lblMedio = new javax.swing.JLabel();
        lblMaximo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(null);

        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("Uso do Computador");
        jPanel1.add(lblTitulo);
        lblTitulo.setBounds(207, 31, 112, 16);

        lblNomeCpu.setForeground(new java.awt.Color(0, 0, 0));
        lblNomeCpu.setText("CPU");
        jPanel1.add(lblNomeCpu);
        lblNomeCpu.setBounds(46, 79, 60, 16);

        pbarCpu.setBackground(new java.awt.Color(0, 0, 0));
        pbarCpu.setForeground(new java.awt.Color(51, 204, 0));
        pbarCpu.setOpaque(false);
        pbarCpu.setStringPainted(true);
        jPanel1.add(pbarCpu);
        pbarCpu.setBounds(167, 76, 223, 19);

        btnGeraValor.setText("Ler dados");
        btnGeraValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeraValorActionPerformed(evt);
            }
        });
        jPanel1.add(btnGeraValor);
        btnGeraValor.setBounds(220, 239, 87, 32);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair);
        btnSair.setBounds(237, 277, 53, 32);

        lblMinimo.setForeground(new java.awt.Color(0, 0, 0));
        lblMinimo.setText("Mínimo");
        lblMinimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblMinimo);
        lblMinimo.setBounds(167, 107, 80, 16);

        lblNomeRAM.setForeground(new java.awt.Color(0, 0, 0));
        lblNomeRAM.setText("RAM");
        jPanel1.add(lblNomeRAM);
        lblNomeRAM.setBounds(46, 142, 60, 16);

        pbarRAM.setBackground(new java.awt.Color(0, 0, 0));
        pbarRAM.setForeground(new java.awt.Color(51, 204, 0));
        pbarRAM.setStringPainted(true);
        jPanel1.add(pbarRAM);
        pbarRAM.setBounds(167, 139, 223, 19);

        pbarHD.setBackground(new java.awt.Color(0, 0, 0));
        pbarHD.setForeground(new java.awt.Color(51, 204, 0));
        pbarHD.setStringPainted(true);
        jPanel1.add(pbarHD);
        pbarHD.setBounds(167, 193, 223, 19);

        lblNomeHD.setForeground(new java.awt.Color(0, 0, 0));
        lblNomeHD.setText("HD");
        jPanel1.add(lblNomeHD);
        lblNomeHD.setBounds(46, 194, 50, 16);

        lblMedio.setForeground(new java.awt.Color(0, 0, 0));
        lblMedio.setText("Médio");
        lblMedio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblMedio);
        lblMedio.setBounds(255, 107, 80, 16);

        lblMaximo.setForeground(new java.awt.Color(0, 0, 0));
        lblMaximo.setText("Máximo");
        lblMaximo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblMaximo);
        lblMaximo.setBounds(345, 107, 100, 16);

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

        setSize(new java.awt.Dimension(533, 315));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeraValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeraValorActionPerformed
  
          Random aleat = new Random();
          Integer CPU = aleat.nextInt(101);
          Integer CPU1 = aleat.nextInt(101);
   
          
          if(CPU > CPU1){
            maximoCPU = CPU;  
            minimoCPU = CPU1;  
            lblMaximo.setText(maximoCPU.toString());
            lblMinimo.setText(minimoCPU.toString());
          }else if(CPU1 > CPU){
            maximoCPU = CPU1;  
            minimoCPU = CPU;  
            lblMaximo.setText(maximoCPU.toString());
            lblMinimo.setText(minimoCPU.toString());
          }
       
            valoresCPU = valoresCPU + maximoCPU + minimoCPU;
            pbarCpu.setValue(maximoCPU);
            
            if(minimoCPU <= 0 || maximoCPU <=0 && i == 2){
            medioCPU = (valoresCPU.doubleValue())/1;
            }else{
            medioCPU = (valoresCPU.doubleValue())/i;
            }
            lblMedio.setText(String.format("Média: %.2f",medioCPU));
            i++;
    }//GEN-LAST:event_btnGeraValorActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(Tela02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeraValor;
    private javax.swing.JButton btnSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMaximo;
    private javax.swing.JLabel lblMedio;
    private javax.swing.JLabel lblMinimo;
    private javax.swing.JLabel lblNomeCpu;
    private javax.swing.JLabel lblNomeHD;
    private javax.swing.JLabel lblNomeRAM;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JProgressBar pbarCpu;
    private javax.swing.JProgressBar pbarHD;
    private javax.swing.JProgressBar pbarRAM;
    // End of variables declaration//GEN-END:variables
}
