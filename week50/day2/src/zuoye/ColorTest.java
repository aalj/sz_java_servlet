/**
 * Color.java
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

/**
 * ClassName:Color
 * <P>
 * Function: 枚举类
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月8日 下午6:12:22
 *
 * @see
 * 
 */
enum Color {

	RED('红') {

		@Override
		public String toString() {

			return "红";

		}
	},
	GREED('绿') {

		@Override
		public String toString() {

			return "绿";

		}
	},
	YELLOW('黄') {

		@Override
		public String toString() {

			return "黄";

		}
	};
	char color;

	// 私有的枚举构造函数
	Color(char color) {
		this.color = color;
	}

	/**
	 * 枚举类里面实现的方法,用于输出字符串类型的值
	 */
	public abstract String toString();
}

public class ColorTest {
	public static void main(String[] args) {
		driver(Color.GREED);
		driver(Color.YELLOW);
		driver(Color.RED);

	}

	/**
	 * 
	 * driver:(静态方法,用于检测枚举类)
	 * <p>
	 * TODO(这里描述这个方法适用条件 – 可选)
	 * <p>
	 * TODO(这里描述这个方法的执行流程 – 可选)
	 * <p>
	 * TODO(这里描述这个方法的使用方法 – 可选)
	 * <p>
	 * TODO(这里描述这个方法的注意事项 – 可选)
	 *
	 * @param @param
	 *            color 设定文件
	 * @return void DOM对象
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public static void driver(Color color) {
		switch (color) {
		case GREED:
			System.out.println("绿灯行");
			break;
		case RED:
			System.out.println("红灯停");
			break;
		case YELLOW:
			System.out.println("黄灯慢行");
			break;

		default:
			break;
		}
	}

}