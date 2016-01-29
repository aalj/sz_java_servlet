/**
 * Complex.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月3日 		view
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/
/*
 * 
 */
package gem.day2;


/**
 * ClassName:Complex Function: 3、（**面向对象基础）复数概念如下： 每个复数都有实部和虚部。例如，3 + 5i，3
 * 为实部，5i 为虚部。其中，i 称为虚数单位，有i*i = -1。两个复数进行加法运算，运算时实部与实部相加，虚部与虚部相加。例如：(1.5 – 3i)
 * + (2.3 + 2.4i) = (1.5+2.3) + (-3 + 2.4)i = 3.8 – 0.6i 两个复数进行减法运算，与加法运算类似。
 * <p>
 * 两个复数进行乘法运算，其过程如下： (a+bi) * (c + di) = ac + adi + bci + bd(i*i) = (ac-bd) +
 * (ad+bc)i
 * <p>
 * 例如： （3+5i）*（4+6i）= （3*4-5*6）+（3*6+4*5）i = -18 + 38i
 * <p>
 * 写一个类Complex，用来表示复数。这个复数类具有两个属性：double real，表示实部；double im，表示虚部。 并为Complex
 * 类增加add、sub、mul 方法，分别表示复数的加法、减法和乘法运算。
 * <p>
 * 其中，add 方法的声明如下： public Complex add(Complex c) //表示当前Complex 对象与参数c 对象相加
 * public Complex add(double real) //表示当前Complex 对象与实数real 相加 [Complex.java]
 * Reason: TODO ADD REASON
 *
 * @author view
 * @version
 * @since Ver 1.1
 * @Date 2015年12月3日 下午7:24:23
 *
 * @see
 * 
 */
public class Complex {
	double real = 0;
	double im = 0;
	public Complex() {
		
		

	}
	/**
	 * 
	 * add:(复数的加法)
	 *
	 * @param      设定文件
	 * @return void    返回复数
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	public Complex add( Complex b) {
		Complex temp = new Complex();
		temp.real=this.real+b.real;
		temp.im=this.im+b.im;
		return temp;

	}
	public Complex(double real, double im) {
		super();
		this.real = real;
		this.im = im;
	}
	/**
	 * 
	 * add:(复数的减法)
	 *
	 * @param      设定文件
	 * @return void     返回复数
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	public Complex sub( Complex b) {
		Complex temp = new Complex();
		temp.real=this.real-b.real;
		temp.im=this.im-b.im;
		return temp;
		
	}
	/**
	 * 
	 * add:(复数的乘法)
	 *
	 * @param      设定文件
	 * @return void     返回复数
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	public Complex mul(Complex b) {
//		(a+bi) * (c + di) = ac + adi + bci + bd(i*i) = (ac-bd) + * (ad+bc)i
		Complex temp = new Complex();
		temp.real=this.real*b.real-this.im*b.im;
		temp.im=this.real*b.im+this.im+b.real;
		return temp;
	}
	@Override
	public String toString() {
		return   real + "+" + im + "i";
	}
	
	
}
