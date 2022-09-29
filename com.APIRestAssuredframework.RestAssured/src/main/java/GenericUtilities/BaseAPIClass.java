package GenericUtilities;

import java.sql.SQLException;

import org.junit.Before;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

/**
 * This class will contains basic configartion annotation
 * 
 * @author shahn
 *
 */
public class BaseAPIClass {
	
	public DataBaseLibrary dblib=new DataBaseLibrary();
	public JavaUtility jlib =new JavaUtility();
	public RestAssuredLibrary restLib=new RestAssuredLibrary();
	
	
	
	@BeforeSuite
	public void bsconfig() throws SQLException
	{
		dblib.connecttoDB();
		Reporter.log("****DBconnection succssefull",true);
		baseURI=Iconstants.appURL;
		port=Iconstants.appPort;
		
	}
	
	 @AfterSuite
	 public void ASconfig() throws SQLException
	 {
		 dblib.closeDB();
			Reporter.log("****DBconnection close",true);

	 }
	 
	

}
