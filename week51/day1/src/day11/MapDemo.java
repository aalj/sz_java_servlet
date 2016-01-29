/**
 * MapDemo.java
 * day11
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月14日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * ClassName:MapDemo Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月14日 上午10:53:43
 *
 * @see
 * 
 */
public class MapDemo {

	public static void main(String[] args) {
		// 创建一个Map对象：接口Map 实现类 HashMap
		Map<String, String> course = new HashMap<String, String>();
		// 加入数据put ,修改 ，删除数据
		course.put("Tom", "CoreJava");
		course.put("John", "Oracle");
		course.put("Susan", "Oracle");
		course.put("Jerry", "JDBC");
		course.put("Jim", "Unix");
		course.put("Kevin", "JSP");
		course.put("Lucy", "JSP");
		int size = course.size();
		System.out.println(size);
		System.out.println(course);
		course.put("Allen", "JDBC");
		// lucy改为CoreJava 修改值也用put方法
		course.put("Lucy", "CoreJava");
		System.out.println(course);
		System.out.println("第一种遍历方法");
		Set<Entry<String, String>> entrySet = course.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey() + "    " + entry.getValue());
		}
		System.out.println("第二种遍历方法");

		Iterator<Entry<String, String>> map = course.entrySet().iterator();
		while (map.hasNext()) {
			Entry<String, String> next = map.next();
			System.out.println(next.getKey() + "    " + next.getValue());
		}
		System.out.println("第三中遍历方法");
		for (String s:course.keySet()) {
			if ("JSP".equals(course.get(s))) {
				System.out.println(s);
			}
//			System.out.println(s+"     "+course.get(s));
		}
		
		
		System.out.println("第四重遍历方法");
		for (String entry : course.values()) {
			
			System.out.println(entry);
		}
		// 取出数据
		// 遍历集合中的数据

	}

}
