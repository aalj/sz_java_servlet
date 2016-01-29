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


/**
 * （* 抽象类 多态）继上题 A、将Shape定义为抽象类，Shape中的方法area及girth定义为抽象方法，并增加一个抽象方法draw。
 * B、在子类中实现上面的draw方法，以打印给定的图形。 C、创建一个ShapeTest类，在main方法中创建一个元素类型为Shape，长度为3
 * 的数组，里面有三个不同类型的对象，循环打印这三个对象图形。 D、在ShapeTest中，写一个方法，接受一个图形（Shape）作为参数，并打印出该图形。
 * [ShapeTest.java]
 * 
 * 
 * 
 */
public class ShapeTest {
	//普通方式添加不同图形到数组里面
	static Shape[] shape= {new Circle(56),new Rect(3,2),new Square(5) };
	//通过工厂方法产生不同的图形
	static Shape[] shape1= {new Circle(56),new Rect(3,2),new Square(5) };
	
	public static void main(String[] args) {
		System.out.println("普通方式的输出图形");
		//分别输出数组里面每个图形的draw方法
		for (Shape shape : shape) {
			System.out.println("输出图形:"+printShape(shape));
		}
		System.out.println("通过工厂方法创建对象以后,输出图形");
		for (Shape shape : shape1) {
			System.out.println("输出图形:"+printShape(shape));
		}
	}
	public static String printShape(Shape sha){
		
		return sha.draw();
	}
}

abstract class Shape {
	abstract double area();

	abstract double girth();

	abstract String draw();
}
/**
 * 
 * ClassName:Circle
 * <p>
 * Function: 圆的设计,可以计算周长,面积,以及打印图形
 * <p>
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015	2015年12月7日		下午4:28:42
 *
 * @see
 */
class Circle extends Shape {
	private double size = 10;

	public Circle(double size) {
		this.size = size;
	}

	@Override
	public double area() {

		return size * size * 3.1415926;
	}

	@Override
	public double girth() {

		return 2 * size * 3.1415926;
	}

	@Override
	public String draw() {
		return "圆形";
	}
}

/**
 * 
 * ClassName:Rect
 * <p>
 * Function: TODO ADD FUNCTION
 * <p>
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015	2015年12月7日		下午4:45:56
 *
 * @see
 */
class Rect extends Shape{

	private double g = 0;
	private double w = 0;

	public Rect() {

	}
/**
 * 
 * Creates a new instance of Rect.
 *
 * @param g  高
 * @param w 宽
 */
	public Rect(double g, double w) {
		this.g = g;
		this.w = w;
	}

	@Override
	public double area() {

		return g * w;
	}

	@Override
	public double girth() {

		return 2 * (g + w);
	}

	@Override
	public String draw() {
		return "矩形";
	}
	
}
class Square extends Rect {
	private double g = 0;

	public Square(double g) {
		this.g = g;
	}

	@Override
	public double area() {

		return g * g;
	}

	@Override
	public double girth() {

		return 2 * (g + g);
	}

	@Override
	public String draw() {
		return "正方形";
	}

}