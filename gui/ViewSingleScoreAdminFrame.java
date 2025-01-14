/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizApp.gui;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import quizApp.dao.PerformanceDao;
import quizApp.pojo.Performance;
import quizApp.pojo.StudentResult;
import quizApp.pojo.UserProfile;

/**
 *
 * @author aaradhya
 */
public class ViewSingleScoreAdminFrame extends javax.swing.JFrame {

    /**
     * Creates new form ViewSingleScoreFrame
     */
    private String userName;
    private String examId;
    
    private int count;
    
    public ViewSingleScoreAdminFrame() {
        initComponents();
        setLocationRelativeTo(null);
        
        lblUserName.setText(lblUserName.getText()+UserProfile.getUserName());
        count=0;
        showStudents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myHomePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblUserName = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbbStudent = new javax.swing.JComboBox<>();
        cbbExamId = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtfLanguage = new javax.swing.JTextField();
        txtfPercentage = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        myHomePanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student Score Details");

        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 155, 0));
        jLabel3.setText("Select Student");

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setForeground(new java.awt.Color(255, 155, 0));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblUserName.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 155, 55));
        lblUserName.setText("Hello, ");

        lblLogout.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 155, 55));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 155, 0));
        jLabel1.setText("SINGLE STUDENT SCORE PANEL");

        jLabel5.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 155, 0));
        jLabel5.setText("Select Exam Id");

        cbbStudent.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        cbbStudent.setMaximumRowCount(4);
        cbbStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbStudentActionPerformed(evt);
            }
        });

        cbbExamId.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        cbbExamId.setMaximumRowCount(4);
        cbbExamId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbExamIdActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 155, 0));
        jLabel4.setText("Language");

        jLabel6.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 155, 0));
        jLabel6.setText("Percentage ");

        txtfLanguage.setEditable(false);

        txtfPercentage.setEditable(false);

        javax.swing.GroupLayout myHomePanelLayout = new javax.swing.GroupLayout(myHomePanel);
        myHomePanel.setLayout(myHomePanelLayout);
        myHomePanelLayout.setHorizontalGroup(
            myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myHomePanelLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(myHomePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(myHomePanelLayout.createSequentialGroup()
                                .addComponent(cbbStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(cbbExamId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(myHomePanelLayout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92))))
                    .addGroup(myHomePanelLayout.createSequentialGroup()
                        .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, myHomePanelLayout.createSequentialGroup()
                                .addComponent(txtfLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(myHomePanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(myHomePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45))
                                    .addGroup(myHomePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(73, 73, 73)))))
                        .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myHomePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myHomePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myHomePanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myHomePanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(77, 77, 77))))
        );
        myHomePanelLayout.setVerticalGroup(
            myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myHomePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogout)
                    .addComponent(lblUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbExamId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myHomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myHomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ViewScoreAdminFrame viewScoreFrame = new ViewScoreAdminFrame();
        viewScoreFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        lblLogout.setForeground(Color.white);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        lblLogout.setForeground(new Color(255,155,0));
    }//GEN-LAST:event_lblLogoutMouseExited

    private void cbbStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbStudentActionPerformed
        clearAll();
        if(cbbStudent.getSelectedIndex()!=0)
        {
            
            userName = cbbStudent.getSelectedItem().toString();
            try
            {
                ArrayList<String> studentExamId = PerformanceDao.getAllExamId(userName);
                for(String studentExam: studentExamId)
                {
                    cbbExamId.addItem(studentExam);
                }
                count++;
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "!DB Error!","View Single Score Admin Frame Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
            
        }
//        else
//        {
//            JOptionPane.showMessageDialog(null, "Please Select a Student","Choose Someone",JOptionPane.ERROR_MESSAGE);
//            clearAll(); 
//        }
        
    }//GEN-LAST:event_cbbStudentActionPerformed

    private void cbbExamIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbExamIdActionPerformed
        
        if(cbbStudent.getSelectedIndex()<1)
        {
            JOptionPane.showMessageDialog(null, "Please Select a Student","Choose Someone",JOptionPane.INFORMATION_MESSAGE);
            clearAll();
            return;
        }
        if(cbbExamId.getItemCount()<=0)return;
        examId = cbbExamId.getSelectedItem().toString();
        txtfLanguage.setText("");
        txtfPercentage.setText("");
        try
        {
            StudentResult perf = PerformanceDao.getPerformanceByUserIdExamId(userName, examId);
            txtfLanguage.setText(perf.getLanguage());
            txtfPercentage.setText(String.valueOf(perf.getPercentage()));
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "!DB Error!","View Single Score Admin Frame Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
        
    }//GEN-LAST:event_cbbExamIdActionPerformed

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
            java.util.logging.Logger.getLogger(ViewSingleScoreAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSingleScoreAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSingleScoreAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSingleScoreAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSingleScoreAdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cbbExamId;
    private javax.swing.JComboBox<String> cbbStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel myHomePanel;
    private javax.swing.JTextField txtfLanguage;
    private javax.swing.JTextField txtfPercentage;
    // End of variables declaration//GEN-END:variables

    private void showStudents() {
        try
        {
            cbbStudent.addItem("");
            ArrayList<String> student = PerformanceDao.getAllStudentName();
            for(String studentName: student)
            {
                cbbStudent.addItem(studentName);
            }
            
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "!DB Error!","View Single Score Admin Frame Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    private void clearAll() {
        cbbExamId.removeAllItems();
        txtfLanguage.setText("");
        txtfPercentage.setText("");
    }
}
