/**
 * PrintStart.java
 * gem.day2
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月1日 		view
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package gem.day2;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

/**
 * ClassName:PrintStart Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author view
 * @version
 * @since Ver 1.1
 * @Date 2015年12月1日 下午3:40:39
 *
 * @see
 * 
 */
public class PrintStart {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("输入一个整数");
		int num = scan.nextInt();
		
		//右三角
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//左三角
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < 2*(num-i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//等腰三角
		for (int i = 0; i<num; i++ )  
        {  
            for (int j = i; j<num; j++)  
            {  
                System.out.print(" ");  
            }  
            for (int k = 0; k<2*i+1; k++)  
            {  
                System.out.print("*");  
            }  
            System.out.println();
	}
	}

}
