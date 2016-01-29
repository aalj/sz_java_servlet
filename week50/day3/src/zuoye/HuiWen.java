/**
 * HuiWen.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月9日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;
/**
 * ClassName:HuiWen
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月9日		下午3:43:35
 *
 * @see 	 

 */
public class HuiWen {

	public static void main(String[] args) {
		
		String hw = "123221";
		boolean temp = false;
		char[] charArray=  hw.toCharArray();
		char[] flashbackArr = flashbackArr(hw);
		//判断当前的是否是回文
		for (int i = 0; i < flashbackArr.length; i++) {
			if(charArray[i]==flashbackArr[i]){
				temp=true;
			}else{
				
				temp = false;
				break;
			}
		}
		if(temp){
			System.out.println(hw+"\t是回文");
			
		}else{
			System.out.println(hw+"\t不是回文");
			
		}
		
	}
	/**
	 * 
	 * flashbackArr:(传入一个stringr类型的参数,进行倒叙排列)
	 *
	 * @param  @param ch
	 * @param  @return    设定文件
	 * @return char[]    进行倒叙排列以后的char数组
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	public static char[] flashbackArr(String ch){
		char[] temp1 = ch.toCharArray();
		for (int i = 0; i < temp1.length/2; i++) {
			char temp =temp1[i];
			temp1[i]=temp1[temp1.length-i-1];
			temp1[temp1.length-i-1]=temp;
			
		}
		
		return temp1;
	}

}

