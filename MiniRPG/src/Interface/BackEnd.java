package Interface;

import java.util.ArrayList;

import characters.*;
import item.*;
import skill.*;

public class BackEnd {

	private PlayerInterface _inter;
	private ArrayList<Enemies> _enemies;
	private String[] _names = { "Joe", "Bob", "Jeff", "Rick", "Robert", "Gustav", "Krusher99" };
	private Player _player;
	private String _battleLog;
	private int _money;
	private int _round;

	public BackEnd(String name, PlayerInterface inter) {
		_enemies = new ArrayList<Enemies>();
		_player = new Player(10000, 10000, 10000, name);
		_inter = inter;
		_money = 100;
		_round = 0;
		createEnemies();
	}

	public void createEnemies() {
		for (int i = 0; i < 5; i++) {
			_enemies.add(new Enemies((int) (Math.random() * 800 + (200 * (_round / 5 + 1))), (int) (Math.random() * 60 + (10 * (_round / 5 + 1))),
					(int) (Math.random() * 12 + (10 * (_round / 5 + 1))), _names[(int) (Math.random() * 6 + 1)]));
		}
	}

	public boolean checkKillAll() {
		boolean isAllDead = true;
		for (int i = 0; i < _enemies.size(); i++)
			if (_enemies.get(i).getHealth() > 0)
				isAllDead = false;
		return isAllDead;
	}

	public void newEnemies() {
		for (int i = _enemies.size() - 1; i >= 0; i--)
			_enemies.remove(i);
		createEnemies();
	}

	public void hit(Enemies target) {
		if (_player.hit(target)) {
			enemyHits();
			checkKill(target);
		}

		if (checkKillAll()) {
			newEnemies();
			_round++;
		}

		_inter.update();
	}

	public void enemyHits() {
		for (int i = 0; i < _enemies.size(); i++)
			_enemies.get(i).hit(_player);
	}

	public void checkKill(Enemies enemy) {
		if (enemy.getHealth() == 0) {
			_money += 100;
		}
	}

	public Enemies getEnemy(int position) {
		return _enemies.get(position);
	}

	public Enemies getEnemy1() {
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

	public int getMoney() {
		return _money;
	}
	
	public int getRound() {
		return _round + 1;
	}
	
}
