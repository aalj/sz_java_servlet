/**
 * MultiplicationTable.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月1日 		view
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;
/**
 * ClassName:MultiplicationTable
 * <p>
 * Function: 输出9x9的乘法表  [MultiplicationTable.java]
 * 
 *
 * @author   view
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月1日		下午7:09:12
 *
 * @see 	 

 */
public class MultiplicationTable {

	public static void main(String[] args) {
		for (int i = 1; i <=9; i++) {
			
			
			for (int j = 1; j <=i; j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}

	}

}

