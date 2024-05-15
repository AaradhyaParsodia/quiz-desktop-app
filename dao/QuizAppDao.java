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
import quizApp.dbutil.DBConnection;
import quizApp.pojo.User;

/**
 *
 * @author aaradhya
 */
public class QuizAppDao {
    public static boolean validateUser(User user) throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstm = conn.prepareStatement("Select * from users where userId = ? and password = ? and userType = ?");
        
        pstm.setString(1, user.getUserId());
        pstm.setString(2, user.getPassword());
        pstm.setString(3, user.getUserType());
        ResultSet result = pstm.executeQuery();
        
        return result.next();
    }
    public static boolean validateUserByUserName(String userName) throws SQLException
    {
        Connection cntn = DBConnection.getConnection();
        PreparedStatement pstm = cntn.prepareStatement("Select * from users where userId = ? and userType = ?");
        
        pstm.setString(1, userName);
        pstm.setString(2, "Student");
        ResultSet result = pstm.executeQuery();
        
        return result.next();
    }
    public static boolean addStudent(User user) throws SQLException
    {
        Connection cntn = DBConnection.getConnection();
        PreparedStatement pstm = cntn.prepareStatement("insert into users values (?,?,?)");
        
        pstm.setString(1, user.getUserId());
        pstm.setString(2, user.getPassword());
        pstm.setString(3, user.getUserType());
        
        int result = pstm.executeUpdate();
        
        if(result == 1)
            return true;
        
        return false;
    }
    public static boolean changeStudentPassword(User user) throws SQLException
    {
        Connection cntn = DBConnection.getConnection();
        PreparedStatement pstm = cntn.prepareStatement("Update Users set password = ? where userid = ? and userType = ?");
        
        pstm.setString(1, user.getPassword());
        pstm.setString(2, user.getUserId());
        pstm.setString(3, user.getUserType());
        
        int result = pstm.executeUpdate();
        
        if(result == 1)
            return true;
        return false;
    }
}
