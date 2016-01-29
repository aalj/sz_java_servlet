/**
 * Calendar.java
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

import java.util.Calendar;

/**
 * ClassName:Calendar
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月9日		下午3:29:11
 *
 * @see 	 

 */
public class CalendarDemo {
	

	public static void main(String[] args) {
		String[] week = {"星期天","星期一","星期二","星期三","星期四","星期五","星期六"};
		Calendar calendar = Calendar.getInstance();
		int y=calendar.get(Calendar.YEAR);
		int M = calendar.get(Calendar.MONTH)+1;
		int d = calendar.get(calendar.DAY_OF_MONTH);
		int w = calendar.get(calendar.DAY_OF_WEEK)-1;
		int H = calendar.get(Calendar.HOUR_OF_DAY);
		int m = calendar.get(Calendar.MINUTE);
		int s = calendar.get(Calendar.SECOND);
		//输出当前的时间
		System.out.println(y+"年"+M+"月"+d+"日"+" "+week[w]+" "+ H+":"+m+":"+s);
		
	}

}

