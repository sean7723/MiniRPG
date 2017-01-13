package Interface;

import java.util.ArrayList;

import characters.*;
import item.*;
import skill.*;

public class BackEnd {

	private PlayerInterface _inter;
	private ArrayList<Enemies> _enemies;
	private String[] _names = { "Joe", "Bob", "Jeff", "Rick", "Robert", "Gustav", "Krusher99", "Pikachiu" };
	private ArrayList<Item> _store;
	private Player _player;
	private int _money;
	private int _round;

	public BackEnd(String name, PlayerInterface inter) {
		_enemies = new ArrayList<Enemies>();
		_player = new Player(name);
		_player.addHealth(_player.getMaxHealth());
		_inter = inter;
		_money = 10000000;
		_round = 0;
		createStore();
		createEnemies();
	}
	
	public void createStore() {
		_store = new ArrayList<Item>();
		_store.add(null); //Consumable
		_store.add(new Sword("Stone Sword", 500, 2500));
		_store.add(new Sword("Iron Sword", 1000, 5000));
		_store.add(new Sword("Gold Sword", 2000, 7500));
		_store.add(new Sword("Diamond Sword", 2500, 10000));
		_store.add(new Chestplate("Stone Chestplate", 100, 500, 2500));
		_store.add(new Chestplate("Iron Chestplate", 200, 1000, 5000));
		_store.add(new Chestplate("Chainmail Chestplate", 400, 2000, 7500));
		_store.add(new Chestplate("Diamond Chestplate", 500, 2500, 10000));
	}

	public void createEnemies() {
		for (int i = 0; i < 5; i++) {
			_enemies.add(new Enemies((int) (Math.random() * 800 + (200 * (_round / 5 + 1))),
					(int) (Math.random() * 60 + (10 * (_round / 5 + 1))),
					(int) (Math.random() * 12 + (10 * (_round / 5 + 1))), _names[(int) (Math.random() * 6 + 1)]));
		}
	}

	public void newEnemies() {
		for (int i = _enemies.size() - 1; i >= 0; i--)
			_enemies.remove(i);
		createEnemies();
	}

	public void restoreHealth() {
		_player.addHealth(_player.getMaxHealth());
	}

	public void hit(Enemies target) {
		if (_player.hit(target)) {
			enemyHits();
			checkKill(target);
		}

		if (checkKillAll()) {
			newEnemies();
			restoreHealth();
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

	public boolean checkKillAll() {
		boolean isAllDead = true;
		for (int i = 0; i < _enemies.size(); i++)
			if (_enemies.get(i).getHealth() > 0)
				isAllDead = false;
		return isAllDead;
	}

	public void purchaseItem(int itemNum) {
		switch (itemNum) {
		case 1: 
			if(_money - _store.get(0).getPrice() >= 0){
				// Put Consumable in Inventory
				_money -= _store.get(0).getPrice();
				_inter.update();
			}
			break;
		case 2:
			if(_money - _store.get(1).getPrice() >= 0) {
				_player.equipItem((Equipable)_store.get(1));
				_money -= _store.get(1).getPrice();
				_inter.update();
			}
			break;
		case 3:
			if(_money - _store.get(2).getPrice() >= 0) {
				_player.equipItem((Equipable)_store.get(2));
				_money -= _store.get(2).getPrice();
				_inter.update();
			}
			break;
		case 4:
			if(_money - _store.get(3).getPrice() >= 0) {
				_player.equipItem((Equipable)_store.get(3));
				_money -= _store.get(3).getPrice();
				_inter.update();
			}
			break;
		case 5:
			if(_money - _store.get(4).getPrice() >= 0) {
				_player.equipItem((Equipable)_store.get(4));
				_money -= _store.get(4).getPrice();
				_inter.update();
			}
			break;
		case 6:
			if(_money - _store.get(5).getPrice() >= 0) {
				_player.equipItem((Equipable)_store.get(5));
				_money -= _store.get(5).getPrice();
				_inter.update();
			}
			break;
		case 7:
			if(_money - _store.get(6).getPrice() >= 0) {
				_player.equipItem((Equipable)_store.get(6));
				_money -= _store.get(6).getPrice();
				_inter.update();
			}
			break;
		case 8:
			if(_money - _store.get(7).getPrice() >= 0) {
				_player.equipItem((Equipable)_store.get(7));
				_money -= _store.get(7).getPrice();
				_inter.update();
			}
			break;
		case 9:
			if(_money - _store.get(8).getPrice() >= 0) {
				_player.equipItem((Equipable)_store.get(8));
				_money -= _store.get(8).getPrice();
				_inter.update();
			}
			break;
		}
	}

	public void toggleWindow(int windowNumber) {
		switch (windowNumber) {
		case 1:
			_inter.toggleStore();
			break;
		default:
			break;
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
	
	public 
}
