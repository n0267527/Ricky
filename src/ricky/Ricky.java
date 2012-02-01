package ricky;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ricky {

    public static void main(String[] args) {

        Connection db = null;
        PreparedStatement query = null;
        ResultSet results = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String room = null;
        
        
        String url = "jdbc:mysql://www.freesql.org:3306/ntupd2";
        String user = "ntupd2";
        String password = "P@ssw0rd";

        try {
            db = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.err.println("Couldn't connect to the database");
            System.err.println(e.getMessage());
        }
        System.out.println("Connected to the Database!");
        System.out.println("Setup: Enter room number...");
        try{
        room = reader.readLine();
        }
        catch (IOException ioe)
        {
           die();
        }

        String id = null;
        String session = null;


        while (true) {


            try {
                id = reader.readLine();
            } catch (IOException ioe) {
                die();
            }


            try {
                query = db.prepareStatement("INSERT INTO attendance(ntuID, sessionID, room) VALUES(?,?,?)");
                query.setString(1, id);
                query.setString(2, session);
                query.setString(3, room);
                query.executeUpdate();


            } catch (SQLException ex) {
                System.err.println("Could not add record to database");
                System.err.print(ex.getMessage());
            }
        }
    }
    public static void die()
    {
        System.err.println("Didn't understand that. Going to die now.");
        return;
    }
}