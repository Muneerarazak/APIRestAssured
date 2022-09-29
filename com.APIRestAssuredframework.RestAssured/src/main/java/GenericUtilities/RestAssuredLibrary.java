package GenericUtilities;

import io.restassured.response.Response;

/**
 * this class is consist of generic method related to rest assured
 * @author Muneera
 *
 */

public class RestAssuredLibrary {
	
	/**
	 * this method will fetch the data based on json path
	 * @param resp
	 * @param path
	 * @return
	 */
	
	public String getJsonData(Response resp,String path)
	{
	String jsonData = resp.jsonPath().get(path);
		return jsonData;
	}
	

}
