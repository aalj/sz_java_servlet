/**
 * QueueDemo.java
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

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * ClassName:QueueDemo
 * Function: Queue队列的联系
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月14日		上午9:36:54
 *
 * @see 	 

 */
public class QueueDemo {

	public static void main(String[] args) {
//		Queue的用法,创建队列的对象
//		Queue<String> qu = new LinkedList<>();
		//队列中加入元素
//		qu.add("java");
//		qu.offer("c++");
//		qu.offer("c#");
//		System.out.println(qu);
//		//去除元素,但是在队列中还存在
//		String remove = qu.element();
//		System.out.println(qu);
//		//拿出元素,同时移除队列里面的值
//		String remove1 = qu.remove();
//		System.out.println(qu);
//		String remove2 = qu.poll();
//		String remove3 = qu.poll();
//		System.out.println(remove+"  "+remove1+"  "+remove2+"  "+remove3);
		//说明 优先级的队列
		Queue<String> qu = new PriorityQueue<>();
		//安自然顺序
		qu.add("c");
		qu.add("b");
		qu.add("a");
		qu.add("d");
		System.out.println(qu);

	}

}

