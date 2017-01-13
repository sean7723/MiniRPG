package item;

public abstract class Item {

	private String _name;
	private int _price;

	public Item(String name, int price){
		_name = name;
		_price = price;
	}	

	public String getName(){
		return _name;
	}
	
	public int getPrice(){
		return _price;
	}
	
	public void setName(String name){
		_name = name;
	}
}
