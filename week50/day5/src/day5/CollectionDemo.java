/**
 * CollectionDemo.java
 * day5
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月11日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ClassName:CollectionDemo Function: 集合练习
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月11日 上午10:09:25
 *
 * @see
 * 
 */
public class CollectionDemo {

	public static void main(String[] args) {
		setDemo();
	}
	/**
	 * 
	 * setDemo:(set集合练习)
	 * @param      设定文件
	 * @return void    DOM对象
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	public static void setDemo() {
		//说明set集合的用法
		//定义set集合的:接口名=new 实现类();
		//Collection是接口的父类
		Set<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("e");
		set.add("f");
		set.add("g");
		
		System.out.println(set.size());
		//set 的迭代方法   for_each    Iterator (迭代器)
		for (String string : set) {
			System.out.println(string);
		}
		Iterator<String> iterable = set.iterator();
		while (iterable.hasNext()) {
			String next = iterable.next();
			System.out.print(next+",");
		}
		
	}

}
