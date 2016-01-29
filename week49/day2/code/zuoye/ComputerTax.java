/**
 * per.java
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

import java.util.Scanner;

/**
 * ClassName:1、输入自己的工资，并计算个人所得税：根据目前的税率(自己查找税率)

 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   view
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月1日		下午5:51:54
 *
 * @see 	 

 */
public class ComputerTax {
	//应缴个人所得税的计算公式为=（月应税收入-3500）*税率-速算扣除数
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("输入当前工资");
		int mona = scan.nextInt();
		int smon = mona-3500;
		System.out.println("需要交"+computerTaxt(smon)+"元的个人所得税");

	}
	//计算个人税率
	private static int computerTaxt(int mon) {
		if(mon<1500){
			return mon*3/100-0;
		}
		if(mon>=1500&&mon<4500){
			return mon*10/100-105;
		}
		if(mon>=4500&&mon<9000){
			return mon*20/100-555;
		}
		if(mon>=9000&&mon<35000){
			return mon*25/100-1005;
		}
		if(mon>=35000&&mon<55000){
			return mon*30/100-2755;
		}
		if(mon>=55000&&mon<80000){
			return mon*35/100-5505;
		}
		if(mon>=80000){
			return mon*45/100-13505;
		}
		return 0;
		
		
	}

}

