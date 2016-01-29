/**
 * PritAlpha.java
 * day15
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月21日 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day15;
/**
 * ClassName:PritAlpha
 * Function: 生产者与消费问题 
 *  * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月21日		上午10:19:03
 *
 * @see 	 

 */
public class PritAlpha {
	//定义一个标变量。轮到谁
	boolean flag= true;
	//1、传统方法  synchronized  wait   notifyAll 
	//2、新方法：Lock  Condition aWaint   signalAll
	
	//输出大写的字符
	public synchronized void printUpper(char ch){
		//是否轮到我  while循环
		while (!flag) {
			try {
				//在哪个对象（this）上等，当前线程，进入this对象等待队列
				this.wait();
				//释放所拥有的锁
			} catch (InterruptedException e) {
				
				// 
				e.printStackTrace();
				
			}
		}
			
			System.out.println(ch);
			flag= !flag;
			this.notifyAll();
		
			//没有轮到我,等
			
		//如果轮到我,打
	}
	
	
	//输出小写的字符
	public synchronized void printLower(char ch){
		//是否轮到我
			//没有轮到我,等
			
		while (flag) {
			try {
				//在哪个对象（this）上等，当前线程，进入this对象等待队列
				this.wait();
				//释放所拥有的锁
			} catch (InterruptedException e) {
				
				// 
				e.printStackTrace();
				
			}
		}
			System.out.println(ch);
			flag= !flag;
			this.notifyAll();
		
		//如果轮到我,打
		
	}
}

