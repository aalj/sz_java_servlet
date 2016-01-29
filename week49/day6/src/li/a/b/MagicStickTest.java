/**
 * MagicStickTest.java
 * lianxi
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月6日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package li.a.b;

import java.util.ArrayList;
import java.util.List;

import lianxi.NamedRole;
import lianxi.Weapon;


/**
 * ClassName:MagicStickTest Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月6日 上午7:55:15
 *
 * @see
 * 
 */
public class MagicStickTest {
	public static void main(String[] args) {
		Team team = new Team();
		team.addMember((new Soldier(20)));
		team.addMember(new Magicer(5));
		team.addMember(new Magicer(2));
		team.addMember(new Soldier(2));
		team.addMember(new Soldier(10));
		System.out.println(team.attackSum());
	}

}

class Role {
	// 角色的名字
	private String name = null;

	public int attack() {
		return 0;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	};

}

class Magicer extends Role {
	private int level = 0;

	public Magicer(int level) {
		this.level = level;
		// TODO Auto-generated constructor stub

	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public int attack() {

		return level * 5;

	}

}

class Soldier  extends Role{
	int hurt = 20;
	public Soldier(int hurt) {
		this.hurt = hurt;

	}

	public int getAttacknum() {
		return hurt;
	}

	public void setAttacknum(int hurt) {
		this.hurt = hurt;
	}


}

class Team {
	private List<Role> list = new ArrayList<Role>();

	public List<Role> getList() {
		return list;
	}

	public void setList(List<Role> list) {
		this.list = list;
	}

	public boolean addMember(Role role) {
		if (list.size() < 6) {
			list.add(role);
			return true;
		}
		return false;
	}

	public int attackSum() {
		int num = 0;
		for (Role role : list) {
			num += role.attack();
		}

		return num;
	}
}