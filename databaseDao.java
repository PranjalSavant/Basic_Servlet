 import java.awt.*;
 import java.lang.*; 
 import java.sql.*;
 public class databaseDao implements DataAccessObject{
    public void save(String user,String pass){
       

        try{
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                //create connection"
                String url="jdbc:mysql://localhost:3306/kit";//if database chages protocol changes
                String username="root";
                String password="12345";
                Connection con;

                    con=DriverManager.getConnection(url,username,password);
                    System.out.println("connected to DB");
                //create and run query
                String query="insert into users (username,password) values(?,?)";
                PreparedStatement ps = con.prepareStatement(query);
               
                ps.setString(1,user);
                ps.setString(2,pass);
                ps.executeUpdate();

                // close the connection
                con.close();
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }

}

// url=protocol://ipaddress:portno/dbname   jdbc:mysql://localhost:3306
 // System.out.println("saved data in database");
 //load the driver
 //System.out.println("Driver Loaded");