package GenericUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

/**
 * this class consists of methods related to database
 * @author Muneera
 *
 */
public class DataBaseLibrary {
	
Driver	driverref; 

Connection con;

/**
 * this method is used for establish  conncetion to database
 * @throws SQLException
 */
	public void connecttoDB() throws SQLException
	
	{
		
		driverref=new Driver();
		DriverManager.registerDriver(driverref);
		con=DriverManager.getConnection(Iconstants.dbURL,Iconstants.dbUsername,Iconstants.dbPassword);
	}

	/**
	 * This method is for close the database
	 * @throws SQLException
	 */
	
	public void closeDB() throws SQLException
	{
		con.close();
	}
	
	
	/**
	 *  This method is used for execute query and verify the data with expected data 
	 * @param query
	 * @param columnNum
	 * @param expData
	 * @return 
	 * @author Muneera
	 * @throws SQLException
	 */
	
	public String executeQueryReturnData(String query ,int columnNum,String expData) throws SQLException
	{
		ResultSet result = con.createStatement().executeQuery(query);
		boolean flag=false;
		while(result.next())
		{
			String actData=result.getString(columnNum);
			if(expData.equalsIgnoreCase(actData))
	      				{
				     flag=true;
				     break;
	                   		
					 }
		}
		
		if(flag)
		{
			System.out.println("Data Verified");
			return expData;
		}
		else
		{
			System.out.println("verification failed");
			return "";
		}
	}
	
	
}
