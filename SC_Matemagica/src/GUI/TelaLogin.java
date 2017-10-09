/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controle.Controle;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class TelaLogin extends javax.swing.JFrame {


	Controle controle;
	private String path_to_background = "images/telaLogin.png";
    
    public TelaLogin(Controle ctr) {
        this.controle = ctr;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelSenha = new javax.swing.JLabel();
        jTextSenha = new javax.swing.JPasswordField();
        jComboBoxNomeTipoUsuario = new javax.swing.JComboBox<>();
        jLabelTipoUsuario = new javax.swing.JLabel();
        jLabelSejaBemVindo = new javax.swing.JLabel();
        jLabelMatemagica = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        //JLabel background = new JLabel();
        //background.setOpaque(true);
        //background.setForeground(Color.GREEN);
        //setContentPane(background);
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matemágica");
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        
        jLabelSenha.setText("Senha:");

        jComboBoxNomeTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Educador", "Jogador" }));
        jComboBoxNomeTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNomeTipoUsuarioActionPerformed(evt);
            }
        });

        jLabelTipoUsuario.setText("Tipo de Usuário:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSenha)
                    .addComponent(jLabelTipoUsuario)
                    .addComponent(jComboBoxNomeTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(jLabelTipoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxNomeTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabelSejaBemVindo.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabelSejaBemVindo.setText("Seja bem-vindo a");

        jLabelMatemagica.setFont(new java.awt.Font("Tahoma", 3, 62)); // NOI18N
        jLabelMatemagica.setText("Matemágica!");

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabelSejaBemVindo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelMatemagica)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(311, 311, 311))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabelSejaBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMatemagica, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>                        
    
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(controle.efetuarLogin( 
    			(String)(jComboBoxNomeTipoUsuario.getSelectedItem()),
    			jTextSenha.getPassword())) 
    	{
    		this.dispose();
    	}
//        if(jComboBoxNomeTipoUsuario.getSelectedItem().equals("Educador") && controle.isPasswordCorrect(jTextSenha.getPassword())){
//            this.dispose();
//            new TelaPrincipalAreaEducador(controle).setVisible(true);
//        }else if(jComboBoxNomeTipoUsuario.getSelectedItem().equals("Jogador")){
//            JOptionPane.showMessageDialog(null, "Bem-vindo ao Matemagica!");
//        }
//        else{
//            JOptionPane.showMessageDialog(null, "Acesso Negado.");
//        }
        
        
    }                                        

    private void jComboBoxNomeTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
        if(jComboBoxNomeTipoUsuario.getSelectedItem().equals("Jogador")){
            jTextSenha.setVisible(false);
            jLabelSenha.setVisible(false);
        }
        else if(jComboBoxNomeTipoUsuario.getSelectedItem().equals("Educador")){
            jTextSenha.setVisible(true);
            jLabelSenha.setVisible(true);
        }
        
    }                                                        

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxNomeTipoUsuario;
    private javax.swing.JLabel jLabelMatemagica;
    private javax.swing.JLabel jLabelSejaBemVindo;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelTipoUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jTextSenha;
    // End of variables declaration                   
}

