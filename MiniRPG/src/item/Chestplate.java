package item;

public class Chestplate extends Equipable {

	public Chestplate(String name, int armor, int health, int price) {
		super(name, price);
		setArmor(armor);
		setHealth(health);
	}

}
