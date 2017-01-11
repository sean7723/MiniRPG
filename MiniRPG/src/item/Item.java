package item;

public abstract class Item {

	private String _name;

	public Item(String name){
		_name = name;
	}	

	public String getName(){
		return _name;
	}
	
	public void setName(String name){
		_name = name;
	}
}
