package Interface;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class PlayerInterface implements Runnable {
	
	private BackEnd _model;
	private JFrame _frame;
	private JLabel _enemy1;
	private JLabel _enemy2;
	private JLabel _enemy3;
	private JLabel _enemy4;
	private JLabel _enemy5;
	private JLabel _playerInt1;
	private JLabel _playerInt2;
	private JLabel _playerInt3;
	private JLabel _playerInt4;
	private JLabel _playerInt5;
	
	public PlayerInterface() {
		_frame = new JFrame("Fun Adventures");
		_enemy1 = new JLabel("Hello");
		_enemy2 = new JLabel("Hello");
		_enemy3 = new JLabel("Hello");
		_enemy4 = new JLabel("Hello");
		_enemy5 = new JLabel("Hello");
		_playerInt1 = new JLabel("temp");
		_playerInt2 = new JLabel("temp");
		_playerInt3 = new JLabel("temp");
		_playerInt4 = new JLabel("temp");
		_playerInt5 = new JLabel("temp");
		
		_model = new BackEnd((String)JOptionPane.showInputDialog("Hello adventurer, what is your name?"), this);
		update();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new PlayerInterface());
	}
	
	@Override
	public void run() {
		_frame.getContentPane().setLayout(new GridLayout(2, 5));
		_frame.add(_enemy1);
		_frame.add(_enemy2);
		_frame.add(_enemy3);
		_frame.add(_enemy4);
		_frame.add(_enemy5);
		_frame.add(_playerInt1);
		_frame.add(_playerInt2);
		_frame.add(_playerInt3);
		_frame.add(_playerInt4);
		_frame.add(_playerInt5);
		
		_frame.pack();
		_frame.setVisible(true);
		_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void update() {
		_enemy1.setText("<html> Name: " + _model.getEnemy1().getName() + 
						"<br />Health: " + _model.getEnemy1().getHealth() + 
						"<br />Attack: " + _model.getEnemy1().getAttack() +
						"<br />Armor: " + _model.getEnemy1().getArmor() + "</html>"
						);
		_enemy2.setText("<html> Name: " + _model.getEnemy2().getName() + 
						"<br />Health: " + _model.getEnemy2().getHealth() + 
						"<br />Attack: " + _model.getEnemy2().getAttack() +
						"<br />Armor: " + _model.getEnemy2().getArmor() + "</html>"
						);
		_enemy3.setText("<html> Name: " + _model.getEnemy3().getName() + 
						"<br />Health: " + _model.getEnemy3().getHealth() + 
						"<br />Attack: " + _model.getEnemy3().getAttack() +
						"<br />Armor: " + _model.getEnemy3().getArmor() + "</html>"
						);
		_enemy4.setText("<html> Name: " + _model.getEnemy4().getName() + 
						"<br />Health: " + _model.getEnemy4().getHealth() + 
						"<br />Attack: " + _model.getEnemy4().getAttack() +
						"<br />Armor: " + _model.getEnemy4().getArmor() + "</html>"
						);
		_enemy5.setText("<html> Name: " + _model.getEnemy5().getName() + 
						"<br />Health: " + _model.getEnemy5().getHealth() + 
						"<br />Attack: " + _model.getEnemy5().getAttack() +
						"<br />Armor: " + _model.getEnemy5().getArmor() + "</html>"
						);
	}
}
