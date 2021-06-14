package learnjdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class JDBCDemo {

	public static void main(String[] args) {

		String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
		
		int rowsAffected;
		
		try {
			//Establish connection
			Connection conn = DriverManager.getConnection(url, "root", "admin");
			
			//Create a statement object to send to the database
			Statement statement = conn.createStatement();
			
			//Exicute the statement object
			//rowsAffected = statement.executeUpdate("insert into employees_tbl(id,name,dept,salary) "
			//		+ "values(911,'vishal','Develop',100000);");
			
          //  ResultSet resultset = statement.executeQuery("select * from employees_tbl");
			
            //System.out.println(resultset);
            
			//rowsAffected = statement.executeUpdate("delete from employees_tbl");
			
			rowsAffected = statement.executeUpdate("update employees_tbl \r\n"
					+ "set salary = 850000  \r\n"
					+ "where id = 911;");
					
           //System.out.println("Exicuted an insert statement - rows affected: " + rowsAffected);
           // System.out.println("Exicuted an delete statement - rows affected: " + rowsAffected);
            System.out.println("Exicuted an update statement - rows affected: " + rowsAffected);
			
            //process the result
//			 int salaryTotal = 0;
//			 while (resultset.next()) {
//				 // salaryTotal = salaryTotal + Integer.parseInt(resultset.getString("salary"));both are same
//				 salaryTotal = salaryTotal + resultset.getInt(("salary"));
//			}
//			 
//			 System.out.println(salaryTotal);
//			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error while updation");
			//System.out.println("error while insertion");
			//System.out.println("error while deletion");
		}
	}

}
