/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import controle.Controle;


public class TelaConfiguracoesAreaEducador extends javax.swing.JFrame {


	
	Controle controle;
	private static final long serialVersionUID = 1L;
	
    public TelaConfiguracoesAreaEducador(Controle ctr) {
        initComponents();
        this.controle = ctr;
        this.jTextFieldFacil.setText(
                Integer.toString(controle.getTmpFacil()));
        this.jTextFieldMedio.setText(
                Integer.toString(controle.getTmpMedio()));
        this.jTextFieldDificil.setText(
                Integer.toString(controle.getTmpDificil()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelConfigSistema = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelTmpResposta = new javax.swing.JLabel();
        jLabelDasQuestoes = new javax.swing.JLabel();
        jLabelFacil = new javax.swing.JLabel();
        jLabelMedio = new javax.swing.JLabel();
        jLabelDificil = new javax.swing.JLabel();
        jTextFieldFacil = new javax.swing.JTextField();
        jTextFieldMedio = new javax.swing.JTextField();
        jTextFieldDificil = new javax.swing.JTextField();
        jLabelSegundosFacil = new javax.swing.JLabel();
        jLabelSegundosMedio = new javax.swing.JLabel();
        jLabelSegundosDificil = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jLabelConfigSistema.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        jLabelConfigSistema.setText("Configurações do Sistema:");

        jLabelTmpResposta.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelTmpResposta.setText("Tempo de Resposta");

        jLabelDasQuestoes.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabelDasQuestoes.setText("das questões:");

        jLabelFacil.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelFacil.setText("Fácil:");

        jLabelMedio.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelMedio.setText("Médio:");

        jLabelDificil.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelDificil.setText("Difícil:");

        jLabelSegundosFacil.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelSegundosFacil.setText("segundos.");

        jLabelSegundosMedio.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelSegundosMedio.setText("segundos.");

        jLabelSegundosDificil.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelSegundosDificil.setText("segundos.");

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelConfigSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 283, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelTmpResposta)
                                .addGap(282, 282, 282))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelDasQuestoes)
                                .addGap(345, 345, 345))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelDificil, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 462, Short.MAX_VALUE)
                                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldDificil, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelSegundosDificil)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jTextFieldFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelSegundosFacil))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelMedio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelSegundosMedio)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelConfigSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTmpResposta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDasQuestoes)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSegundosFacil)
                            .addComponent(jLabelFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSegundosMedio))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDificil, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDificil, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSegundosDificil))
                        .addContainerGap(132, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCancelar)
                            .addComponent(jButtonSalvar))
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();        
        new TelaPrincipalAreaEducador(controle).setVisible(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
         try {
            if(controle.efetuarAlteracoes(
                    jTextFieldFacil.getText(),
                    jTextFieldMedio.getText(),
                    jTextFieldDificil.getText())
                    ) 
            { 
              this.dispose();
              new TelaPrincipalAreaEducador(controle).setVisible(true);
            } else {}

        } catch (IOException ex) {
           Logger.getLogger(TelaConfiguracoesAreaEducador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelConfigSistema;
    private javax.swing.JLabel jLabelDasQuestoes;
    private javax.swing.JLabel jLabelDificil;
    private javax.swing.JLabel jLabelFacil;
    private javax.swing.JLabel jLabelMedio;
    private javax.swing.JLabel jLabelSegundosDificil;
    private javax.swing.JLabel jLabelSegundosFacil;
    private javax.swing.JLabel jLabelSegundosMedio;
    private javax.swing.JLabel jLabelTmpResposta;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldDificil;
    private javax.swing.JTextField jTextFieldFacil;
    private javax.swing.JTextField jTextFieldMedio;
    // End of variables declaration//GEN-END:variables
}
