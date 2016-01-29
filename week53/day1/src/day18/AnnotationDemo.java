/**
 * AnnotationDemo.java
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
/**
 * ClassName:AnnotationDemo
 * Function: 注解测试
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月28日		上午9:48:34
 *
 * @see 	 

 */
public class AnnotationDemo {

	public void testOverride(){
		
	}
	public static void main(String[] args) {
		String attribute = "abcdefg";
		System.out.println("get"+attribute.substring(0, 1).toUpperCase()+
				attribute.substring(1, attribute.length()));

	}

}

//写一个Annotation的子类
class SubAnnotation extends AnnotationDemo{
	//从写父类的方法TestOverride
	//注解
	//工具使用这个注解
	@Override
	public void testOverride() {
		
		
		super.testOverride();
		
	}
}
