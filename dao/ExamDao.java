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
import java.sql.Statement;
import java.util.ArrayList;
import quizApp.dbutil.DBConnection;
import quizApp.pojo.Exam;

/**
 *
 * @author aaradhya
 */
public class ExamDao {
    public static String getExamId() throws SQLException
    {
        Connection cntn = DBConnection.getConnection();
        Statement stm = cntn.createStatement();
        ResultSet result = stm.executeQuery("select count(*) from exam");
        result.next();
        int count = result.getInt(1);
        return "EX-"+(count+1);
    }
    public static boolean addExam(Exam exam) throws SQLException
    {
        Connection cntn = DBConnection.getConnection();
        PreparedStatement pstm = cntn.prepareStatement("insert into exam values(?,?,?)");
        pstm.setString(1, exam.getExamId());
        pstm.setString(2, exam.getLanguage());
        pstm.setInt(3, exam.getTotalQuestion());
        
        int result = pstm.executeUpdate();
        return (result==1);
        
    }
    public static ArrayList<String> getExamIdBySubject(String subject) throws SQLException
    {
        Connection cntn = DBConnection.getConnection();
        PreparedStatement pstm = cntn.prepareStatement("select examId from exam where language = ?");
        pstm.setString(1, subject);
        ResultSet result = pstm.executeQuery();
        ArrayList examIdList = new ArrayList<>();
        while(result.next())
        {
            examIdList.add(result.getString(1));
        }
        return examIdList;
    }
    public static int getQuestionCountByExamId(String examId) throws SQLException
    {
        Connection cntn = DBConnection.getConnection();
        PreparedStatement pstm = cntn.prepareStatement("select total_question from exam where examId = ?");
        pstm.setString(1, examId);
        ResultSet result = pstm.executeQuery();
        result.next();
        return (result.getInt(1));
    }
    public static boolean isPaperSet(String subject) throws SQLException
    {
        Connection cntn = DBConnection.getConnection();
        PreparedStatement pstm = cntn.prepareStatement("select 1 from exam where language = ?");
        
        pstm.setString(1, subject);
        ResultSet result = pstm.executeQuery();
        
        return (result.next());
    }
    public static ArrayList<String> getExamIdBySubject(String userId, String subject) throws SQLException
    {
        Connection cntn = DBConnection.getConnection();
        
        String query = "select examId from exam where language = ? minus select examId from Performance where userId = ?";
        PreparedStatement pstm = cntn.prepareStatement(query);
        
        pstm.setString(1, subject);
        pstm.setString(2, userId);
        ResultSet result = pstm.executeQuery();
        
        ArrayList examIdList = new ArrayList<>();
        
        while(result.next())
        {
            examIdList.add(result.getString(1));
        }
        return examIdList;
    }
}
