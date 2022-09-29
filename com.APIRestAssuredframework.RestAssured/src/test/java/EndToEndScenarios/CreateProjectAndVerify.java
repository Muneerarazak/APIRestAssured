package EndToEndScenarios;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtilities.BaseAPIClass;
import GenericUtilities.EndPointLibrary;
import PojoLibrary.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateProjectAndVerify extends BaseAPIClass {

	
	@Test
	public void createprojectnverify() throws SQLException
	{
		//step:1  create prerequisite
		ProjectLibrary plib =new ProjectLibrary("Muneera", "SDET39"+jlib.getRandomnum(),"created", 10);
		
		//step:2  send the post request

		Response resp = given()
		.body(plib)
		.contentType(ContentType.JSON)
		.when()
		.post(EndPointLibrary.createProject);
		resp.then().log().all();
		
		//step 3: capture the projectId
		
		String expData=restLib.getJsonData(resp, "projectId");
		System.out.println(expData);
		// step4:  verift the projectid in database
		
		String query="select * from project;";
		String actData=dblib.executeQueryReturnData(query, 1, expData);
		Assert.assertEquals(actData,expData);
		
	}
}
