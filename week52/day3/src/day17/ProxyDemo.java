/**
 * ProxyDemo.java
 * day17
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月23日 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day17;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ClassName:ProxyDemo Function: 动态代理 Reason: TODO ADD REASON
 *
 * @author liang
 * @version
 * @since Ver 1.1
 * @Date 2015年12月23日 下午2:11:49
 *
 * @see
 * 
 */
public class ProxyDemo {
	public static void main(String[] args) {
		InvocationHandler h = new InvocationHandler(){

			@Override//							method对象		对应eating方法。args调用该方法的参数
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				Object result=null ;
//				 result = method.invoke( proxy,args);
				return result;
				
			}};

		// 实现了Person接口的代理对象
		Object person =  Proxy.newProxyInstance(ProxyDemo.class.getClassLoader(),
				Person.class.getInterfaces(),
				h);
		System.out.println(person);
//		(Person)person.eating();
		
	}

}
