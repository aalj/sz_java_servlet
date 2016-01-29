/**
 * MyAnnotation.java
 * day18
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月28日 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day18;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * ClassName:MyAnnotation
 * Function: 定义一个自定义注解
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月28日		上午10:16:51
 *
 * @see 	 

 */


//@interface：定义Annotation，注解与"@"关联
//外面能写什么

//说明这个标注在使用时，可以用在什么地方（变量前面，方法前面，类的前面....）
/*
 * ElementType.METHOD	方法
 * ElementType.TYPE		类
 * ElementType.FIELD	成员变量
 * ElementType.LOCAL_VARIABLE	局部变量
 */
@Target({ElementType.METHOD,ElementType.TYPE,
	ElementType.FIELD,ElementType.LOCAL_VARIABLE})



//何时可以用：类上用的注解保留到何时
//只保留在源代码中
//只保留在类文件中
//运行时
@Retention(value=RetentionPolicy.RUNTIME)



public @interface MyAnnotation {
	//能写什么：“方法”这里的方法是抽象的方法
	//返回类型	基本数据类型（八种）和字符串类型String Class
	//			及其数组
	//不可以有参数
	//可以有缺省值 必须和前面的返回类型的保持一致
	String values();
	String values1();

	
}

