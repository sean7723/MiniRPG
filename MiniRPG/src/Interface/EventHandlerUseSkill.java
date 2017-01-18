package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlerUseSkill implements ActionListener {
	
	private BackEnd _model;
	private int _skillNum;

	public EventHandlerUseSkill(BackEnd model, int skillNum) {
		_model = model;
		_skillNum = skillNum;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		_model.useSkill(_skillNum);
	}
}
