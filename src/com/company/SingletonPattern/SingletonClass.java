package com.company.SingletonPattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SingletonClass {

    private static SingletonClass instance = null;

    //Create instance
    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    //Create connection
    private static Connection getConnection()throws ClassNotFoundException, SQLException
    {

        Connection con=null;
        Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3300/kritigoyal", "root", "1234");
        return con;

    }

    //to insert the record into the database
    public int insert(String name, String pass) throws SQLException
    {
        Connection c=null;
        PreparedStatement ps=null;
        int recordCounter=0;
        try {

            c=this.getConnection();
            ps=c.prepareStatement("insert into userdata(uname,upassword)values(?,?)");
            ps.setString(1, name);
            ps.setString(2, pass);
            recordCounter=ps.executeUpdate();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            if (ps!=null){
                ps.close();
            }if(c!=null){
                c.close();
            }
        }
        return recordCounter;
    }
}
