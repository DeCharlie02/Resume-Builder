
import java.awt.Color;
import java.security.Security;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;


public class Login_register_screen_new extends javax.swing.JFrame {

    private Connection conn;
    private Statement stmt;
    private ResultSet rs;
    public int userid;

    
    public Login_register_screen_new() {
        initComponents();
        this.setLocationRelativeTo(null);
        registerPanel.setVisible(false);
        signUpInPanel.setVisible(false);
        LoginPanel.setVisible(false);
        changePasswordPanel.setVisible(false);
        adminPanel.setVisible(false);
        selectGuestAdmin.setVisible(true);
        selectGuestAdmin.setLocation(380, 70);
        EmailTF.setBackground(new Color(0, 0, 0, 0));
        UsernameTF.setBackground(new Color(0, 0, 0, 0));

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        selectGuestAdmin = new javax.swing.JPanel();
        guest = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        user = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        adminPanel = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jButton9 = new javax.swing.JButton();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jSeparator24 = new javax.swing.JSeparator();
        jTextField7 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jPasswordField7 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        signUpInPanel = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LoginPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        EmailLoginTF = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        PasswordLogin = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        changePasswordPanel = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jSeparator19 = new javax.swing.JSeparator();
        confirmChangePwd = new javax.swing.JPasswordField();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        changePwd = new javax.swing.JPasswordField();
        jSeparator22 = new javax.swing.JSeparator();
        registerPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        UsernameTF = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        SignUpButton = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        ConfirmPasswordTF = new javax.swing.JPasswordField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        EmailTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PasswordTF = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1420, 799));
        setResizable(false);
        getContentPane().setLayout(null);

        selectGuestAdmin.setMaximumSize(new java.awt.Dimension(491, 760));
        selectGuestAdmin.setMinimumSize(new java.awt.Dimension(491, 760));
        selectGuestAdmin.setOpaque(false);

        guest.setBackground(new java.awt.Color(0, 0, 0));
        guest.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        guest.setForeground(new java.awt.Color(255, 255, 255));
        guest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guest.setText("Guest");
        guest.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        guest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guestMouseClicked(evt);
            }
        });

        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator25.setForeground(new java.awt.Color(255, 255, 255));

        user.setBackground(new java.awt.Color(0, 0, 0));
        user.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user.setText("User");
        user.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
        });

        admin.setBackground(new java.awt.Color(0, 0, 0));
        admin.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        admin.setForeground(new java.awt.Color(255, 255, 255));
        admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin.setText("Admin");
        admin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout selectGuestAdminLayout = new javax.swing.GroupLayout(selectGuestAdmin);
        selectGuestAdmin.setLayout(selectGuestAdminLayout);
        selectGuestAdminLayout.setHorizontalGroup(
            selectGuestAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectGuestAdminLayout.createSequentialGroup()
                .addGroup(selectGuestAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selectGuestAdminLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(selectGuestAdminLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator25, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(selectGuestAdminLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(selectGuestAdminLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(guest, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(selectGuestAdminLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        selectGuestAdminLayout.setVerticalGroup(
            selectGuestAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectGuestAdminLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(guest, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jSeparator25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(304, Short.MAX_VALUE))
        );

        getContentPane().add(selectGuestAdmin);
        selectGuestAdmin.setBounds(0, 0, 491, 760);

        adminPanel.setMaximumSize(new java.awt.Dimension(491, 770));
        adminPanel.setMinimumSize(new java.awt.Dimension(491, 770));
        adminPanel.setOpaque(false);
        adminPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Admin");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        adminPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 154, 40));

        jSeparator14.setForeground(new java.awt.Color(51, 255, 204));
        adminPanel.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 129, 415, -1));

        jButton9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 0));
        jButton9.setText("Login");
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, null, null));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        adminPanel.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 160, -1));

        jSeparator20.setForeground(new java.awt.Color(51, 255, 204));
        adminPanel.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 415, 10));

        jSeparator23.setForeground(new java.awt.Color(255, 255, 255));
        adminPanel.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 292, 306, 10));

        jLabel21.setBackground(java.awt.SystemColor.activeCaptionText);
        jLabel21.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel21.setForeground(java.awt.SystemColor.control);
        jLabel21.setText("Admin Id");
        adminPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 149, -1));

        jSeparator24.setForeground(new java.awt.Color(255, 255, 255));
        adminPanel.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 306, -1));

        jTextField7.setBackground(new java.awt.Color(51, 51, 51));
        jTextField7.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 0));
        jTextField7.setBorder(null);
        jTextField7.setOpaque(false);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        adminPanel.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 306, 30));

        jLabel24.setBackground(java.awt.SystemColor.activeCaptionText);
        jLabel24.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel24.setForeground(java.awt.SystemColor.control);
        jLabel24.setText("Password");
        adminPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 149, -1));

        jPasswordField7.setBackground(new java.awt.Color(51, 51, 51));
        jPasswordField7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPasswordField7.setForeground(new java.awt.Color(255, 255, 0));
        jPasswordField7.setBorder(null);
        jPasswordField7.setOpaque(false);
        adminPanel.add(jPasswordField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 306, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left-arrow (1).png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        adminPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 40));

        getContentPane().add(adminPanel);
        adminPanel.setBounds(760, 110, 490, 662);

        signUpInPanel.setBackground(getBackground());
        signUpInPanel.setMaximumSize(new java.awt.Dimension(491, 730));
        signUpInPanel.setMinimumSize(new java.awt.Dimension(491, 730));
        signUpInPanel.setOpaque(false);
        signUpInPanel.setPreferredSize(new java.awt.Dimension(491, 730));
        signUpInPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("Sign Up");
        jButton7.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        signUpInPanel.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 170, -1));

        jButton8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("Sign In");
        jButton8.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        signUpInPanel.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 170, -1));

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Don't have an account ?");
        signUpInPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 260, 40));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Or");
        signUpInPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 50, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left-arrow (1).png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        signUpInPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 40));

        getContentPane().add(signUpInPanel);
        signUpInPanel.setBounds(-40, 90, 450, 700);

        LoginPanel.setMaximumSize(new java.awt.Dimension(491, 770));
        LoginPanel.setMinimumSize(new java.awt.Dimension(491, 770));
        LoginPanel.setOpaque(false);
        LoginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Login");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        LoginPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 154, 40));

        jSeparator13.setForeground(new java.awt.Color(51, 255, 204));
        LoginPanel.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 129, 415, -1));

        jButton5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Login");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, null, null));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        LoginPanel.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 160, -1));

        jSeparator16.setForeground(new java.awt.Color(51, 255, 204));
        LoginPanel.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 415, 10));

        jSeparator17.setForeground(new java.awt.Color(255, 255, 255));
        LoginPanel.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 292, 306, 10));

        jLabel16.setBackground(java.awt.SystemColor.activeCaptionText);
        jLabel16.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel16.setForeground(java.awt.SystemColor.control);
        jLabel16.setText("Email");
        LoginPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 149, -1));

        jSeparator18.setForeground(new java.awt.Color(255, 255, 255));
        LoginPanel.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 306, -1));

        EmailLoginTF.setBackground(new java.awt.Color(51, 51, 51));
        EmailLoginTF.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        EmailLoginTF.setForeground(new java.awt.Color(255, 255, 0));
        EmailLoginTF.setBorder(null);
        EmailLoginTF.setOpaque(false);
        EmailLoginTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailLoginTFActionPerformed(evt);
            }
        });
        LoginPanel.add(EmailLoginTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 306, 30));

        jLabel17.setBackground(java.awt.SystemColor.activeCaptionText);
        jLabel17.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel17.setForeground(java.awt.SystemColor.control);
        jLabel17.setText("Password");
        LoginPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 149, -1));

        PasswordLogin.setBackground(new java.awt.Color(51, 51, 51));
        PasswordLogin.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        PasswordLogin.setForeground(new java.awt.Color(255, 255, 0));
        PasswordLogin.setBorder(null);
        PasswordLogin.setOpaque(false);
        LoginPanel.add(PasswordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 306, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Forgot password ?");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        LoginPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 260, -1));

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 102));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Create account");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        LoginPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, 200, -1));

        getContentPane().add(LoginPanel);
        LoginPanel.setBounds(760, 110, 490, 662);

        changePasswordPanel.setMaximumSize(new java.awt.Dimension(491, 760));
        changePasswordPanel.setMinimumSize(new java.awt.Dimension(491, 760));
        changePasswordPanel.setOpaque(false);
        changePasswordPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Change Password");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        changePasswordPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 320, 40));

        jSeparator10.setForeground(new java.awt.Color(51, 255, 204));
        changePasswordPanel.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 415, -1));

        jButton6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("Update password");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, null, null));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        changePasswordPanel.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 231, -1));

        jSeparator19.setForeground(new java.awt.Color(51, 255, 204));
        changePasswordPanel.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 498, 415, -1));

        confirmChangePwd.setBackground(new java.awt.Color(51, 51, 51));
        confirmChangePwd.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        confirmChangePwd.setForeground(new java.awt.Color(255, 255, 0));
        confirmChangePwd.setBorder(null);
        confirmChangePwd.setOpaque(false);
        confirmChangePwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmChangePwdActionPerformed(evt);
            }
        });
        changePasswordPanel.add(confirmChangePwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 306, 30));

        jSeparator21.setForeground(new java.awt.Color(255, 255, 255));
        changePasswordPanel.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 306, -1));

        jLabel22.setBackground(java.awt.SystemColor.activeCaptionText);
        jLabel22.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel22.setForeground(java.awt.SystemColor.control);
        jLabel22.setText("Confirm Password");
        changePasswordPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 218, -1));

        jLabel23.setBackground(java.awt.SystemColor.activeCaptionText);
        jLabel23.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel23.setForeground(java.awt.SystemColor.control);
        jLabel23.setText("New Password");
        changePasswordPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 210, -1));

        changePwd.setBackground(new java.awt.Color(51, 51, 51));
        changePwd.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        changePwd.setForeground(new java.awt.Color(255, 255, 0));
        changePwd.setBorder(null);
        changePwd.setOpaque(false);
        changePasswordPanel.add(changePwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 306, 30));

        jSeparator22.setForeground(new java.awt.Color(255, 255, 255));
        changePasswordPanel.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 306, -1));

        getContentPane().add(changePasswordPanel);
        changePasswordPanel.setBounds(490, 10, 445, 586);

        registerPanel.setMaximumSize(new java.awt.Dimension(491, 760));
        registerPanel.setMinimumSize(new java.awt.Dimension(491, 760));
        registerPanel.setOpaque(false);
        registerPanel.setLayout(null);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Register");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        registerPanel.add(jLabel10);
        jLabel10.setBounds(110, 50, 219, 40);

        UsernameTF.setBackground(new java.awt.Color(51, 51, 51));
        UsernameTF.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        UsernameTF.setForeground(new java.awt.Color(255, 255, 0));
        UsernameTF.setBorder(null);
        UsernameTF.setOpaque(false);
        UsernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTFActionPerformed(evt);
            }
        });
        registerPanel.add(UsernameTF);
        UsernameTF.setBounds(90, 230, 306, 30);

        jSeparator8.setForeground(new java.awt.Color(51, 255, 204));
        registerPanel.add(jSeparator8);
        jSeparator8.setBounds(30, 122, 415, 2);

        SignUpButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        SignUpButton.setForeground(new java.awt.Color(0, 0, 0));
        SignUpButton.setText("Sign Up");
        SignUpButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, null, null));
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });
        registerPanel.add(SignUpButton);
        SignUpButton.setBounds(150, 600, 170, 36);

        jSeparator9.setForeground(new java.awt.Color(51, 255, 204));
        registerPanel.add(jSeparator9);
        jSeparator9.setBounds(30, 564, 415, 2);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        registerPanel.add(jSeparator2);
        jSeparator2.setBounds(88, 258, 306, 2);

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        registerPanel.add(jSeparator5);
        jSeparator5.setBounds(88, 338, 306, 2);

        jLabel6.setBackground(java.awt.SystemColor.activeCaptionText);
        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setForeground(java.awt.SystemColor.control);
        jLabel6.setText("Email");
        registerPanel.add(jLabel6);
        jLabel6.setBounds(90, 280, 149, 30);

        ConfirmPasswordTF.setBackground(new java.awt.Color(51, 51, 51));
        ConfirmPasswordTF.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ConfirmPasswordTF.setForeground(new java.awt.Color(255, 255, 0));
        ConfirmPasswordTF.setBorder(null);
        ConfirmPasswordTF.setOpaque(false);
        ConfirmPasswordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPasswordTFActionPerformed(evt);
            }
        });
        registerPanel.add(ConfirmPasswordTF);
        ConfirmPasswordTF.setBounds(88, 468, 306, 30);

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        registerPanel.add(jSeparator6);
        jSeparator6.setBounds(88, 424, 306, 2);

        jLabel2.setBackground(java.awt.SystemColor.activeCaptionText);
        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(java.awt.SystemColor.control);
        jLabel2.setText("Confirm Password");
        registerPanel.add(jLabel2);
        jLabel2.setBounds(90, 440, 218, 30);

        EmailTF.setBackground(new java.awt.Color(51, 51, 51));
        EmailTF.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        EmailTF.setForeground(new java.awt.Color(255, 255, 0));
        EmailTF.setBorder(null);
        EmailTF.setOpaque(false);
        EmailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTFActionPerformed(evt);
            }
        });
        registerPanel.add(EmailTF);
        EmailTF.setBounds(90, 310, 306, 30);

        jLabel7.setBackground(java.awt.SystemColor.activeCaptionText);
        jLabel7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel7.setForeground(java.awt.SystemColor.control);
        jLabel7.setText("Password");
        registerPanel.add(jLabel7);
        jLabel7.setBounds(90, 360, 149, 30);

        PasswordTF.setBackground(new java.awt.Color(51, 51, 51));
        PasswordTF.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        PasswordTF.setForeground(new java.awt.Color(255, 255, 0));
        PasswordTF.setBorder(null);
        PasswordTF.setOpaque(false);
        registerPanel.add(PasswordTF);
        PasswordTF.setBounds(90, 390, 306, 30);

        jLabel5.setBackground(java.awt.SystemColor.activeCaptionText);
        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setForeground(java.awt.SystemColor.control);
        jLabel5.setText("Username");
        registerPanel.add(jLabel5);
        jLabel5.setBounds(90, 200, 149, 30);

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        registerPanel.add(jSeparator7);
        jSeparator7.setBounds(88, 504, 306, 2);

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Already have an account ?");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        registerPanel.add(jLabel12);
        jLabel12.setBounds(100, 650, 270, 40);

        getContentPane().add(registerPanel);
        registerPanel.setBounds(70, 20, 490, 720);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mylogin_back.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1420, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTFActionPerformed

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed

        String uname = UsernameTF.getText();
        String email = EmailTF.getText();
        String Pass = PasswordTF.getText();
        String CPass = ConfirmPasswordTF.getText();
        if (Pass.length() == 0 && CPass.length() == 0) {
            JOptionPane.showMessageDialog(this, "Password fields shouldn't be blank.", "ERROR !", JOptionPane.INFORMATION_MESSAGE);
        }
        if (Pass.equals(CPass) && Pass.length() != 0 && CPass.length() != 0) {
            if (uname.length() < 3) {
                JOptionPane.showMessageDialog(this, "Username must be atleast 3 chracters.", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
            } else if ((!(email.contains("@") && email.contains("."))) || (email.contains("'") || email.contains("_") || email.contains("(") || email.contains("+") || email.contains("-") || email.contains("*") || email.contains("/") || email.contains("~") || email.contains("!") || email.contains("#") || email.contains("$") || email.contains("%") || email.contains("^") || email.contains("&") || email.contains(")"))) {
                JOptionPane.showMessageDialog(this, "Given email-id isn't valid !", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
            } else if (Pass.length() < 6) {
                JOptionPane.showMessageDialog(this, "Password should be atleast 6 characters long.", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
            } else {
                try {

                    Class.forName("com.mysql.jdbc.Driver");

                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cv_resume_builder", "root", "mayank");

                    stmt = conn.createStatement();

                    rs = stmt.executeQuery("SELECT `Email` FROM `register` WHERE Email='" + email + "';");

                    if (rs.next() == true) {

                        JOptionPane.showMessageDialog(this, "Email-ID already exist.", "ERROR !", JOptionPane.ERROR_MESSAGE);
                    } else if (rs.next() == false) {
                        try {
                            {
                                try {
                                    String host = "smtp.gmail.com";
                                    String user = "info.cvresumebuilder@gmail.com";
                                    String pass = "meetmayank";
                                    // String emailid = null;
                                    // String to = "deepppatel005@gmail.com";
                                    String to = email;
                                    String from = "info.cvresumebuilder@gmail.com";
                                    String subject = "Registration Successful :) ";
                                    String messageText = "Hi "+uname+"!\n\n\nWelcome to CV Builder!\nYour Registration is Successful in CV builder.\nNow start to build your CV or Resume.\nYou can find your Job and cheers !\n\n\nThanks!\nCV Builder Team.";
                                    boolean sessionDebug = false;

                                    Properties props = System.getProperties();

                                    props.put("mail.smtp.starttls.enable", "true");
                                    props.put("mail.smtp.host", host);
                                    props.put("mail.smtp.port", "587");
                                    props.put("mail.smtp.auth", "true");
                                    props.put("mail.smtp.starttls.required", "true");

                                    Security.addProvider(new sun.security.provider.Sun());
                                    Session mailSession = Session.getDefaultInstance(props, null);
                                    mailSession.setDebug(sessionDebug);
                                    Message msg = new MimeMessage(mailSession);
                                    msg.setFrom(new InternetAddress(from));
                                    InternetAddress[] address1 = {new InternetAddress(to)};
                                    msg.setRecipients(Message.RecipientType.TO, address1);
                                    msg.setSubject(subject);
                                    msg.setSentDate(new java.util.Date());
                                    msg.setText(messageText);

                                    Transport transport = mailSession.getTransport("smtp");
                                    transport.connect(host, user, pass);
                                    transport.sendMessage(msg, msg.getAllRecipients());
                                    transport.close();
                                    System.out.println("message send successfully");

                                } catch (Exception e) {
                                    System.out.println("Exception caught --> " + e);
                                }
                            }
                            stmt.executeUpdate("INSERT INTO `register`(`UserId`, `UserName`, `Email`, `Password`,`profile`) VALUES (NULL,'" + uname + "','" + email + "','" + Pass + "',NULL);");
                            JOptionPane.showMessageDialog(this, "Successfully Registered...", "Success", JOptionPane.INFORMATION_MESSAGE);
                            registerPanel.setVisible(false);
                            LoginPanel.setVisible(true);
                            LoginPanel.setLocation(380, 55);
                        } catch (Exception e) {
                            //JOptionPane.showMessageDialog(this, "Email-ID already whyexist.", "ERROR !", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    conn.close();

                } catch (Exception e) {

                    System.out.println(e);

                }
            }
        } else if (Pass.length() != 0 && CPass.length() != 0) {
            JOptionPane.showMessageDialog(this, "Password and Confirm Password aren't matched.", "ERROR...!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SignUpButtonActionPerformed

    private void ConfirmPasswordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPasswordTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmPasswordTFActionPerformed

    private void EmailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTFActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        LoginPanel.setVisible(true);
        LoginPanel.setLocation(380, 55);
        registerPanel.setVisible(false);
        signUpInPanel.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        registerPanel.setVisible(true);
        registerPanel.setLocation(380, 55);
        LoginPanel.setVisible(false);
        signUpInPanel.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void EmailLoginTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailLoginTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailLoginTFActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        String email = EmailLoginTF.getText();
        String loginpwd = PasswordLogin.getText();
        if (loginpwd.length() == 0) {
            JOptionPane.showMessageDialog(this, "Password fields shouldn't be blank.", "ERROR !", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if ((!(email.contains("@") && email.contains("."))) || (email.contains("'") || email.contains("_") || email.contains("(") || email.contains("+") || email.contains("-") || email.contains("*") || email.contains("/") || email.contains("~") || email.contains("!") || email.contains("#") || email.contains("$") || email.contains("%") || email.contains("^") || email.contains("&") || email.contains(")"))) {
                JOptionPane.showMessageDialog(this, "Given email-id isn't valid !", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
            } else if (loginpwd.length() < 6) {
                JOptionPane.showMessageDialog(this, "Password should be atleast 6 characters long.", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
            } else {
                try {

                    Class.forName("com.mysql.jdbc.Driver");

                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cv_resume_builder", "root", "mayank");

                    stmt = conn.createStatement();

                    rs = stmt.executeQuery("SELECT * FROM `register` WHERE Email='" + EmailLoginTF.getText() + "' AND Password='" + PasswordLogin.getText() + "';");

                    if (rs.next() == true) {

                        JOptionPane.showMessageDialog(this, "Successfully Logged...!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        EmailLoginTF.setText("");
                        PasswordLogin.setText("");

                        ChooseScreen c = new ChooseScreen(rs.getInt("UserId"));
                        this.setVisible(false);
                        c.setVisible(true);
                    } else if (rs.next() == false) {
                        JOptionPane.showMessageDialog(this, "Something went wrong...", "ERROR !", JOptionPane.ERROR_MESSAGE);
                        PasswordLogin.setText("");
                    }
                    conn.close();

                } catch (Exception e) {

                    System.out.println(e);

                }
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        LoginPanel.setVisible(true);
        registerPanel.setVisible(false);
        LoginPanel.setLocation(380, 55);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        registerPanel.setVisible(true);
        LoginPanel.setVisible(false);
        registerPanel.setLocation(380, 55);

    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        LoginPanel.setVisible(false);
        changePasswordPanel.setVisible(true);
        changePasswordPanel.setLocation(380, 55);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        String pwd = changePwd.getText();
        String confirmpwd = confirmChangePwd.getText();
        if (pwd.length() == 0 && confirmpwd.length() == 0) {
            JOptionPane.showMessageDialog(this, "Password fields shouldn't be blank.", "ERROR !", JOptionPane.INFORMATION_MESSAGE);
        } else if (pwd.equals(confirmpwd) && pwd.length() != 0 && confirmpwd.length() != 0) {
            if (pwd.length() < 6) {
                JOptionPane.showMessageDialog(this, "Password should be atleast 6 characters long.", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
            }else
                
            try {

                    Class.forName("com.mysql.jdbc.Driver");

                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cv_resume_builder", "root", "mayank");

                    stmt = conn.createStatement();

                    int result = stmt.executeUpdate("UPDATE `register` SET `Password`= '"+pwd+"' WHERE Email = '"+EmailLoginTF.getText() +"';");

                    if(result == 1){
                       JOptionPane.showMessageDialog(this, "Your Password changed successfully !", "Change Password", JOptionPane.INFORMATION_MESSAGE); 
                       LoginPanel.setVisible(true);
                       LoginPanel.setLocation(380, 55);
                       changePasswordPanel.setVisible(false);
                    }else{
                        JOptionPane.showMessageDialog(this, "ERROR ocurred...! Please try again.", "Change Password", JOptionPane.INFORMATION_MESSAGE);
                    }

                    conn.close();

                } catch (Exception e) {

                    System.out.println(e);

                }
            
        }

        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void confirmChangePwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmChangePwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmChangePwdActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if (jTextField7.getText().equals("admin") && jPasswordField7.getText().equals("admin")) {
            JOptionPane.showMessageDialog(this, "Successfully Opened...!", "Success !", JOptionPane.INFORMATION_MESSAGE);
            Admin_Recruiter ad = new Admin_Recruiter();
            this.setVisible(false);
            ad.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Something went wrong...!", "ERROR !", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed

    }//GEN-LAST:event_jTextField7ActionPerformed

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        signUpInPanel.setLocation(380, 80);
        signUpInPanel.setVisible(true);
        selectGuestAdmin.setVisible(false);

    }//GEN-LAST:event_userMouseClicked

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
        adminPanel.setLocation(380, 55);
        adminPanel.setVisible(true);
        selectGuestAdmin.setVisible(false);

    }//GEN-LAST:event_adminMouseClicked

    private void guestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guestMouseClicked
        // TODO add your handling code here:
        GuestUserScreen guest1 = new GuestUserScreen();
        this.setVisible(false);
        this.dispose();
        guest1.setVisible(true);
    }//GEN-LAST:event_guestMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        adminPanel.setVisible(false);
        selectGuestAdmin.setVisible(true);
        selectGuestAdmin.setLocation(380, 70);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        signUpInPanel.setVisible(false);
        selectGuestAdmin.setVisible(true);
        selectGuestAdmin.setLocation(380, 70);
    }//GEN-LAST:event_jLabel11MouseClicked

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String args[]) throws InterruptedException {
        Start_welcome_screen s = new Start_welcome_screen();
        s.setVisible(true);
        Thread t = Thread.currentThread();
        t.sleep(3000);
        s.setVisible(false);
        s.dispose();
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
            java.util.logging.Logger.getLogger(Login_register_screen_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_register_screen_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_register_screen_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_register_screen_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_register_screen_new().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfirmPasswordTF;
    private javax.swing.JTextField EmailLoginTF;
    private javax.swing.JTextField EmailTF;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPasswordField PasswordLogin;
    private javax.swing.JPasswordField PasswordTF;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JTextField UsernameTF;
    private javax.swing.JLabel admin;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JPanel changePasswordPanel;
    private javax.swing.JPasswordField changePwd;
    private javax.swing.JPasswordField confirmChangePwd;
    private javax.swing.JLabel guest;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField7;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JPanel selectGuestAdmin;
    private javax.swing.JPanel signUpInPanel;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
