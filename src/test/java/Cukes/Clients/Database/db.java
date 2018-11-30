package Cukes.Clients.Database;

import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by OzorakM on 27.6.2018.
 */
@Service
public class db {

    private Connection connection;
    public boolean isConnected;
    public java.sql.Connection getConnection(){return connection;}

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String user;
    private String password;

    public void connectIt()
    {

        try
        {
            isConnected=false;
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Missing Oracle JDBC Driver");
            e.printStackTrace();
            return;
        }
        System.out.println("Driver intialized");
        connection = null;
        try
        {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@10.23.110.22:1521:tCSSBF",user,password);
            isConnected=true;
        }
        catch(SQLException e)
        {

            e.printStackTrace();
            return;
        }

        if(connection != null)
        {
            try {
                System.out.println("DB Connected");

            }
            catch (Exception e)
            {
                System.out.println("Error!");
                e.printStackTrace();
                return;
            }
        }
        else
        {
            System.out.println("Connection failed");
        }
    }

    public void disconnectIt()
    {
        try {
            connection.close();
            System.out.println("DB Connection closed");
        }
        catch (Exception e)
        {
            System.out.println("Error!");
            e.printStackTrace();
            return;
        }
    }
}
