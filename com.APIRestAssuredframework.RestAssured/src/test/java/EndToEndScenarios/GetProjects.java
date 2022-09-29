package EndToEndScenarios;



import org.testng.annotations.Test;

import GenericUtilities.BaseAPIClass;
import GenericUtilities.EndPointLibrary;
import GenericUtilities.Iconstants;

import static io.restassured.RestAssured.*;

public class GetProjects extends BaseAPIClass {
	
	@Test
	public void getprojects()
	
	{
       when()
       .get(EndPointLibrary.getSingleProject)
       .then().assertThat().statusCode(200).log().all();
		
	}

}
