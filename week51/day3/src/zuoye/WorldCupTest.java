/**
 * WorldCupTest.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月16日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * ClassName:WorldCupTest Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月16日 下午8:46:18
 *
 * @see
 * 
 */
public class WorldCupTest {
	public static void main(String[] args) {
		try {
			BufferedReader rf = new BufferedReader(
					new FileReader("G:\\SuZhou_Android\\week51\\day3\\src\\zuoye\\team.txt"));
			
			String len = null;
			int i = 3;
			String[] temp = new String[2];
			System.out.println("输入年份");
			boolean flag = false;
			BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
			String readLine = re.readLine();
			while ((len = rf.readLine()) != null) {
				temp=len.split("/");
				if (temp[0].equals(readLine)) {
					System.out.println(temp[0]+"年"+temp[1]+"获得冠军");
					flag=true;
					break;
				}
			}
			if (!flag) {
				System.out.println(readLine+"年没有得到冠军");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
