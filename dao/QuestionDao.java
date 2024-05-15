/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizApp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import quizApp.dbutil.DBConnection;
import quizApp.pojo.QuestionStore;
import quizApp.pojo.Questions;

/**
 *
 * @author aaradhya
 */
public class QuestionDao {
    public static void addQuestion(QuestionStore qStore) throws SQLException
    {
        Connection cntn = DBConnection.getConnection();
        PreparedStatement pstm = cntn.prepareStatement("insert into questions values(?,?,?,?,?,?,?,?,?)");
        ArrayList<Questions> questionList = qStore.getAllQuestion();
        for(Questions ques: questionList)
        {
            
            pstm.setString(1, ques.getExamId());
            pstm.setInt(2, ques.getQuesNo());
            pstm.setString(3, ques.getQuestion());
            pstm.setString(4, ques.getAnswer1());
            pstm.setString(5, ques.getAnswer2());
            pstm.setString(6, ques.getAnswer3());
            pstm.setString(7, ques.getAnswer4());
            pstm.setString(8, ques.getCorrectAnswer());
            pstm.setString(9, ques.getLanguage());
            
            pstm.executeUpdate();
            
        }
    }
    public static ArrayList<Questions> getQuestionsById(String examId) throws SQLException
    {
        Connection cntn = DBConnection.getConnection();
        PreparedStatement pstm = cntn.prepareStatement("select * from Questions where examId = ?");
        pstm.setString(1, examId);
        ResultSet result = pstm.executeQuery();
        ArrayList<Questions> questionList = new ArrayList<>();
        while(result.next())
        {
            int quesNo = result.getInt(2);
            String question = result.getString(3);
            String opt1 = result.getString(4);
            String opt2 = result.getString(5);
            String opt3 = result.getString(6);
            String opt4 = result.getString(7);
            String crtAns = result.getString(8);
            String languege = result.getString(9);
            
            Questions editQues = new Questions(examId,quesNo,question,opt1,opt2,opt3,opt4,crtAns,languege);
            
            questionList.add(editQues);
            
        }
        return questionList;
    }
    public static void editQuestion(QuestionStore qStore) throws SQLException
    {
        Connection cntn = DBConnection.getConnection();
        PreparedStatement pstm = cntn.prepareStatement("Update questions set question = ?,answer1 = ?,answer2 = ?,answer3 = ?,answer4 = ?, correct_answer = ? where examId = ? and qNo = ? and language = ?");
        ArrayList<Questions> questionList = qStore.getAllQuestion();
        for(Questions ques: questionList)
        {
            
            pstm.setString(1, ques.getQuestion());
            pstm.setString(2, ques.getAnswer1());
            pstm.setString(3, ques.getAnswer2());
            pstm.setString(4, ques.getAnswer3());
            pstm.setString(5, ques.getAnswer4());
            pstm.setString(6, ques.getCorrectAnswer());
            pstm.setString(7, ques.getExamId());
            pstm.setInt(8, ques.getQuesNo());
            pstm.setString(9, ques.getLanguage());
            
            pstm.executeUpdate();
            
        }
    }
}
