package characters;

import item.Sword;

public class Player extends Characters{
	public Player(int health, int attack, int armor, String name) {
		super(health, attack, armor, name);
		equipItem(new Sword("Bandes Godsword", 667));
	}
}
