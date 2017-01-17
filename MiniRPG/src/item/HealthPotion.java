package item;

import characters.Characters;

public class HealthPotion extends Consumable {

	public HealthPotion(int health, int price, Characters owner) {
		super("Health Potion", health, price, owner);
	}

	public boolean use() {
		if (getOwner().getHealth() != getOwner().getMaxHealth()) {
			getOwner().addHealth(getHealth());
			return true;
		}
		return false;
	}
}
