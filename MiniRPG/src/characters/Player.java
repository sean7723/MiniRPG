package characters;

import java.util.ArrayList;

import item.*;
import skill.*;

public class Player extends Characters {

	private ArrayList<Consumable> _inventory;
	private ArrayList<Equipable> _equippedItems;
	private ArrayList<Skill> _skillsList;

	public Player(String name) {
		super(0, 0, 0, name);
		_inventory = new ArrayList<Consumable>();
		_equippedItems = new ArrayList<Equipable>();
		equipItem(new Sword("Basic Sword", 500, 0));
		equipItem(new Chestplate("Basic Chestplate", 1000, 1000, 0));
		_skillsList = new ArrayList<Skill>();
		_skillsList.add(new Healing(this));
		_skillsList.add(new Fireball(this));
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

	public ArrayList<Skill> getSkills() {
		return _skillsList;
	}
}
