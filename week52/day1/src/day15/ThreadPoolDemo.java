/**
 * ThreadPoolDemo.java
 * day15
 *
 * Function�� TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2015��12��21�� 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day15;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * ClassName:ThreadPoolDemo
 * Function: ʾ��˵���߳ǳص��÷�
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015��12��21��		����11:28:40
 *
 * @see 	 

 */
public class ThreadPoolDemo {

	public static void main(String[] args) {
		//����һ�̶���Ŀ���̳߳ض���
		ExecutorService pool = Executors.newFixedThreadPool(3);
		//�ύ�������ֱ�����ʽ��Runnable(����Ҫ����ֵ)   Callable(��Ҫ����ֵ)��
		//�ύһ��Runnable����
		pool.submit(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName()+" "+i+" ");
				}
				
			}
		});
		//�ύһ��Callable����
		Future<Integer> submit = pool.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName()+" "+i+" ");
				}
				
				return 100 ;
				
			}
		});
		try {
			System.out.println(submit.get());
		} catch (InterruptedException e) {
			
			//
			e.printStackTrace();
			
		} catch (ExecutionException e) {
			
			//
			e.printStackTrace();
			
		}
		
		//���call�ķ���ֵ
		
		//�ر��̳߳�
		pool.shutdown();
	}

}

