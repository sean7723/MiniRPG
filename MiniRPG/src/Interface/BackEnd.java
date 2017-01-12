package Interface;

import java.util.ArrayList;

import characters.*;
import item.*;
import skill.*;

public class BackEnd {
	
	private PlayerInterface _inter;
	private ArrayList<Enemies> _enemies;
	private String[] _names = {"Joe", "Bob", "Jeff", "Rick", "Robert", "Gustav", "Krusher99"};
	private Player _player;
	private String _battleLog;
	
	public BackEnd(String name, PlayerInterface inter) {
		_enemies = new ArrayList<Enemies>();
		_player = new Player(1000, 100, 100, name);
		_inter = inter;
		_battleLog = "Nothing to Report ";
		createEnemies();
	}
	
	public void createEnemies() {
		for (int i = 0; i < 5; i ++)
		{
			_enemies.add(new Enemies((int)(Math.random()*800+200), (int)(Math.random()*60+10), (int)(Math.random()*12+10), _names[(int)(Math.random()*6+1)]));
		}
	}
	
	public void hit(Characters target) {
		if(_player.hit(target)) {
			for(int i = 0; i < _enemies.size(); i++)
				_enemies.get(i).hit(_player);
		}
		_inter.update();
	}
	
	public Enemies getEnemy(int position) {
		return _enemies.get(position);
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
	
	public Player getPlayer() {
		return _player;
	}
	
	public String getBattleLog() {
		return _battleLog;
	}
}
