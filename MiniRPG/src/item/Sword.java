package item;

public class Sword extends Equipable {
	
	public Sword(String name, int attack, int price) {
		super(name, price);
		setAttack(attack);
	}

}
