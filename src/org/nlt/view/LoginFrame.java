package org.nlt.view;

import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.nlt.model.Users;

public class LoginFrame extends javax.swing.JFrame implements MainInterface{

    public LoginFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        forgotPasswordButton = new javax.swing.JButton();
        signUpLabel = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Login");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(3, 2, 20, 10));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USERNAME");
        jPanel1.add(jLabel2);

        usernameTextField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        usernameTextField.setText("anuraghosekar04@gmail.com");
        jPanel1.add(usernameTextField);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PASSWORD");
        jPanel1.add(jLabel3);

        passwordTextField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        passwordTextField.setText("4");
        jPanel1.add(passwordTextField);

        jPanel2.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        loginButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/Login.png"))); // NOI18N
        loginButton.setText("LOGIN");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel2.add(loginButton);

        resetButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        resetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/delete.PNG"))); // NOI18N
        resetButton.setText("RESET");
        jPanel2.add(resetButton);

        jPanel1.add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        forgotPasswordButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        forgotPasswordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/cancel.png"))); // NOI18N
        forgotPasswordButton.setText("FORGOT");
        jPanel3.add(forgotPasswordButton);

        signUpLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        signUpLabel.setForeground(new java.awt.Color(0, 0, 153));
        signUpLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signUpLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/save.PNG"))); // NOI18N
        signUpLabel.setText("SIGNUP");
        signUpLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpLabelMouseClicked(evt);
            }
        });
        jPanel3.add(signUpLabel);

        jPanel1.add(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(626, 192));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signUpLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLabelMouseClicked
        new SignupFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signUpLabelMouseClicked

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        
        try
        {
            String username=usernameTextField.getText();
            String password=passwordTextField.getText();
            session.beginTransaction();
            Query query = session.createQuery("from Users where email='"+username+"' and password='"+password+"' and status=1");
            List<Users> userlist= query.list();
           // System.out.println(userlist.size());
           session.getTransaction().commit();           
           if(userlist.size()>0)
           {
               Users user=userlist.get(0);
              loginUser.setId(user.getId());
              loginUser.setEmail(user.getEmail());
              loginUser.setName(user.getName());
              loginUser.setPhone(user.getPhone());
              
              stateService.setStateMap();
              cityService.setCityMap();
              personFrame.setCityComboBox();
              personService.setPersonMap();
              personFrame.setTableData();
              personFrame.setStateComboBox();
              personFrame.setVisible(true);
              personFrame.setTitle("Login: "+user.getName());
              this.dispose();
           }
           else
           {
               JOptionPane.showMessageDialog(this, "Invalid Username or password", "Login Frame", JOptionPane.ERROR_MESSAGE);
               this.dispose();
               MainInterface.closeDatabaseConnection();
           }
           

                        
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex, "Login Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        MainInterface.closeDatabaseConnection();
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton forgotPasswordButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel signUpLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
