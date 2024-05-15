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
import quizApp.pojo.Performance;
import quizApp.pojo.StudentResult;

/**
 *
 * @author aaradhya
 */
public class PerformanceDao {
    public static void addPerformance(Performance perf) throws SQLException
    {
        Connection cntn = DBConnection.getConnection();
        PreparedStatement pstm = cntn.prepareStatement("insert into performance values (?,?,?,?,?,?,?)");
        
        pstm.setString(1, perf.getUserId());
        pstm.setString(2, perf.getExamId());
        pstm.setInt(3, perf.getRight());
        pstm.setInt(4, perf.getWrong());
        pstm.setInt(5, perf.getUnattempted());
        pstm.setDouble(6, perf.getPer());
        pstm.setString(7, perf.getLanguage());
        
        pstm.executeUpdate();
        
    }
    public static ArrayList<String> getAllStudentName() throws SQLException
    {
        Connection cntn = DBConnection.getConnection();
        Statement stm = cntn.createStatement();
        
        ResultSet result = stm.executeQuery("select distinct userId from performance order by userId");
        
        ArrayList<String> studentName = new ArrayList<>();
        
        while(result.next())
        {
            studentName.add(result.getString(1));
        }
        return studentName;
    }
    public static ArrayList<String> getAllExamId(String userName) throws SQLException
    {
        Connection cntn = DBConnection.getConnection();
        PreparedStatement pstm = cntn.prepareStatement("select examID from performance where userId = ? order by examid");
        
        pstm.setString(1, userName);
        
        ResultSet result = pstm.executeQuery();
        
        ArrayList<String> examId = new ArrayList<>();
        
        while(result.next())
        {
            examId.add(result.getString(1));
        }
        return examId;
    }
    public static StudentResult getPerformanceByUserIdExamId(String userId, String examId) throws SQLException
    {
        Connection cntn = DBConnection.getConnection();
        PreparedStatement pstm = cntn.prepareStatement("select language, per from performance where userId = ? and examId = ?");
        
        pstm.setString(1, userId);
        pstm.setString(2, examId);
        
        ResultSet result = pstm.executeQuery();
        
        result.next();
        
        StudentResult perf = new StudentResult();
        
        perf.setLanguage(result.getString(1));
        perf.setPercentage(result.getDouble(2));
        
        return perf;
    }
    public static ArrayList<Performance> getAllData() throws SQLException
    {
        Connection cntn = DBConnection.getConnection();
        Statement stm = cntn.createStatement();
        
        ResultSet result = stm.executeQuery("select * from performance order by ExamId, userId");
        
        ArrayList<Performance> studentData = new ArrayList<>();
        
        Performance perf = new Performance();
        
        while(result.next())
        {
            perf.setUserId(result.getString(1));
            perf.setExamId(result.getString(2));
            perf.setRight(result.getInt(3));
            perf.setWrong(result.getInt(4));
            perf.setUnattempted(result.getInt(5));
            perf.setPer(result.getDouble(6));
            perf.setLanguage(result.getString(7));
            
            studentData.add(perf);
        }
        
        return studentData;
    }
}
