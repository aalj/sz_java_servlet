/**
 * ArmyTest.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月8日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;
/*
 * 1、（*接口及其实现）按下列要求编程
	a、定义一个接口Assaultable(可攻击的)，该接口有一个抽象方法attack()。
	b、定义一个接口Mobile（可移动的）,该接口有一个抽象方法move()。
	c、定义一个抽象类Weapon,实现Assaultable接口和Mobile接口，但并没有给出具体的
实现方法。
	d、定义3个类：Tank,Flighter,WarShip都继承自Weapon,分别用不同的方式实现 Weapon 类中的抽象方法。
	e、写一个类Army,代表一支军队，这个类有一个属性是Weapon数组w（用来存储该军队所拥有的所有武器）；该类还提供一个构造方法，在构造方法里通过传一个int类型的参数来限定该类所能拥有的最大武器数量,并用这一大小来初始化数组w。该类还提供一个方法addWeapon(Weapon wa),表示把参数wa所代表的武器加入到数组w中。在这个类中还定义两个方法attackAll()和moveAll()，让w数组中的所有武器攻击和移 动。
	f、写一个主方法去测试以上程序。

 */
/**
 * ClassName:ArmyTest 
 * <p>
 * Function: 测试类
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月8日 下午4:21:03
 *
 * @see
 * 
 */
public class ArmyTest {

	public static void main(String[] args) {
		Army army = new Army(3);
		army.addWeapon(new Tank());
		army.addWeapon(new Flighter());
		army.addWeapon(new  WarShip());
		army.addWeapon(new  Tank());
		army.attackAll();
		army.moveAll();
	}

}

/**
 * 
 * ClassName:Assaultable
 * <p>
 * Function: 可以攻击的接口
 * <p>
 * Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015 2015年12月8日 下午4:24:10
 *
 * @see
 */
interface Assaultable {
	/**
	 * 
	 * attack:(攻击的方法)
	 *
	 * @param 设定文件
	 * @return void DOM对象
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public abstract String attack();
}

/**
 * 
 * ClassName:Mobile
 * <p>
 * Function: 可以动的接口
 * <p>
 * Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015 2015年12月8日 下午4:26:11
 *
 * @see
 */
interface Mobile {
	/**
	 * 
	 * move:(移动的方法)
	 *
	 * @param 设定文件
	 * @return void DOM对象
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	public abstract String move();
}

abstract class Weapon implements Assaultable, Mobile {

}

/**
 * 
 * ClassName:Tank
 * <p>
 * Function: tank武器类
 * <p>
 * Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015 2015年12月8日 下午4:28:33
 *
 * @see
 */
class Tank extends Weapon {

	@Override
	public String attack() {

		return "Tank 攻击";

	}

	@Override
	public String move() {

		return "Tank  攻击";

	}

}

/**
 * 
 * ClassName:Flighter
 * <p>
 * Function: flighter武器
 * <p>
 * Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015 2015年12月8日 下午4:28:56
 *
 * @see
 */
class Flighter extends Weapon {

	@Override
	public String attack() {

		return "Flighter 攻击";

	}

	@Override
	public String move() {

		return "Flighter  攻击";

	}

}

/**
 * 
 * ClassName:WarShip
 * <p>
 * Function: WarShip武器
 * <p>
 * Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015 2015年12月8日 下午4:29:11
 *
 * @see
 */
class WarShip extends Weapon {

	@Override
	public String attack() {

		return "WarShip 攻击";

	}

	@Override
	public String move() {

		return "WarShip  攻击";

	}

}
/**
 * 
 * ClassName:Army
 * <p>
 * Function: 定义的实例类  实现军队的建立,以及输出军队的状态
 * <p>
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015	2015年12月8日		下午4:49:49
 *
 * @see
 */
class Army {
	int num = 0;
	Weapon[] w = null;

	public Army(int num) {
		this.num = num;
		w = new Weapon[num];
	}

	public boolean addWeapon(Weapon wa) {
		for (int i = 0; i < w.length; i++) {
			if (w[i] == null) {
				w[i] = wa;
				return true;
			}
			if (i >= w.length) {
				return false;
			}
		}

		return false;
	}
	/**
	 * 
	 * attackAll:(军队的攻击状态)
	 *
	 * @param      设定文件
	 * @return void    DOM对象
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	public void attackAll() {
		for (Weapon weapon : w) {
		System.out.println(	weapon.attack());
		}

	}
/**
 * 
 * moveAll:(军队的移动状态)
 *
 * @param      设定文件
 * @return void    DOM对象
 * @throws 
 * @since  CodingExample　Ver 1.1
 */
	public void moveAll() {
		for (Weapon weapon : w) {
			System.out.println(weapon.move());
			
		}
	}

}