package characters;

import java.util.ArrayList;

import item.Chestplate;
import item.Consumable;
import item.Equipable;
import item.Item;
import item.Sword;

public class Player extends Characters {

	private ArrayList<Consumable> _inventory;
	private ArrayList<Equipable> _equippedItems;

	public Player(String name) {
		super(0, 0, 0, name);
		_inventory = new ArrayList<Consumable>();
		_equippedItems = new ArrayList<Equipable>();
		equipItem(new Sword("Basic Sword", 10000, 0));
		equipItem(new Chestplate("Basic Chestplate", 10000, 10000, 0));
	}

	public void equipItem(Equipable e) {
		_equippedItems.add(e);
		addStats(e);
	}

	public void putConsumableInInventory(Consumable c) {
		_inventory.add(c);
	}

	private void addStats(Equipable e) {
		int health = getMaxHealth();
		int attack = getAttack();
		int armor = getArmor();
		health += e.getHealth();
		attack += e.getAttack();
		armor += e.getArmor();
		setMaxHealth(health);
		setAttack(attack);
		setArmor(armor);
	}
	
	public ArrayList<Consumable> getInventory() {
		return _inventory;
	}
}
