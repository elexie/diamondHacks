package helloworld;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SearchDB {
	
	public void searchDatabase(String license) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
	/*	Class.forName("com.mysql.jdbc.Driver").newInstance();

		// create the connection
		String host = "jdbc:mySql://localhost:3306/diamondHacks";
		String name = "root";
		String password = "PLINAHMUNYENEH123";
		Connection con = DriverManager.getConnection(host, name, password);

		// the java statement
		Statement st = con.createStatement();


		ResultSet rs = st
				.executeQuery("SELECT * FROM nc_driver_registry WHERE license="+"\""+license+"\"");
		int result = 0;// if this value is 0, the user name does not exist
	
		rs.next();
		String last_first=rs.getString(2)+" "+rs.getString(3);
		
		return last_first; */
	}
	
	public String[] returnInfo(String license) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();

		// create the connection
		String host = "jdbc:mySql://localhost:3306/diamondHacks";
		String name = "root";
		String password = "PLINAHMUNYENEH123";
		Connection con = DriverManager.getConnection(host, name, password);

		// the java statement
		Statement st = con.createStatement();


		ResultSet rs = st
				.executeQuery("SELECT * FROM nc_driver_registry WHERE license="+"\""+license+"\"");

	//	rs.next();
		String info[]=new String[6];
		info[0]="";
		info[1]="";
		info[2]="";
		info[3]="";
		info[4]="";
		info[5]="";

		if (!rs.next()) {
			
		} else {
			info[0]=rs.getString(2)+"\n";
			info[1]=rs.getString(3)+", "+rs.getString(4)+"\n";
			info[2]=rs.getString(5)+" | "+rs.getString(6)+"\n";
			info[3]=rs.getString(7)+"\n";
			info[4]="("+rs.getString(10)+") "+rs.getString(11)+" "+rs.getString(8)+" "
			+rs.getString(9)+"\n";		
			info[5]=rs.getString(13)+ ", "+rs.getString(12)+"\n";		

			do {
		        // process row
		    } while (rs.next());
		}
/*		while(rs.next()) {
			info[0]=rs.getString(2);
			info[1]=rs.getString(3)+", "+rs.getString(4);
			info[2]=rs.getString(5)+" | "+rs.getString(6);
			info[3]=rs.getString(7)+" "+rs.getString(8)+rs.getString(9);
			info[4]=rs.getString(10)+" | "+rs.getString(11);	
		}
*/
	//	rs.next();
	//	String last_first=rs.getString(2)+" "+rs.getString(3);
		
//		String info[]=new String[5];	
/*		info[0]=rs.getString(2);
		info[1]=rs.getString(3)+", "+rs.getString(4);
		info[2]=rs.getString(5)+" | "+rs.getString(6);
		info[3]=rs.getString(7)+" "+rs.getString(8)+rs.getString(9);
		info[4]=rs.getString(10)+" | "+rs.getString(11);
		*/
		return info;
	}
	
	


}
