package characters;

import java.util.ArrayList;
import item.*;
public abstract class Characters {
	
	private int _maxHealth;
	private int _health;
	private int _attack;
	private int _armor;
	private String _name;
	
	public Characters(int health, int attack, int armor, String name) {
		_maxHealth = health;
		_health = _maxHealth;
		_attack = attack;
		_armor = armor;
		_name = name;
	}
	
	public boolean hit(Characters c) {
		if(_health > 0) {
			int damageDone = (int)((Math.random() * (_attack * 0.1) * 2) + 1) + (_attack - (int)(_attack * 0.2));
			if(c.getHealth() <= 0)
				return false;
			if(c.getHealth() - damageDone <= 0) {
				c._health = 0;
				return true;
			}
			else {
				c._health = c._health - damageDone;
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
				c._health = 0;
				return true;
			}
			else {
				c._health = c._health - amount;
				return true;
			}
		}
		return false;
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
	
	public int getMaxHealth() {
		return _maxHealth;
	}
	
	public void setMaxHealth(int amount) {
		_maxHealth = amount;
	}
	
	public void setAttack(int amount) {
		_attack = amount;
	}
	
	public void setArmor(int amount) {
		_armor = amount;
	}
	
	public void addHealth(int amount) {
		_health += amount;
		if(_health > _maxHealth)
			_health = _maxHealth;
	}
	
	public void printStats(){
		System.out.println("Name: " + _name);
		System.out.println("Health: " + _health + " / " + _maxHealth);
		System.out.println("Attack: " + _attack);
		System.out.println("Armor: " + _armor);
	}
}
