package item;

public class Sword extends Equipable {

	private int _attack;
	
	public Sword(String name, int attack) {
		super(name);
		_attack = attack;
	}
	
	public int getAttack(){
		return _attack;
	}
	
	public void setAttack(int attack){
		_attack = attack;
	}

}
