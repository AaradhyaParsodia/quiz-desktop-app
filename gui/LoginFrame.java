/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizApp.gui;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import quizApp.dao.QuizAppDao;
import quizApp.dbutil.DBConnection;
import quizApp.pojo.User;
import quizApp.pojo.UserProfile;

/**
 *
 * @author aaradhya
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    private String userName;
    private String password;
    public LoginFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        myHomePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtfUserName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        rbtnAdmin = new javax.swing.JRadioButton();
        rbtnStudent = new javax.swing.JRadioButton();
        pswdfPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");

        myHomePanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 155, 0));
        jLabel1.setText("User Login Screen");

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 155, 0));
        jLabel2.setText("UserName");

        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 155, 0));
        jLabel3.setText("Password");

        txtfUserName.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 155, 0));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 155, 0));
        jButton2.setText("Quit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 155, 0));
        jLabel4.setText("User Type");

        rbtnAdmin.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbtnAdmin);
        rbtnAdmin.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        rbtnAdmin.setForeground(new java.awt.Color(255, 155, 0));
        rbtnAdmin.setText("Admin");

        rbtnStudent.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbtnStudent);
        rbtnStudent.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        rbtnStudent.setForeground(new java.awt.Color(255, 155, 0));
        rbtnStudent.setText("Student");

        pswdfPassword.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        javax.swing.GroupLayout myHomePanelLayout = new javax.swing.GroupLayout(myHomePanel);
        myHomePanel.setLayout(myHomePanelLayout);
        myHomePanelLayout.setHorizontalGroup(
            myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myHomePanelLayout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myHomePanelLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(myHomePanelLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(rbtnStudent))
                            .addGroup(myHomePanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(myHomePanelLayout.createSequentialGroup()
                            .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(29, 29, 29)
                            .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtfUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                .addComponent(pswdfPassword)))
                        .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rbtnAdmin)
                            .addComponent(jLabel4)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
        myHomePanelLayout.setVerticalGroup(
            myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myHomePanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(myHomePanelLayout.createSequentialGroup()
                        .addComponent(pswdfPassword)
                        .addGap(1, 1, 1)))
                .addGap(30, 30, 30)
                .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnStudent)
                    .addComponent(rbtnAdmin))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myHomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(myHomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean checkInput = validateInput();
        if(!checkInput)
        {
            JOptionPane.showMessageDialog(null, "Please Fill Username and Password First","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        String userType = getUserType();
        if(userType==null)
        {
            JOptionPane.showMessageDialog(null, "Please Select Usertype First","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try
        {
            User user = new User();
            user.setUserId(userName);
            user.setPassword(password);
            user.setUserType(userType);
            boolean validateUser = QuizAppDao.validateUser(user);
            
            if(validateUser)
            {
                JOptionPane.showMessageDialog(null, "Login Accepted!","Success",JOptionPane.INFORMATION_MESSAGE);

                UserProfile.setUserName(userName);
                UserProfile.setUserType(userType);

                if(userType=="Admin")
                {
                    AdminOptionFrame adminFrame = new AdminOptionFrame();
                    adminFrame.setVisible(true);
                    this.dispose();
                }
                else if(userType=="Student")
                {
                    StudentOptionFrame studentOption = new StudentOptionFrame();
                    studentOption.setVisible(true);
                    this.dispose();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please check details this user does not exits in the database","User Not Found",JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "!DB Error!","Login Frame Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null, "Thank You For Using The App :)","Thanks",JOptionPane.INFORMATION_MESSAGE);
        DBConnection.closeConnection();
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel myHomePanel;
    private javax.swing.JPasswordField pswdfPassword;
    private javax.swing.JRadioButton rbtnAdmin;
    private javax.swing.JRadioButton rbtnStudent;
    private javax.swing.JTextField txtfUserName;
    // End of variables declaration//GEN-END:variables


    private boolean validateInput()
        {
            userName = txtfUserName.getText();
            char[] pswd = pswdfPassword.getPassword();
            if(userName.isEmpty()||pswd.length==0)
                return false;
            password = String.valueOf(pswd);
            return true;
        }
    
    private String getUserType()
    {
        if(rbtnAdmin.isSelected())
            return rbtnAdmin.getText();
        else if(rbtnStudent.isSelected())
            return rbtnStudent.getText();
        else
            return null;
    }
}