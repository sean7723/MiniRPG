package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlerAttack implements ActionListener {

	private BackEnd _model;
	private int _enemy;

	public EventHandlerAttack(BackEnd model, int enemy) {
		_model = model;
		_enemy = enemy;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		_model.hit(_model.getEnemy(_enemy));
	}

}
