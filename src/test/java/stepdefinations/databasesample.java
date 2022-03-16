package stepdefinations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class databasesample {

	
   @Test
   
   public void dbtest() throws ClassNotFoundException, SQLException 
   
   {
	   
	   Class.forName("com.mysql.jdbc.Driver");
	   
	    	Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","Melcow@481");  
	   
	           Statement stm=  con.createStatement();
   
                  ResultSet rs= stm.executeQuery("Select * from actor");
   
          while(rs.next())
          {
        	int actor_id= rs.getInt("actor_id");
        	  
        	String actor= rs.getString("first_name");
        	
        	String last= rs.getString("last_name");
        	
         
        	
           System.out.println(actor_id+"  "+actor+" "+last);
          }
                  
                  
       
   }
		
	

		
		
	

}
