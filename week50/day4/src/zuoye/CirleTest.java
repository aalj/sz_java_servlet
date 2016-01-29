/**
 * Cirle.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月10日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;
/*
 * 编写一个Cirle类，包括构造方法，求圆的面积和周长，如果圆的半径小于0则抛出异常，让用户必须处理，半径必须大于0才可以
 */
/**
 * ClassName:Cirle
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月10日		下午4:36:21
 *
 * @see 	 

 */

public class CirleTest {

	public static void main(String[] args) {
		Cirle cirle = new Cirle(-1);
		System.out.println(cirle.area(cirle.r));

	}

}
/**
 * 
 * ClassName:Cirle
 * <p>
 * Function: 计算圆面积的类
 * <p>
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015	2015年12月10日		下午4:44:30
 *
 * @see
 */
class Cirle{
	double r = 0;
	public Cirle(double r) {
		this. r = r;

	}
	/**
	 * 
	 * area:(计算圆的面积,同时返回圆的面积)
	 *
	 * @param  @param r
	 * @param  @return    设定文件
	 * @return double   圆的面积
	 * @throws   出现异常返回-1
	 * @since  CodingExample　Ver 1.1
	 */
	public double area(double r){
		double s = 0;
		if(r<0){
			try {
				
				throw new MyException1("圆的半径不能小于0");
			} catch (MyException1 e) {
				
				
				e.printStackTrace();
				return -1;
			}
		}else{
			return s=r*r*3.14;
					
		}
	}
	
	
}