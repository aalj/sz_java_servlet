/**
 * AnonymousInnerClass.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月8日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;
/*
 * 接口的匿名内部类实现，要求如下：
	a)	定义一个接口名为IA，提供一个test方法
	b)	编写一个测试类，提供一个方法method，参数为IA类型
	c)	在main方法中，调用method方法，同时实参以匿名内部类的方式构建

 */

/**
 * ClassName:AnonymousInnerClass Function: TODO ADD FUNCTION Reason: TODO ADD
 * REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月8日 下午5:53:51
 *
 * @see
 * 
 */
public class AnonymousInnerClass {
	public static void method(IA ia){
		
	}
	public static void main(String[] args) {
		method(new IA() {
			
			@Override
			public void test() {
				System.out.println("匿名内部类实现,接口里面的方法");
			}
		});
	}

}
/**
 * 
 * ClassName:IA
 * <p>
 * Function: 接口
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015	2015年12月8日		下午5:54:22
 *
 * @see
 */
interface IA {
	void  test();

}
