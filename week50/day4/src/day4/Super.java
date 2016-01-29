/**
 * Super.java
 * day4
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月10日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day4;

import java.io.IOException;
import java.sql.SQLException;

/**
 * ClassName:Super Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月10日 下午3:31:09
 *
 * @see
 * 
 */
public class Super {
	public Number m() throws IOException{
		return new Integer(1);
	}
	

}
interface Ai{
	void bb() throws Exception;
}

class Sub extends 
 Super implements Ai{

	@Override
	public Number m()  {
		
		
		return new Integer(1);
		
	}

	@Override
	public void bb() throws java.sql.SQLException{
	}
	
}