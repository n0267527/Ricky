package ricky;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ricky {

    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        String url = "jdbc:mysql://www.freesql.org:3306/ntupd2";
        String user = "ntupd2";
        String password = "P@ssw0rd";
//
//        try {
//            con = DriverManager.getConnection(url, user, password);
//            st = con.createStatement();
//            System.out.println("abc");
//            rs = st.executeQuery("SELECT VERSION()");
//
//            if (rs.next()) {
//                System.out.println(rs.getString(1));
//                System.out.println("def");
//            }
//
//        } catch (SQLException ex) {
//            Logger lgr = Logger.getLogger(Ricky.class.getName());
//            lgr.log(Level.SEVERE, ex.getMessage(), ex);
//
//        } finally {
//            try {
//                if (rs != null) {
//                    rs.close();
//                }
//                if (st != null) {
//                    st.close();
//                }
//                if (con != null) {
//                    con.close();
//                }
//
//            } catch (SQLException ex) {
//                Logger lgr = Logger.getLogger(Ricky.class.getName());
//                lgr.log(Level.WARNING, ex.getMessage(), ex);
//            }
//      }
    }
}