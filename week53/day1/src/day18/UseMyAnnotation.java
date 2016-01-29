/**
 * UseMyAnnotation.java
 * day18
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月28日 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day18;

/**
 * ClassName:UseMyAnnotation <br/>
 * Function: 使用自定义注解 <br/>
 * Reason: TODO ADD REASON
 *
 * @author liang
 * @version
 * @since Ver 1.1
 * @Date 2015年12月28日 上午10:49:32
 *
 * @see
 * 
 */
public class UseMyAnnotation {
	private int score = 100; // 成员变量
	//传值
	@MyAnnotation(values="java",values1="android")
	public void test() {

	}

	public static void main(String[] args) {
		String a = "android";
	}

}
