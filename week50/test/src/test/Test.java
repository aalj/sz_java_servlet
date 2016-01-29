/**
 * test.java
 * test
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月8日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package test;

/**
 * ClassName:test Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月8日 下午8:30:06
 * @see
 * 
 */
public   class Test {
	public static void main(String[] args) {
		System.out.println(reEmp(1));
	}
	public static boolean reEmp( int a) {
		switch (a) {
		case 1://修改员工姓名
			System.out.println("1");
			return true;
		case 2://修改员工年龄
			System.out.println("2");
			return true;
			
		case 3://修改员工工资
			System.out.println("3");
			
			return true;
		case 4://修改员工编号
			System.out.println("4");
			
			return true;

		default:
			return false;
		}
	}
}
