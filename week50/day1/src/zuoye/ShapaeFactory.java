/**
 * ShapaeFactory.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月7日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;
/*
 * （*多态）创建一个ShapaeFactory类，在该类中写一个方法getShape(int i)，该方法的返回类型为Shape，该方法的参数为一个整数i，返回值由i 决定：
	a) i == 0 时，返回一个半径为1 的圆形
	b) i == 1 时，返回一个长为3 宽为2 的矩形
	c) i == 2 时，返回一个边长为2 的正方形

 */
/**
 * ClassName:ShapaeFactory
 * Function:   使用工厂方法创建图形
 * Reason:	    
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月7日		下午4:39:49
 *
 * @see 	 

 */
public class ShapaeFactory {
	/**
	 * 
	 * getShape:(用于创建不同的图形)
	 * <p>
	 * TODO(当传入参数为"0"时,返回半径为"1"的圆形)
	 * <p>
	 * TODO(当传入参数为"1"时,返回一个长为3 宽为2 的矩形)
	 * <p>
	 * TODO(当传入参数为"2"时,返回一个边长为2 的正方形)
	 *
	 * @param  @param i
	 * @param  @return    设定文件
	 * @return Shape    DOM对象
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	public Shape getShape(int i){
		if(i==0){
			return new Circle(1);
		}else if(i==1){
			return new Rect(3,2);
		}else if(i==2){
			return new Square(2);
		}
		
		return null;
	}

}

