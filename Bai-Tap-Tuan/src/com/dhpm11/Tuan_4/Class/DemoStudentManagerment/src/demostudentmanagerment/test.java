/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostudentmanagerment;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Suong
 */
public class test {

    public static void main(String[] args) {
        con();
    }

    public static Connection con() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbemployee", "root", "");
            System.out.println("kết nối r");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
