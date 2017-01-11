package Interface;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class PlayerInterface implements Runnable {
	
	private BackEnd _model;
	
	public PlayerInterface() {
		_model = new BackEnd((String)JOptionPane.showInputDialog("Hello adventurer, what is your name?"));
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new PlayerInterface());
	}
	
	@Override
	public void run() {
		_model.addObserver(this);
	}

}
