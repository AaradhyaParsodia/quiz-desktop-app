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
import quizApp.dao.QuestionDao;
import quizApp.pojo.Answer;
import quizApp.pojo.AnswerStore;
import quizApp.pojo.Exam;
import quizApp.pojo.Performance;
import quizApp.pojo.QuestionStore;
import quizApp.pojo.Questions;
import quizApp.pojo.UserProfile;

/**
 *
 * @author aaradhya
 */
public class TakeTestFrame extends javax.swing.JFrame {

    int count = 0;
    /**
     * Creates new form TakeTestFrame
     */
    private int quesNo;
    private int pos = 0;
    
    private String quesHead;
    private String title;
    
    private QuestionStore quesList;
    private AnswerStore ansList;
    private Exam exam;
    
    public TakeTestFrame() {
        initComponents();
        setLocationRelativeTo(null);
        lblUserName.setText(lblUserName.getText()+UserProfile.getUserName());
        
        quesList = new QuestionStore();
        ansList = new AnswerStore();
        
        quesHead = lblQuestionNo.getText().trim();
        title = lblTitle.getText().trim();
        
        quesNo = 1;
        
    }
    
    public TakeTestFrame(Exam studExam)
    {
        this();
        this.exam = studExam;
        
        lblTitle.setText(exam.getLanguage().toUpperCase()+" "+title);
        lblQuestionNo.setText(quesHead+" "+quesNo);
        
        
        loadQuestions();
        showQuestions();
        
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
        jLabel6 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnPrevious = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaQuestion = new javax.swing.JTextArea();
        btnNext = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnDone = new javax.swing.JButton();
        lblQuestionNo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        rbtnOption1 = new javax.swing.JRadioButton();
        rbtnOption2 = new javax.swing.JRadioButton();
        rbtnOption3 = new javax.swing.JRadioButton();
        rbtnOption4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        myHomePanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 155, 0));
        jLabel6.setText("Option 4 :-");

        lblTitle.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 155, 0));
        lblTitle.setText("PAPER QUESTION");

        btnPrevious.setBackground(new java.awt.Color(0, 0, 0));
        btnPrevious.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(255, 155, 0));
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        txtaQuestion.setColumns(20);
        txtaQuestion.setRows(5);
        jScrollPane1.setViewportView(txtaQuestion);

        btnNext.setBackground(new java.awt.Color(0, 0, 0));
        btnNext.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 155, 0));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 155, 0));
        jLabel3.setText("Option 1 :-");

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 155, 0));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 155, 0));
        jLabel4.setText("Option 2 :-");

        btnDone.setBackground(new java.awt.Color(0, 0, 0));
        btnDone.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        btnDone.setForeground(new java.awt.Color(255, 155, 0));
        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        lblQuestionNo.setBackground(new java.awt.Color(0, 0, 0));
        lblQuestionNo.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        lblQuestionNo.setForeground(new java.awt.Color(255, 155, 0));
        lblQuestionNo.setText("Question No.: ");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 155, 0));
        jLabel5.setText("Option 3 :-");

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

        rbtnOption1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbtnOption1);
        rbtnOption1.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        rbtnOption1.setForeground(new java.awt.Color(255, 155, 0));

        rbtnOption2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbtnOption2);
        rbtnOption2.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        rbtnOption2.setForeground(new java.awt.Color(255, 155, 0));

        rbtnOption3.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbtnOption3);
        rbtnOption3.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        rbtnOption3.setForeground(new java.awt.Color(255, 155, 0));

        rbtnOption4.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbtnOption4);
        rbtnOption4.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        rbtnOption4.setForeground(new java.awt.Color(255, 155, 0));

        javax.swing.GroupLayout myHomePanelLayout = new javax.swing.GroupLayout(myHomePanel);
        myHomePanel.setLayout(myHomePanelLayout);
        myHomePanelLayout.setHorizontalGroup(
            myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myHomePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myHomePanelLayout.createSequentialGroup()
                        .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogout))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myHomePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)))
                .addContainerGap())
            .addGroup(myHomePanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myHomePanelLayout.createSequentialGroup()
                        .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(myHomePanelLayout.createSequentialGroup()
                                    .addGap(83, 83, 83)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myHomePanelLayout.createSequentialGroup()
                                    .addComponent(lblQuestionNo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(339, 339, 339)))
                            .addGroup(myHomePanelLayout.createSequentialGroup()
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(btnPrevious)
                                .addGap(61, 61, 61)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(78, Short.MAX_VALUE))
                    .addGroup(myHomePanelLayout.createSequentialGroup()
                        .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(myHomePanelLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myHomePanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rbtnOption3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbtnOption1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)))
                        .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(myHomePanelLayout.createSequentialGroup()
                                .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(231, 231, 231))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myHomePanelLayout.createSequentialGroup()
                                .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rbtnOption2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbtnOption4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(100, 100, 100))))))
        );
        myHomePanelLayout.setVerticalGroup(
            myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myHomePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogout)
                    .addComponent(lblUserName))
                .addGap(40, 40, 40)
                .addComponent(lblTitle)
                .addGap(126, 126, 126)
                .addComponent(lblQuestionNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnOption1)
                    .addComponent(rbtnOption2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnOption3)
                    .addComponent(rbtnOption4))
                .addGap(41, 41, 41)
                .addGroup(myHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnCancel)
                    .addComponent(btnPrevious)
                    .addComponent(btnDone))
                .addGap(60, 60, 60))
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

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed

        String choosenAnswer = getUserAns();
        
        if(choosenAnswer != null)
        {
            Questions ques = quesList.getQuestionByQno(quesNo);
            String correctAnswer = ques.getCorrectAnswer();
            
            Answer ans = new Answer(exam.getExamId(),exam.getLanguage(),quesNo,choosenAnswer,correctAnswer);
            
            Answer attemptedAns = ansList.getAnswerByQno(quesNo);    
            
            if(attemptedAns == null)
            {
                ansList.addAnswer(ans); 
            }
            else
            {
                String previousAns = attemptedAns.getChoosenAnswer();
                if(previousAns.equals(choosenAnswer) == false)
                {
                    int ansPos = ansList.removeAnswer(attemptedAns);
                    ansList.setAnswerAt(ansPos, ans);
                }
            }   
        }
        
        pos--;

        if(pos < 0)
        {
            pos = quesList.getCount() - 1;
        }
        
        quesNo--;

        
        if(quesNo <= 0)
        {
            quesNo = quesList.getCount() ;
        }

        lblQuestionNo.setText(quesHead+" "+(quesNo));

        showQuestions();


    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
         
        String choosenAnswer = getUserAns();
        
        if(choosenAnswer != null)
        {
            Questions ques = quesList.getQuestionByQno(quesNo);
//            System.out.println("Ques No: "+quesNo);
//            System.out.println("QuesList: "+ques);
            String correctAnswer = ques.getCorrectAnswer();
            
            Answer ans = new Answer(exam.getExamId(),exam.getLanguage(),quesNo,choosenAnswer,correctAnswer);
//            System.out.println(ans);
            Answer attemptedAns = ansList.getAnswerByQno(quesNo);    
            
            if(attemptedAns == null)
            {
//                System.out.println("Count: "+count++);
                ansList.addAnswer(ans); 
            }
            else
            {
                String previousAns = attemptedAns.getChoosenAnswer();
                if(previousAns.equals(choosenAnswer) == false)
                {
                    int ansPos = ansList.removeAnswer(attemptedAns);
                    ansList.setAnswerAt(ansPos, ans);
                }
            }
            
        }
        
        pos++;

        if(pos >= quesList.getCount())
        {
            pos = 0;
        }
        
        quesNo++;

        
        if(quesNo>quesList.getCount())
        {
            quesNo = 1;
        }

        lblQuestionNo.setText(quesHead+" "+(quesNo));

        showQuestions();

    }//GEN-LAST:event_btnNextActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        ChoosePaperFrame choosePaper = new ChoosePaperFrame();
        choosePaper.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed

        String choosenAnswer = getUserAns();
        
        if(choosenAnswer != null)
        {
            Questions ques = quesList.getQuestionByQno(quesNo);
            String correctAnswer = ques.getCorrectAnswer();
            
            Answer ans = new Answer(exam.getExamId(),exam.getLanguage(),quesNo,choosenAnswer,correctAnswer);
            
            Answer attemptedAns = ansList.getAnswerByQno(quesNo);    
            
            if(attemptedAns == null)
            {
                ansList.addAnswer(ans); 
            }
            else
            {
                String previousAns = attemptedAns.getChoosenAnswer();
                if(previousAns.equals(choosenAnswer) == false)
                {
                    int ansPos = ansList.removeAnswer(attemptedAns);
                    ansList.setAnswerAt(ansPos, ans);
                }
            }
            
        }
        
        int right = 0, wrong = 0;
        for(Questions ques : quesList.getAllQuestion())
        {
            int qno = ques.getQuesNo();
            Answer ans = ansList.getAnswerByQno(qno);
            if(ans == null)
                continue;
            String chooseAnswer = ans.getChoosenAnswer();
            String correctAnswer = ans.getCorrectAnswer();
            if(chooseAnswer.equals(correctAnswer))
                ++right;
            else
                ++wrong;
        }
        StringBuilder strBld = new StringBuilder();
        strBld.append("\nRight Answer's: "+right);
        strBld.append("\nWrong Answer's: "+wrong);
        strBld.append("\nUnattempted: "+(quesList.getCount() - (right+wrong)));
        JOptionPane.showMessageDialog(null,strBld.toString(),"Result",JOptionPane.INFORMATION_MESSAGE);
        
        try
        {
            Performance perf = new Performance(
                    exam.getExamId(),
                    exam.getLanguage(),
                    UserProfile.getUserName(),
                    right,
                    wrong,
                    (quesList.getCount() - (right+wrong)),
                    (double)(right*100/exam.getTotalQuestion())
            );
            PerformanceDao.addPerformance(perf);
            JOptionPane.showMessageDialog(null, "Result Saved !\nThank You For The Test","Done",JOptionPane.INFORMATION_MESSAGE);
            ChoosePaperFrame choosePaper = new ChoosePaperFrame();
            choosePaper.setVisible(true);
            this.dispose();
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "!DB Error!","Take Test Frame Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btnDoneActionPerformed

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
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeTestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblQuestionNo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel myHomePanel;
    private javax.swing.JRadioButton rbtnOption1;
    private javax.swing.JRadioButton rbtnOption2;
    private javax.swing.JRadioButton rbtnOption3;
    private javax.swing.JRadioButton rbtnOption4;
    private javax.swing.JTextArea txtaQuestion;
    // End of variables declaration//GEN-END:variables

    private void loadQuestions() {
        try
        {
            ArrayList<Questions> quesSet = QuestionDao.getQuestionsById(exam.getExamId());
            for(Questions ques: quesSet)
            {
                quesList.addQuestion(ques);
            }
//            System.out.println(quesList);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "!DB Error!","Take Test Frame Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    private void showQuestions() {
        
        
        Questions ques = quesList.getQuestion(pos);
        
        buttonGroup1.clearSelection();
        
        txtaQuestion.setText(ques.getQuestion());
        rbtnOption1.setText(ques.getAnswer1());
        rbtnOption2.setText(ques.getAnswer2());
        rbtnOption3.setText(ques.getAnswer3());
        rbtnOption4.setText(ques.getAnswer4());
        
        Answer ans = ansList.getAnswerByQno(quesNo);    
        if(ans == null)
        {
            return;
        }
        String selAns = ans.getChoosenAnswer();
//        System.out.println("selected Ans: "+selAns);
        switch(selAns)
        {
            case "Answer1":
                rbtnOption1.setSelected(true);
                break;
            case "Answer2":
                rbtnOption2.setSelected(true);
                break;
            case "Answer3":
                rbtnOption3.setSelected(true);
                break;
            case "Answer4":
                rbtnOption4.setSelected(true);
                break;
        }
    }
    
    private String getUserAns()
    {
        if(rbtnOption1.isSelected()==true)
            return "Answer1";
        else if(rbtnOption2.isSelected()==true)
            return "Answer2";
        else if(rbtnOption3.isSelected()==true)
            return "Answer3";
        else if(rbtnOption4.isSelected()==true)
            return "Answer4";
        else
            return null;
    }
}
