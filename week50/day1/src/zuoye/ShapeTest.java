/**
 * ShapaeFactory.java
 * zuoye
 *
 * Function�� TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2015��12��7�� 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;


/**
 * ��* ������ ��̬�������� A����Shape����Ϊ�����࣬Shape�еķ���area��girth����Ϊ���󷽷���������һ�����󷽷�draw��
 * B����������ʵ�������draw�������Դ�ӡ������ͼ�Ρ� C������һ��ShapeTest�࣬��main�����д���һ��Ԫ������ΪShape������Ϊ3
 * �����飬������������ͬ���͵Ķ���ѭ����ӡ����������ͼ�Ρ� D����ShapeTest�У�дһ������������һ��ͼ�Σ�Shape����Ϊ����������ӡ����ͼ�Ρ�
 * [ShapeTest.java]
 * 
 * 
 * 
 */
public class ShapeTest {
	//��ͨ��ʽ��Ӳ�ͬͼ�ε���������
	static Shape[] shape= {new Circle(56),new Rect(3,2),new Square(5) };
	//ͨ����������������ͬ��ͼ��
	static Shape[] shape1= {new Circle(56),new Rect(3,2),new Square(5) };
	
	public static void main(String[] args) {
		System.out.println("��ͨ��ʽ�����ͼ��");
		//�ֱ������������ÿ��ͼ�ε�draw����
		for (Shape shape : shape) {
			System.out.println("���ͼ��:"+printShape(shape));
		}
		System.out.println("ͨ�������������������Ժ�,���ͼ��");
		for (Shape shape : shape1) {
			System.out.println("���ͼ��:"+printShape(shape));
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
 * Function: Բ�����,���Լ����ܳ�,���,�Լ���ӡͼ��
 * <p>
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015	2015��12��7��		����4:28:42
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
		return "Բ��";
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
 * @Date	 2015	2015��12��7��		����4:45:56
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
 * @param g  ��
 * @param w ��
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
		return "����";
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
		return "������";
	}

}