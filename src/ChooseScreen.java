
import java.awt.HeadlessException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashish
 */
public class ChooseScreen extends javax.swing.JFrame {

    /**
     * Creates new form ChooseScreen
     */
    public int userid;
    public ChooseScreen() throws HeadlessException {
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel3.setVisible(false);
        jTextPane1.setEditable(false);
    }

    public ChooseScreen(int id) {
        initComponents();
        jPanel3.setVisible(false);
        this.setLocationRelativeTo(null);
        this.userid=id;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        myAccountButton = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1420, 799));
        getContentPane().setLayout(null);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus (1).png"))); // NOI18N
        jLabel2.setText("  Create CV");
        jLabel2.setAlignmentY(0.0F);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 39, 214, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus (1).png"))); // NOI18N
        jLabel3.setText("  Create Resume");
        jLabel3.setAlignmentY(0.0F);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 98, 286, -1));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus (1).png"))); // NOI18N
        jLabel4.setText("  See the difference between CV and Resume");
        jLabel4.setAlignmentY(0.0F);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 157, 776, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(140, 70, 720, 240);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myAccountButton.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        myAccountButton.setForeground(new java.awt.Color(204, 255, 0));
        myAccountButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myAccountButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/round-account-button-with-user-inside.png"))); // NOI18N
        myAccountButton.setText("  My Account");
        myAccountButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        myAccountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myAccountButtonMouseClicked(evt);
            }
        });
        jPanel2.add(myAccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 43, 269, 43));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(1000, 80, 342, 86);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, -1));

        jTextPane1.setBackground(new java.awt.Color(51, 51, 51));
        jTextPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextPane1.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 255, 102));
        jTextPane1.setText("\n  A resume is a brief summary of your skills and experience \n  over one or two pages, a CV is more detailed and can\n  stretch well beyond two pages. The resume will be tailored\n  to each position whereas the CV will stay as it is and any\n  changes will be in the cover letter.");
        jTextPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(jTextPane1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, 695, 223));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 700, 280));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CReate_CV_resume_bg.jpg"))); // NOI18N
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 811));

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 1450, 810);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        jPanel3.setVisible(true);
        jButton1.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void myAccountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myAccountButtonMouseClicked
        // TODO add your handling code here:
        myAcoount account = new myAcoount(userid);
        this.setVisible(false);
        this.dispose();
        account.setVisible(true);
        
    }//GEN-LAST:event_myAccountButtonMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        Personal_Information_CV p = new Personal_Information_CV(userid);
        this.setVisible(false);
        p.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        Personal_Information p = new Personal_Information(userid);
        this.setVisible(false);
        p.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jPanel3.setVisible(false);
        jButton1.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChooseScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooseScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooseScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel myAccountButton;
    // End of variables declaration//GEN-END:variables
}
