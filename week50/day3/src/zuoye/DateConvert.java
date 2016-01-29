/**
 * DateConvert.java
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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.scene.chart.PieChart.Data;

/**
 * ClassName:DateConvert Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月9日 下午3:14:45
 *
 * @see
 * 
 */
public class DateConvert {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		// 打印系统当前的时间
		System.out.println("显示当前的系统时间"+dateFormat.format(date));
		String time ="2013-7-1";
		date = dateFormat1.parse(time);
		//输出字符串解析以后的时间
		System.out.println("自1970年到现在的毫秒数"+date.getTime());
		System.out.println("显示为固定的时间格式"+dateFormat1.format(date));

	}

}
