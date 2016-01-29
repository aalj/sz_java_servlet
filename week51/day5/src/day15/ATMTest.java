/**
 * ATMTest.java
 * day15
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月18日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day15;

/**
 * ClassName:ATMTest Function:模拟从账户中取款 Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月18日 下午2:49:31
 *
 * @see
 * 
 */
public class ATMTest {

	public static void main(String[] args) {
		//模拟多人（多个线程对象）从同一个账户中取款
		Accurt accurt = new Accurt();
		new  ATM("小偷1", accurt, 2000).start();
		new  ATM("小偷2", accurt, 1000).start();
		new  ATM("小偷3", accurt, 8000).start();
		
		

	}

}

class ATM extends Thread {
	// 谁取走了钱,
	// 从哪个账户中取走的钱
	private String name;
	private Accurt accurt;
	private int money;

	public ATM(String name, Accurt accurt, int money) {
		this.name = name;
		this.accurt = accurt;
		this.money = money;
	}

	public Accurt getAccurt() {
		return accurt;
	}

	public void setAccurt(Accurt accurt) {
		this.accurt = accurt;
	}

	@Override
	public void run() {
		try {
			accurt.getMomey(money,name);
			Thread.sleep(100);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
