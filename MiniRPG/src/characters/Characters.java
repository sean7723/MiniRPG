package characters;

import java.util.ArrayList;
import item.*;
public abstract class Characters {
	
	private int _maxHealth;
	private int _health;
	private int _attack;
	private int _armor;
	private String _name;
	private ArrayList<Item> _inventory;
	private ArrayList<Equipable> _equippedItems;
	
	
	public Characters(int health, int attack, int armor, String name) {
		_health = health;
		_attack = attack;
		_armor = armor;
		_name = name;
		_inventory = new ArrayList<Item>();
		_equippedItems = new ArrayList<Equipable>();
	}
	
	public boolean hit(Characters c) {
		if(_health > 0) {
			int damageDone = (int)((Math.random() * (_attack * 0.1) * 2) + 1) + (_attack - (int)(_attack * 0.2)) ;
			if(c.getHealth() <= 0)
				return false;
			if(c.getHealth() - damageDone <= 0) {
				c.setHealth(0);
				return true;
			}
			else {
				c.setHealth(c.getHealth() - damageDone);
				return true;
			}
		}
		return false;
	}
	
	public boolean hit(Characters c, int amount) {
		if(_health > 0) {
			if(c.getHealth() <= 0)
				return false;
			if(c.getHealth() - amount <= 0) {
				c.setHealth(0);
				return true;
			}
			else {
				c.setHealth(c.getHealth() - amount);
				return true;
			}
		}
		return false;
	}
	
	public void equipItem(Equipable e){
		_equippedItems.add(e);
		addStats();
	}
	
	public int getArmor() {
		return _armor;
	}
	
	public int getHealth() {
		return _health;
	}
	
	public int getAttack() {
		return _attack;
	}
	
	public String getName() {
		return _name;
	}
	
	public void setHealth(int amount) {
		_health = amount;
	}
	
	public void addHealth(int amount) {
		_health += amount;
		if(_health > _maxHealth)
			_health = _maxHealth;
	}
	
	private void addStats(){
		int health = _health;
		int attack = _attack;
		int armor = _armor;
		for(int i = 0; i < _equippedItems.size(); i++){
			attack += _equippedItems.get(i).getAttack();
			armor += _equippedItems.get(i).getArmor();
		}
		_attack = attack;
		_armor = armor;
	}
	
	public void printStats(){
		System.out.println("Name: " + _name);
		System.out.println("Health: " + _health);
		System.out.println("Attack: " + _attack);
		System.out.println("Armor: " + _armor);
	}
}
