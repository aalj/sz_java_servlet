package lianxi;
class Soldier extends NamedRole {
	int hurt = 20;
	Weapon weapon  = null;
	public Soldier(int hurt,Weapon weapon) {
		this.hurt = hurt;
		this.weapon= weapon;

	}

	public int getAttacknum() {
		return hurt;
	}

	public void setAttacknum(int hurt) {
		this.hurt = hurt;
	}

	@Override
	public int attack() {

		return hurt+weapon.fire();

	}

	@Override
	public void practise() {
		hurt+=10;
	}
}