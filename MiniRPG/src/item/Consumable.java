package item;

import characters.Characters;

public abstract class Consumable extends Item {

	private Characters _owner;
	private int _health;
	
	public Consumable(String name, int health, Characters owner) {
		super(name);
		_owner = owner;
		_health = health;
	}
	
	public Characters getOwner(){
		return _owner;
	}
	
	public int getHealth(){
		return _health;
	}
	
	public void setOwner(Characters owner){
		_owner = owner;
	}
	
	public void setHealth(int health){
		_health = health;
	}

	public void use(){
		_owner.addHealth(_health);
	}
}
