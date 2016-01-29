/**
 * ThreadCopyTest.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月21日 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

import java.io.File;

/**
 * ClassName:ThreadCopyTest
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月21日		上午9:59:00
 *
 * @see 	 

 */
public class ThreadCopyTest {

	public static void main(String[] args) {
	File src= new File("");
	File dec= new File("");
	int num =3;
	long len = src.length();
	int size = (int) (len/num);
	new Thread(new ThreadCopy(0, size, src, dec)).start();
	new Thread(new ThreadCopy(size, 2*size, src, dec)).start();
	new Thread(new ThreadCopy(2*size, (int) (len-2*size), src, dec)).start();
	
	

	}

}

