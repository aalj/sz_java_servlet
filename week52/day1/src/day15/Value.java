/**
 * Value.java
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
 * ClassName:Value
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月21日		下午2:23:09
 *
 * @see 	 

 */
public class Value {
	//对比普通变量 ThreadLocal变量
	int i;
	
	ThreadLocal<Integer> t=new ThreadLocal<Integer>(){
		@Override
		protected Integer initialValue() {
			
			//返回初值,int==>Integer
			return 0;
			
		}
	};
	
	
	//对变量i加1
	void inc(){
		i++;
	}
	
	//对变量t中包装的整数加1
	void inc2(){
		t.set(t.get()+1);
	}
	
	
}

