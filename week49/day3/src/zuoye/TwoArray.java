/**
 * TwoArray.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月2日 		view
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

import java.util.Random;

/**
 * ClassName:TwoArray Function:
 * <p>
 * 二位数组练习 Reason: TODO ADD REASON
 *
 * @author view
 * @version
 * @since Ver 1.1
 * @Date 2015年12月2日 下午6:55:31
 *
 * @see
 * 
 */
public class TwoArray {

	public static void main(String[] args) {
		/*
		 * 定义一个20*5的二维数组，用来存储某班级20位学员的5门课的成绩；这5门课，按存储顺序依次为：core
		 * C++，coreJava，Servlet，JSP和EJB。 （1）循环给二维数组的每一个元素赋0~100之间的随机整数。
		 * （2）按照列表的方式输出这些学员的每门课程的成绩。 （3）要求编写程序求每个学员的总分，将其保留在另外一个一维数组中。
		 * （4）要求编写程序求所有学员的某门课程的平均分。
		 * 
		 */
		Random random = new Random();
		int[][] chengji = new int[25][5];// 前行后列
		// 对二位数组赋值
		// （1）循环给二维数组的每一个元素赋0~100之间的随机整数
		for (int i = 0; i < chengji.length; i++) {
			for (int j = 0; j < chengji[i].length; j++) {
				chengji[i][j] = random.nextInt(100) + 1;
			}

		}
		// （2）按照列表的方式输出这些学员的每门课程的成绩。
		System.out.println("学员的每门课程的成绩");
		for (int i = 0; i < chengji.length; i++) {
			for (int j = 0; j < chengji[i].length; j++) {
				System.out.print(chengji[i][j] + "\t");
			}
			System.out.println();
		}
		// （3）要求编写程序求每个学员的总分，将其保留在另外一个一维数组中
		System.out.println("计算每个学员的成绩总和");
		int[] zonghe = new int[25];
		for (int i = 0; i < chengji.length; i++) {
			for (int j = 0; j < chengji[i].length; j++) {
				zonghe[i] += chengji[i][j];
			}
		}
		System.out.println("输出成绩的数组");

		for (int i : zonghe) {
			System.out.print(i + "\t");
		}
		System.out.println(chengji.length);
		// （4）要求编写程序求所有学员的某门课程的平均分。
		int[] liezonghe = new int[5];
		for (int i = 0; i < 5; i++) {
			int temp = 0;
			for (int j = 0; j < chengji.length; j++) {
				temp += chengji[j][i];
				liezonghe[i] = temp / 25;
			}
		}
		System.out.println("输出每科的平均成绩");
		for (int i : liezonghe) {
			System.out.print(i + "\t");
		}
	}

}
