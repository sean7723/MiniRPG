package characters;

public abstract class Characters {
	
	private int _health;
	private int _attack;
	private int _armor;
	private String _name;
	
	
	public Characters(int health, int attack, int armor, String name) {
		_health = health;
		_attack = attack;
		_armor = armor;
		_name = name;
	}
	
	public String hit(Characters c) {
		int damageDone = (int)((Math.random() * (_attack * 0.1) * 2) + 1) + (_attack - (int)(_attack * 0.2)) ;
		if(c.getHealth() <= 0)
			return _name + " can't attack " + c.getName() + " because he is dead!"; 
		if(c.getHealth() - damageDone <= 0) {
			c.setHealth(0);
			return _name + " has hit " + c.getName() + " for " + damageDone + " damage. " + c.getName() + " has died.";
		}
		else {
			c.setHealth(c.getHealth() - damageDone);
			return _name + " has hit " + c.getName() + " for " + damageDone + " damage. " + c.getName() + " has " + c.getHealth() + " hp left.";
		}
	}
	
	public String hit(Characters c, int amount) {
		if(c.getHealth() <= 0)
			return _name + " can't attack " + c.getName() + " because he is dead!"; 
		if(c.getHealth() - amount <= 0) {
			c.setHealth(0);
			return _name + " has hit " + c.getName() + " for " + amount + " damage. " + c.getName() + " has died.";
		}
		else {
			c.setHealth(c.getHealth() - amount);
			return _name + " has hit " + c.getName() + " for " + amount + " damage. " + c.getName() + " has " + c.getHealth() + " hp left.";
		}
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
	
	public void printStats(){
		System.out.println("Name: " + _name);
		System.out.println("Health: " + _health);
		System.out.println("Attack: " + _attack);
		System.out.println("Armor: " + _armor);
	}
	
}
