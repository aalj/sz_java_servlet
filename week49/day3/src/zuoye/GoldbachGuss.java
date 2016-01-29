/**
 * GoldbachGuss.java
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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName:GoldbachGuss
 * <p>
 * Function: 验证哥德巴赫猜想：大于6的偶数能够表示成两个素数之和
 *
 * 
 * @author view
 * @version
 * @since Ver 1.1
 * @Date 2015年12月2日 下午8:22:43
 *
 * @see
 * 
 */
public class GoldbachGuss {

	private static int num;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("任意输入一个大于6的偶数");
		num = scan.nextInt();
		if (num>=6&&num%2==0) {
			
			int[] bool = panduanBool();
			if(!(bool==null||bool.length==0)){
				System.out.println(num+"="+bool[0]+"*"+bool[1]);
			}else{
				System.out.println("哥德巴赫猜想出现反例");
			}
			
		}else{
			System.out.println("输入不合法");
		}
		

	}
	/**
	 * 
	 * panduanBool:(判断输入的数是否符合哥德巴赫猜想)
	 *
	 * @param      设定文件
	 * @return void    DOM对象
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	private static int [] panduanBool() {
		int [] arr = new int [2];
		List<Integer> primer = primer(num);
		for (int i = 0; i < primer.size(); i++) {
			for (int j = 0; j < primer.size(); j++) {
				if (i*j==num) {
					arr[0]=i;
					arr[1]=j;
					return arr;
				}else{
					return null;
				}
				
			}
			
		}
		
		return null;
		
	}
	/**
	 * 
	 * primer:(计算素数)
	 * 
	 * @param @param
	 *            num 设定文件
	 * @return void DOM对象
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	private static List<Integer> primer(int num) {
		List<Integer> list = new ArrayList<Integer>();
		if (num < 2) {
			return list;
		}
		if(num>=2){
			
			System.out.println("输出素数" + 2);
			list.add(2);
		}
		for (int i = 2; i <= num; i++) {
			
			for (int j = 2; j <= (int) (Math.sqrt(i) + 1); j++) {
				if (i % j == 0) {
					break;
				}
				if (j == (int) (Math.sqrt(i) + 1)) {
					list.add(i);
				}
			}

		}
		return list;
	}

}
