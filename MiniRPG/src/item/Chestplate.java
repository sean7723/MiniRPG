package item;

public class Chestplate extends Equipable {

	private int _armor;
	
	public Chestplate(String name, int armor) {
		super(name);
		_armor = armor;
	}
	
	public int getArmor(){
		return _armor;
	}
	
	public void setArmor(int armor){
		_armor = armor;
	}

}
