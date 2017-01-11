package Interface;

import java.util.ArrayList;

import characters.*;
import item.*;
import skill.*;

public class BackEnd {
	
	private PlayerInterface _inter;
	private ArrayList<Enemies> _enemies;
	private String[] _names = {"Joe", "Bob", "Jeff", "Rick", "Robert", "Gustav"};
	private Player _player;
	
	public BackEnd(String name, PlayerInterface inter) {
		_enemies = new ArrayList<Enemies>();
		_player = new Player(1000, 100, 100, name);
		_inter = inter;
		createEnemies();
	}
	
	/*public void createEnemies() {
		_enemies.add(new Enemies(100, 10, 10, "Bob"));
		_enemies.add(new Enemies(100, 10, 10, "Charlie"));
		_enemies.add(new Enemies(100, 10, 10, "Mark"));
		_enemies.add(new Enemies(100, 10, 10, "Jose"));
		_enemies.add(new Enemies(100, 10, 10, "Greg"));
	}*/
	
	public void createEnemies() {
		for (int i = 0; i < 5; i ++)
		{
			_enemies.add(new Enemies((int)(Math.random()*999000+1000), (int)(Math.random()*90+10), (int)(Math.random()*90+10), _names[(int)(Math.random()*5+1)]));
		}
	}
	
	public  Enemies getEnemy1() {
		return _enemies.get(0);
	}
	
	public Enemies getEnemy2() {
		return _enemies.get(1);
	}
	
	public Enemies getEnemy3() {
		return _enemies.get(2);
	}
	
	public Enemies getEnemy4() {
		return _enemies.get(3);
	}
	
	public Enemies getEnemy5() {
		return _enemies.get(4);
	}
}
