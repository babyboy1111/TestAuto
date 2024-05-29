/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import db.DBcontext;
import moder.UserDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ADMIN
 */
public class UserDAO extends DBcontext{
    public UserDTO checkLogin(String user, String Pass) {
        try {
            String sql = "SELECT userid , fullname , password , roleid"
                        + " FROM tblUsers WHERE userid = ? AND password = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, user);
            stm.setString(2, Pass);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                UserDTO a = new UserDTO();
                a.setId(rs.getString("userid"));
                a.setFullname(rs.getString("fullname"));
                a.setPass(rs.getString("password"));
                a.setRole(rs.getInt("roleid"));
                return a;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
