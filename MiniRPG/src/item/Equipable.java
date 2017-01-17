package item;

public abstract class Equipable extends Item {

	private int _health;
	private int _armor;
	private int _attack;

	public Equipable(String name, int price) {
		super(name, price);
	}

	public int getHealth() {
		return _health;
	}

	public void setHealth(int _health) {
		this._health = _health;
	}

	public int getArmor() {
		return _armor;
	}

	public void setArmor(int _armor) {
		this._armor = _armor;
	}

	public int getAttack() {
		return _attack;
	}

	public void setAttack(int _attack) {
		this._attack = _attack;
	}

}
