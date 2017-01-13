package Interface;

import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PlayerInterface implements Runnable {

	private BackEnd _model;
	private JFrame _frame;
	private JFrame _storeFrame;
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
	private JLabel _gameName;
	private JButton _hitButton;
	private JButton _skillButton;
	private JButton _inventoryButton;
	private JButton _storeButton;
	private JButton _storeCloseButton;
	private JButton _target1;
	private JButton _target2;
	private JButton _target3;
	private JButton _target4;
	private JButton _target5;
	private JPanel _panel1;
	private JPanel _panel2;
	private JPanel _panel3;
	private JPanel _panel4;

	public PlayerInterface() {
		_storeFrame = new JFrame("Fun Adventures Store");
		_frame = new JFrame("Fun Adventures");
		_panel1 = new JPanel();
		_panel2 = new JPanel();
		_panel3 = new JPanel();
		_panel4 = new JPanel();
		// first row
		_enemy1 = new JLabel("Hello");
		_enemy2 = new JLabel("Hello");
		_enemy3 = new JLabel("Hello");
		_enemy4 = new JLabel("Hello");
		_enemy5 = new JLabel("Hello");
		// second row
		_target1 = new JButton("Target");
		_target2 = new JButton("Target");
		_target3 = new JButton("Target");
		_target4 = new JButton("Target");
		_target5 = new JButton("Target");
		// third Row
		_gameName = new JLabel("- Fun Adventures -", SwingConstants.CENTER);
		// fourth row
		_playerInt1 = new JLabel("temp");
		_playerInt2 = new JLabel("temp");
		_hitButton = new JButton("Hit");
		_skillButton = new JButton("Skill");
		_inventoryButton = new JButton("Inventory");
		_storeButton = new JButton("Open Store");
		_storeCloseButton = new JButton("Open Store");

		_model = new BackEnd((String) JOptionPane.showInputDialog("Hello adventurer, what is your name?"), this);
		update();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new PlayerInterface());
	}

	@Override
	public void run() {
		// General Frame
		_frame.getContentPane().setLayout(new GridLayout(4, 1));
		_panel1.setLayout(new GridLayout(1, 5));
		_panel2.setLayout(new GridLayout(1, 5));
		_panel3.setLayout(new GridLayout(1, 1));
		_panel4.setLayout(new GridLayout(1, 5));
		_frame.add(_panel1);
		_frame.add(_panel2);
		_frame.add(_panel3);
		_frame.add(_panel4);
		// first row
		_panel1.add(_enemy1);
		_panel1.add(_enemy2);
		_panel1.add(_enemy3);
		_panel1.add(_enemy4);
		_panel1.add(_enemy5);
		// second row
		_panel2.add(_target1);
		_panel2.add(_target2);
		_panel2.add(_target3);
		_panel2.add(_target4);
		_panel2.add(_target5);
		// third row
		_panel3.add(_gameName);
		// fourth row
		_panel4.add(_playerInt1);
		_panel4.add(_playerInt2);
		_panel4.add(_storeButton);
		_panel4.add(_skillButton);
		_panel4.add(_inventoryButton);

		_target1.addActionListener(new EventHandlerAttack(_model, 0));
		_target2.addActionListener(new EventHandlerAttack(_model, 1));
		_target3.addActionListener(new EventHandlerAttack(_model, 2));
		_target4.addActionListener(new EventHandlerAttack(_model, 3));
		_target5.addActionListener(new EventHandlerAttack(_model, 4));

		_storeButton.addActionListener(new EventHandlerChangeWindows(_model, 1));
		_storeCloseButton.addActionListener(new EventHandlerChangeWindows(_model, 1));

		_storeFrame.add(_storeCloseButton);

		_storeFrame.pack();
		_storeFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		_frame.pack();
		_frame.setVisible(true);
		_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void update() {
		_enemy1.setText("<html> Name: " + _model.getEnemy1().getName() + "<br />Health: "
				+ _model.getEnemy1().getHealth() + " / " + _model.getEnemy1().getMaxHealth() + "<br />Attack: "
				+ _model.getEnemy1().getAttack() + "<br />Armor: " + _model.getEnemy1().getArmor() + "</html>");
		_enemy2.setText("<html> Name: " + _model.getEnemy2().getName() + "<br />Health: "
				+ _model.getEnemy2().getHealth() + " / " + _model.getEnemy2().getMaxHealth() + "<br />Attack: "
				+ _model.getEnemy2().getAttack() + "<br />Armor: " + _model.getEnemy2().getArmor() + "</html>");
		_enemy3.setText("<html> Name: " + _model.getEnemy3().getName() + "<br />Health: "
				+ _model.getEnemy3().getHealth() + " / " + _model.getEnemy3().getMaxHealth() + "<br />Attack: "
				+ _model.getEnemy3().getAttack() + "<br />Armor: " + _model.getEnemy3().getArmor() + "</html>");
		_enemy4.setText("<html> Name: " + _model.getEnemy4().getName() + "<br />Health: "
				+ _model.getEnemy4().getHealth() + " / " + _model.getEnemy4().getMaxHealth() + "<br />Attack: "
				+ _model.getEnemy4().getAttack() + "<br />Armor: " + _model.getEnemy4().getArmor() + "</html>");
		_enemy5.setText("<html> Name: " + _model.getEnemy5().getName() + "<br />Health: "
				+ _model.getEnemy5().getHealth() + " / " + _model.getEnemy5().getMaxHealth() + "<br />Attack: "
				+ _model.getEnemy5().getAttack() + "<br />Armor: " + _model.getEnemy5().getArmor() + "</html>");
		_playerInt1.setText("<html>" + _model.getPlayer().getName() + "<br /> Balance: " + _model.getMoney()
				+ "<br /> Round: " + _model.getRound() + "</html>");
		_playerInt2.setText("<html>Health: " + _model.getPlayer().getHealth() + " / "
				+ _model.getPlayer().getMaxHealth() + "<br />Attack: " + _model.getPlayer().getAttack()
				+ "<br />Armor: " + _model.getPlayer().getArmor() + "</html>");
	}

	public void toggleStore() {
		if (_storeFrame.isVisible()) {
			_storeButton.setText("Open Store");
			_storeCloseButton.setText("Open Store");
			_storeFrame.setVisible(false);
		} else {
			_storeButton.setText("Close Store");
			_storeCloseButton.setText("Close Store");
			_storeFrame.setVisible(true);
		}
	}
}
