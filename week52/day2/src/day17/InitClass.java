/**
 * InitClass.java
 * day17
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月22日 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day17;

/**
 * ClassName:InitClass Function: 反射机制的类的初始化 Reason: TODO ADD REASON
 *
 * @author liang
 * @version
 * @since Ver 1.1
 * @Date 2015年12月22日 下午3:30:22
 *
 * @see
 * 
 */
public class InitClass {
	static int j = 100;
	final static int i = 0 ;
	{
	System.out.println("实例初始化块");
	}
	static{
		System.out.println("静态初始化块");
	}
	public InitClass() {
		System.out.println("构造函数");
		 

	}

	public static void main(String[] args) {

	}

}


class SubInitClass extends InitClass{
	static{
		System.out.println("SubInitClass静态代码块");
	}
}
