package org.nlt.view;

import org.nlt.include.MailSender;
import org.nlt.model.Users;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;


public class SignupFrame extends javax.swing.JFrame {

    public SignupFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        contactTextField = new javax.swing.JTextField();
        createAccountButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");

        jPanel1.setLayout(new java.awt.GridLayout(4, 2, 20, 10));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NAME");
        jPanel1.add(jLabel1);

        nameTextField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jPanel1.add(nameTextField);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EMAIL");
        jPanel1.add(jLabel2);

        emailTextField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(emailTextField);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CONTACT NUMBER");
        jPanel1.add(jLabel3);

        contactTextField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        contactTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(contactTextField);

        createAccountButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        createAccountButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/save.PNG"))); // NOI18N
        createAccountButton.setText("CREATE ACCOUNT");
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });
        jPanel1.add(createAccountButton);

        resetButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        resetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/cancel.png"))); // NOI18N
        resetButton.setText("RESET");
        jPanel1.add(resetButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(589, 257));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed
        try {
            String name = nameTextField.getText();
            String email = emailTextField.getText();
            String phone = contactTextField.getText();

            if (name.isEmpty() || email.isEmpty()||phone.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Account Can Not Create", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                Random r = new Random();
                String password = r.nextInt(1000000) + "";
                
                Users user=new Users();
                user.setCreated(new Date());
                user.setEmail(email);
                user.setModified(new Date());
                user.setName(name);
                user.setPassword(password);
                user.setPhone(phone);
                user.setStatus(1);
                
                SessionFactory sf=new Configuration().configure().buildSessionFactory();
                //SessionFactory sf=new Configuration().configure("org/nlt/databases/hibernate.cfg.xml").buildSessionFactory()
                Session ses = sf.openSession();
                ses.beginTransaction();
                ses.save(user);
                ses.getTransaction().commit();
                ses.close();
                sf.close();
                String msg="Your Account Details are\n Username: "+email+"\n Password: "+password;
                MailSender.send(email, "Login Authentication: Project Name", msg);
                JOptionPane.showMessageDialog(this, "Your Account Details Sent On Your Registered Email Id\n Please Check Your Email For Details", "Information", JOptionPane.INFORMATION_MESSAGE);
                new LoginFrame().setVisible(true);
                this.dispose();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_createAccountButtonActionPerformed

    private void contactTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contactTextField;
    private javax.swing.JButton createAccountButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton resetButton;
    // End of variables declaration//GEN-END:variables
}
