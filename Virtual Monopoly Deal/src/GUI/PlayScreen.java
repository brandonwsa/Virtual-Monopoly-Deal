/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Becca
 */

package GUI;

public class PlayScreen extends javax.swing.JFrame {
    
    public static int numberOfPlayers;
    public static boolean toGamePlayScreen;
    public static String playerName;
    private GamePlayScreen GPS;

    /**
     * Creates new form OptionsScreen
     */
    public PlayScreen() {
        numberOfPlayers = 0;
        toGamePlayScreen = false;
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

        jTextField1 = new javax.swing.JTextField();
        selectedPlayerOptions = new javax.swing.JLabel();
        selectedGameModeOption = new javax.swing.JLabel();
        threePlayers = new javax.swing.JButton();
        twoPlayers = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        goButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 850, 290, 70));

        selectedPlayerOptions.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        selectedPlayerOptions.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(selectedPlayerOptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 890, 800, 100));

        selectedGameModeOption.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        selectedGameModeOption.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(selectedGameModeOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 750, 460, 90));

        threePlayers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/threeplayer.jpg"))); // NOI18N
        threePlayers.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/threeplayerchosen.jpg"))); // NOI18N
        threePlayers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threePlayersActionPerformed(evt);
            }
        });
        getContentPane().add(threePlayers, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 530, 340, 110));

        twoPlayers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/twoplayer.jpg"))); // NOI18N
        twoPlayers.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/twoplayerchosen.jpg"))); // NOI18N
        twoPlayers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoPlayersActionPerformed(evt);
            }
        });
        getContentPane().add(twoPlayers, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, 340, 110));

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backbutton.jpg"))); // NOI18N
        backButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backbuttonrollover.jpg"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 890, 200, 80));

        goButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gobutton.jpg"))); // NOI18N
        goButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gobuttonrollover.jpg"))); // NOI18N
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });
        getContentPane().add(goButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 890, 200, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/optionsbackground.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        MainMenu MM = new MainMenu();
        MM.setVisible(true);
        
        PlayScreen PS = new PlayScreen();
        setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        // TODO add your handling code here:
        //gets playerName from text field
        playerName = jTextField1.getText();
        
        GPS = Main.Main.GPS;
         GPS.setNumberOfPlayers(numberOfPlayers);
        GPS.setVisible(true);
        toGamePlayScreen = true;
        dispose();//closes the jframe
    }//GEN-LAST:event_goButtonActionPerformed

    private void threePlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threePlayersActionPerformed
        threePlayers.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/threeplayerchosen.jpg"))); // NOI18N
        selectedPlayerOptions.setText("You selected to play with three players");
        numberOfPlayers = 3;
    }//GEN-LAST:event_threePlayersActionPerformed

    private void twoPlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoPlayersActionPerformed
        selectedPlayerOptions.setText("You selected to play with two players");
        numberOfPlayers = 2;
    }//GEN-LAST:event_twoPlayersActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
      //      playerName = jTextField1.getText();
      //      System.out.println(playerName);
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(PlayScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayScreen().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton goButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel selectedGameModeOption;
    private javax.swing.JLabel selectedPlayerOptions;
    private javax.swing.JButton threePlayers;
    private javax.swing.JButton twoPlayers;
    // End of variables declaration//GEN-END:variables
}
