/**
 * StaticOuther.java
 * gem.day2
 *
 * Function�� TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2015��12��8�� 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package gem.day2;

/**
 * ClassName:StaticOuther Function: ʾ��˵����̬�ڲ��� Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015��12��8�� ����10:14:55
 *
 * @see
 * 
 */
public class StaticOuther {
	int score = 100;
	static String str = "android";

	//// ����һ����̬�ڲ���
	static class StaticInintener {
		int i = 100;
		static String s = "java";

		void show() {
			//���ܷ����ⲿ���ʾ����Ա,���Է����ⲿ��ľ�̬��Ա
			System.out.println("i" + "+" + s);
		}
	}

	public static void main(String[] args) {

	}
}
