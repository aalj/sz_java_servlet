/**
 * JoinDemo.java
 * day15
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月18日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day15;
/**
 * ClassName:JoinDemo
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月18日		上午11:09:12
 *
 * @see 	 

 */
public class JoinDemo {
	Thread t2;
	public   void main(String[] args) {
		//示例说明join方法
		//t2线程,PrintLetterTask
		t2
		=new Thread(new PrintLetterTask());
//		t2.start();
//		创建一个自己的线程,匿名内部内实现接口
		new Thread( new Runnable() {
			public void run() {
				for (int i = 0; i <= 26; i++) {
					System.out.print(i+" ");
					if(i==5)
					{
						try {
							t2.join();//理解Join的含义插入执行
							Thread.sleep(100);
							System.out.println(Thread.currentThread().getState());
						} catch (InterruptedException e) {
							
							// TODO Auto-generated catch block
							e.printStackTrace();
							
						}
					}
				}
			}
		}).start();
		

	}
	class aa implements Runnable{

		@Override
		public void run() {
			try {
				t2.join();
			} catch (InterruptedException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}
		
	}

}

