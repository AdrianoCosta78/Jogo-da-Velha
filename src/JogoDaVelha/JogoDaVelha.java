
package JogoDaVelha;

import java.awt.Color;
import static java.awt.Color.RED;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Adriano
 */
public class JogoDaVelha extends javax.swing.JFrame {
    
    private String iniciarJogo = "X";
    private int xContador = 0;
    private int oContador = 0;
    boolean verificar;
    
    
    public JogoDaVelha() {
        initComponents();
    }
    
    private void pontuacao()
    {
        lblJogadorX.setText(String.valueOf(xContador));
        lblJogador0.setText(String.valueOf(oContador));
    }
    
    private void escolherJogador()
    {
        if (iniciarJogo.equalsIgnoreCase("X"))
           {
            iniciarJogo = "0";
           }
        else
           {
           iniciarJogo = "X";
           }
    }
    

    
    private void vencedorJogo()
    {
        String botao1 = btn1.getText();
        String botao2 = btn2.getText();
        String botao3 = btn3.getText();
        String botao4 = btn4.getText();
        String botao5 = btn5.getText();
        String botao6 = btn6.getText();
        String botao7 = btn7.getText();
        String botao8 = btn8.getText();
        String botao9 = btn9.getText();
        
        //1,2,3 X
        if (botao1 == ("X") && botao2 == ("X") && botao3 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"O JOGADOR X VENCEU!!!","Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(Color.RED);
            btn2.setBackground(Color.RED);
            btn3.setBackground(Color.RED);
            xContador++;
            pontuacao();
            
        }
        //4,5,6 X
        if (botao4 == ("X") && botao5 == ("X") && botao6 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"O JOGADOR X VENCEU!!!","Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            btn4.setBackground(Color.RED);
            btn5.setBackground(Color.RED);
            btn6.setBackground(Color.RED);
            xContador++;
            pontuacao();
            
        }
        //7,8,9 X
        if (botao7 == ("X") && botao8 == ("X") && botao9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"O JOGADOR X VENCEU!!!","Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            btn7.setBackground(Color.RED);
            btn8.setBackground(Color.RED);
            btn9.setBackground(Color.RED);
            xContador++;
            pontuacao();
            
        }
        //1,4,7 X
        if (botao1 == ("X") && botao4 == ("X") && botao7 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"O JOGADOR X VENCEU!!!","Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(Color.RED);
            btn4.setBackground(Color.RED);
            btn7.setBackground(Color.RED);
            xContador++;
            pontuacao();
            
        }
        //2,5,8 X
        if (botao2 == ("X") && botao5 == ("X") && botao8 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"O JOGADOR X VENCEU!!!","Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            btn2.setBackground(Color.RED);
            btn5.setBackground(Color.RED);
            btn8.setBackground(Color.RED);
            xContador++;
            pontuacao();
            
        }
        //3,6,9 X
        if (botao3 == ("X") && botao6 == ("X") && botao9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"O JOGADOR X VENCEU!!!","Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            btn3.setBackground(Color.RED);
            btn6.setBackground(Color.RED);
            btn9.setBackground(Color.RED);
            xContador++;
            pontuacao();
            
        }
        //1,5,9 X
        if (botao1 == ("X") && botao5 == ("X") && botao9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"O JOGADOR X VENCEU!!!","Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(Color.RED);
            btn5.setBackground(Color.RED);
            btn9.setBackground(Color.RED);
            xContador++;
            pontuacao();
            
        }
        //3,5,7 X
        if (botao3 == ("X") && botao5 == ("X") && botao7 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"O JOGADOR X VENCEU!!!","Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            btn3.setBackground(Color.RED);
            btn5.setBackground(Color.RED);
            btn7.setBackground(Color.RED);
            xContador++;
            pontuacao();
            
        }
        
        if (botao1 == ("0") && botao2 == ("0") && botao3 == ("0"))
        {
            JOptionPane.showMessageDialog(this,"O JOGADOR 0 VENCEU!!!","Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(Color.RED);
            btn2.setBackground(Color.RED);
            btn3.setBackground(Color.RED);
            oContador++;
            pontuacao();
            
        }
        
        if (botao4 == ("0") && botao5 == ("0") && botao6 == ("0"))
        {
            JOptionPane.showMessageDialog(this,"O JOGADOR 0 VENCEU!!!","Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            btn4.setBackground(Color.RED);
            btn5.setBackground(Color.RED);
            btn6.setBackground(Color.RED);
            oContador++;
            pontuacao();
            
        }
        
        if (botao7 == ("0") && botao8 == ("0") && botao9 == ("0"))
        {
            JOptionPane.showMessageDialog(this,"O JOGADOR 0 VENCEU!!!","Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            btn7.setBackground(Color.RED);
            btn8.setBackground(Color.RED);
            btn9.setBackground(Color.RED);
            oContador++;
            pontuacao();
            
        }
        
        if (botao1 == ("0") && botao4 == ("0") && botao7 == ("0"))
        {
            JOptionPane.showMessageDialog(this,"O JOGADOR 0 VENCEU!!!","Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(Color.RED);
            btn4.setBackground(Color.RED);
            btn7.setBackground(Color.RED);
            oContador++;
            pontuacao();
            
        }
        
        if (botao2 == ("0") && botao5 == ("0") && botao8 == ("0"))
        {
            JOptionPane.showMessageDialog(this,"O JOGADOR 0 VENCEU!!!","Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            btn2.setBackground(Color.RED);
            btn5.setBackground(Color.RED);
            btn8.setBackground(Color.RED);
            oContador++;
            pontuacao();
            
        }
        
        if (botao3 == ("0") && botao6 == ("0") && botao9 == ("0"))
        {
            JOptionPane.showMessageDialog(this,"O JOGADOR 0 VENCEU!!!","Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            btn3.setBackground(Color.RED);
            btn6.setBackground(Color.RED);
            btn9.setBackground(Color.RED);
            oContador++;
            pontuacao();
            
        }
        
        if (botao1 == ("0") && botao5 == ("0") && botao9 == ("0"))
        {
            JOptionPane.showMessageDialog(this,"O JOGADOR 0 VENCEU!!!","Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(Color.RED);
            btn5.setBackground(Color.RED);
            btn9.setBackground(Color.RED);
            oContador++;
            pontuacao();
            
        }
        
        if (botao3 == ("0") && botao5 == ("0") && botao7 == ("0"))
        {
            JOptionPane.showMessageDialog(this,"O JOGADOR 0 VENCEU!!!","Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
            btn3.setBackground(Color.RED);
            btn5.setBackground(Color.RED);
            btn7.setBackground(Color.RED);
            oContador++;
            pontuacao();
            
        }
           
    }
           
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnNovoJogo = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblJogador0 = new javax.swing.JLabel();
        lblJogadorX = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 110, 80));

        btn3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 110, 80));

        btn1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 80));

        btn5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 110, 80));

        btn4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 110, 80));

        btn8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 110, 80));

        btn6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 110, 80));

        btn2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 110, 80));

        btn9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 110, 80));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 370, 280));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Jogo da Velha");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 190, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, 80));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNovoJogo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNovoJogo.setText("Novo Jogo");
        btnNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoJogoActionPerformed(evt);
            }
        });
        jPanel4.add(btnNovoJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, 40));

        btnIniciar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel4.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 110, 40));

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel4.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 100, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Jogador 0");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 90, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Jogador X");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 30));

        lblJogador0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblJogador0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJogador0.setText("0");
        lblJogador0.setOpaque(true);
        jPanel4.add(lblJogador0, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 40, 30));

        lblJogadorX.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblJogadorX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJogadorX.setText("0");
        lblJogadorX.setOpaque(true);
        jPanel4.add(lblJogadorX, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 40, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 370, 140));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 540));

        setSize(new java.awt.Dimension(425, 578));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private JFrame frame;
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        
        frame = new JFrame("Sair");
            if (JOptionPane.showConfirmDialog(frame, "Deseja sair do jogo?","Jodo da Velha", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
            {
                System.exit(0);
            }
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        
                
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        
        btn1.setBackground(Color.ORANGE);
        btn2.setBackground(Color.ORANGE);
        btn3.setBackground(Color.ORANGE);
        btn4.setBackground(Color.ORANGE);
        btn5.setBackground(Color.ORANGE);
        btn6.setBackground(Color.ORANGE);
        btn7.setBackground(Color.ORANGE);
        btn8.setBackground(Color.ORANGE);
        btn9.setBackground(Color.ORANGE);
       
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        
        btn1.setText(iniciarJogo);
        if (iniciarJogo.equalsIgnoreCase("X"))
            {
            verificar = false;
            }
        else
            {
            verificar = true;
            }
        escolherJogador();
        vencedorJogo();
            
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        
           btn2.setText(iniciarJogo);
        if (iniciarJogo.equalsIgnoreCase("X"))
            {
            verificar = false;
            }
        else
            {
            verificar = true;
            }
        escolherJogador();
        vencedorJogo();
            
    
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        
        btn3.setText(iniciarJogo);
        if (iniciarJogo.equalsIgnoreCase("X"))
            {
            verificar = false;
            }
        else
            {
            verificar = true;
            }
        escolherJogador();
        vencedorJogo();
            
    
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        
        btn4.setText(iniciarJogo);
        if (iniciarJogo.equalsIgnoreCase("X"))
            {
            verificar = false;
            }
        else
            {
            verificar = true;
            }
        escolherJogador();
        vencedorJogo();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        
        btn5.setText(iniciarJogo);
        if (iniciarJogo.equalsIgnoreCase("X"))
            {
            verificar = false;
            }
        else
            {
            verificar = true;
            }
        escolherJogador();
        vencedorJogo();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        
        btn6.setText(iniciarJogo);
        if (iniciarJogo.equalsIgnoreCase("X"))
            {
            verificar = false;
            }
        else
            {
            verificar = true;
            }
        escolherJogador();
        vencedorJogo();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        
        btn7.setText(iniciarJogo);
        if (iniciarJogo.equalsIgnoreCase("X"))
            {
            verificar = false;
            }
        else
            {
            verificar = true;
            }
        escolherJogador();
        vencedorJogo();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        
        btn8.setText(iniciarJogo);
        if (iniciarJogo.equalsIgnoreCase("X"))
            {
            verificar = false;
            }
        else
            {
            verificar = true;
            }
        escolherJogador();
        vencedorJogo();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        
        btn9.setText(iniciarJogo);
        if (iniciarJogo.equalsIgnoreCase("X"))
            {
            verificar = false;
            }
        else
            {
            verificar = true;
            }
        escolherJogador();
        vencedorJogo();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoJogoActionPerformed
        
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        
        lblJogadorX.setText("0");
        lblJogador0.setText("0");
        
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        
        btn1.setBackground(Color.ORANGE);
        btn2.setBackground(Color.ORANGE);
        btn3.setBackground(Color.ORANGE);
        btn4.setBackground(Color.ORANGE);
        btn5.setBackground(Color.ORANGE);
        btn6.setBackground(Color.ORANGE);
        btn7.setBackground(Color.ORANGE);
        btn8.setBackground(Color.ORANGE);
        btn9.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btnNovoJogoActionPerformed

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
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnNovoJogo;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblJogador0;
    private javax.swing.JLabel lblJogadorX;
    // End of variables declaration//GEN-END:variables
}
