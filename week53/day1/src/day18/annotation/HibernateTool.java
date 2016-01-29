/**
 * HibernateTool.java
 * day18.annotation
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月28日 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day18.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * ClassName:HibernateTool Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author liang
 * @version
 * @since Ver 1.1
 * @Date 2015年12月28日 下午2:16:58
 *
 * @see
 * 
 */
public class HibernateTool {
	// 对任意的实体类
	public static String getTableName(Object s) {
		// 使用反射
		// 获得这个对象的entity的类对象
		Class cla = s.getClass();

		// 获得这个类上面的类型为Table的Annotation

		Table ta = (Table) cla.getAnnotation(Table.class);

		// 获得这个Annotation上的值
		
		//得到表明同时返回出去
		return ta.value();

	}
	
	public static String getColumnName(Object s,String attribute) throws NoSuchMethodException, SecurityException{
	
		//1、获得类对象
		Class cla = s.getClass();
		//2、属性名转化为getXxx方法的名字
		String getN = "get"+attribute.substring(0, 1).toUpperCase()+
		attribute.substring(1, attribute.length());
		//name===》getName
		//pwd====》getPWD
		//3、获得这个方法的对象Method
	
			Method NameMethod= cla.getMethod(getN);
			
			Column c = (Column) NameMethod.getAnnotation(Column.class);
			//Method m  = cla.getMethod();
			//获得方法上的Annotation，与前面的一样
			
			return c.value();
		
	}
	

}
