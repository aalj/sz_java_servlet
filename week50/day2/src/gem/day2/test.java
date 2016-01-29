/**
 * test.java
 * gem.day2
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月8日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package gem.day2;
/**
 * ClassName:test
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月8日		下午4:35:43
 *
 * @see 	 

 */
  interface IAa {
	public abstract void Test();
}
public class test {

	public static void main(String[] args) {
		IAa in=new IAa() {
			
			public void Test() {
				System.out.println("匿名内部类测试Test（）方法成功");
			}
		};
	}

}
