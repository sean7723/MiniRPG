package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import characters.Characters;

public class EventHandlerTargetOffensive implements ActionListener {

	private BackEnd _model;
	private Characters _target;

	public EventHandlerTargetOffensive(BackEnd model, Characters target) {
		_model = model;
		_target = target;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		_model.useOffensiveSkill(_target);
	}

}
