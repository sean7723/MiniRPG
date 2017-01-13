package item;

import characters.Characters;

public abstract class Consumable extends Item {

	private Characters _owner;
	private int _health;
	
	public Consumable(String name, int health, int price, Characters owner) {
		super(name, price);
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
