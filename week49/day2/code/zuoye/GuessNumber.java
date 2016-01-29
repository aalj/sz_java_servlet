/**
 * GuessNumber.java
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

import java.util.Random;
import java.util.Scanner;

/**
 * ClassName: 输入一个1到10的整数，系统随机生成一个1到10的整数，
若玩家输入的数比随机数小，则提示玩家数输小了，让玩家重新输入，
若玩家输入的数比随机数大，则提示玩家数输大了，让玩家重新输入，
若这两个数相等，则本轮游戏结束，若输入的次数小于3，则提示说玩家太牛了，
若输入的次数小于5，则提示说玩家还行，否则提示说玩家太差了。
询问玩家是否还要继续，若继续，则重新开如一轮新游戏，否则游戏结束
 * <p>
 * Function: 猜数游戏
 *
 * @author view
 * @version
 * @since Ver 1.1
 * @Date 2015年12月1日 下午6:34:59
 *
 * @see
 * 
 */
public class GuessNumber {
	private static int numy;
	private static Scanner scan;
	private static boolean first;

	/*
	 * 输入一个1到10的整数，系统随机生成一个1到10的整数， 若玩家输入的数比随机数小，则提示玩家数输小了，让玩家重新输入，
	 * 若玩家输入的数比随机数大，则提示玩家数输大了，让玩家重新输入， 若这两个数相等，则本轮游戏结束，若输入的次数小于3，则提示说玩家太牛了，
	 * 若输入的次数小于5，则提示说玩家还行，否则提示说玩家太差了。 询问玩家是否还要继续，若继续，则重新开如一轮新游戏，否则游戏结束。
	 */
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		first = true;
		while (true) {
			Random random = new Random();
			numy = random.nextInt(10) + 1;
			if(first){
				System.out.println("开始猜数游戏");
				guessNum();
				
			}
			if
			(!first){
				System.out.println("是否在此游戏,是请按."+1+"否请按.2");
				int a = scan.nextInt();
				if(a==1){
					System.out.println("继续游戏");
					guessNum();
				}else{
					System.out.println("退出游戏");
					break;
				}
			}
			
		}
		

	}

	private static void guessNum() {
		first  = false;
		System.out.println("猜数游戏开始输入一个整数");
		int tempnum = 0;
		while (true) {
			int num = scan.nextInt();
			tempnum++;
			if (num == numy) {
				break;
			}
			if (num > numy) {
				System.out.println("数输大了,在猜");

			}
			if (num < numy) {
				System.out.println("数输小了,在猜");
			}

		}
		if (tempnum >= 5) {
			System.out.println("菜鸟,猜个数都不行");
		} else {
			System.out.println("还行吧,用了" + tempnum + "次才猜出来");
		}
	}

}
