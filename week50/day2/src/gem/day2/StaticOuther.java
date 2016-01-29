/**
 * StaticOuther.java
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
 * ClassName:StaticOuther Function: 示例说明静态内部类 Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月8日 上午10:14:55
 *
 * @see
 * 
 */
public class StaticOuther {
	int score = 100;
	static String str = "android";

	//// 定义一个静态内部类
	static class StaticInintener {
		int i = 100;
		static String s = "java";

		void show() {
			//不能方法外部类的示例成员,可以访问外部类的静态成员
			System.out.println("i" + "+" + s);
		}
	}

	public static void main(String[] args) {

	}
}
