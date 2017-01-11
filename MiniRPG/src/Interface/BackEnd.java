package Interface;

import java.util.ArrayList;

import characters.*;
import item.*;
import skill.*;

public class BackEnd {
	
	private PlayerInterface _inter;
	private ArrayList<Enemies> _enemies;
	private Player _player;
	
	public BackEnd(String name) {
		_enemies = new ArrayList<Enemies>();
		_player = new Player(1000, 100, 100, name);
		System.out.println(name);
	}
	
	public void addObserver(PlayerInterface inter) {
		_inter = inter;
	}
}
