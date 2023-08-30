package jdbc;
import java.sql.*;
public class Conn {
	public
	Connection con;
   // Statement stmt;
	public Conn(){
	    
	try{  

	    //step1 load the driver class
	    Class.forName("oracle.jdbc.driver.OracleDriver");

	 

	    //step2 create  the connection object  
	    con=DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe","system","12345");  

	    //step3 create the statement object  
	   // stmt=con.createStatement();  

	    //step4 execute query  
//	    ResultSet rs=stmt.executeQuery("select * from emp");  
//	    while(rs.next())  
//	    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  

	    //step5 close the connection object  
//	    con.close();  
	        }catch(Exception e){ System.out.println(e);}  

	 

	    }
}
