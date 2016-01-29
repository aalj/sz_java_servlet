/**
 * StringDemo.java
 * day4
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月9日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName:StringDemo Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月9日 上午10:06:27
 *
 * @see
 * 
 */
public class StringDemo {

	public static void main(String[] args) throws ParseException {
		Date now = new Date();
		int year = now.getYear();
//		long l = now.getTime();
//		System.out.println(year + "," + l);

		// 字符串与日期的转换(重要) SimpleDateFormat
		// 说明字符串表示日期的格式是:
		// yyyy-MM-dd HH:mm:ss
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		// 字符串===>日期对象 parse
		// 日期对象==?字符串 format
		System.out.println(dateFormat.format(now));
		String adate = "1993-02-24 13:56:25";
		Date d = dateFormat.parse(adate);
		System.out.println(d.getTime());
		Calendar c = Calendar.getInstance();
		//从指定日期时间
		c.setTime(d);
		
		
		
		
		//得到的月份从0开始
		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH)+1;
		int da = c.get(Calendar.DATE);
		//星期是从星期天开始
		int w = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(y+"-"+m+"-"+da+"-"+"星期"+w);
	}
}
