package GenericUtilities;

import java.util.Random;
/**
 * this class will contains generic methods related to java
 * @author shahn
 *
 */

public class JavaUtility {
	/**
	 *  this method will return random number for every execution
	 * @return
	 */
	
	public int getRandomnum()
	{
	Random ran=new Random();
	return ran.nextInt(200);
	}
}
