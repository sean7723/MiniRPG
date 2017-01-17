package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlerUseConsumable implements ActionListener {

	private BackEnd _model;
	private String _consumableName;

	public EventHandlerUseConsumable(BackEnd model, String consumableName) {
		_model = model;
		_consumableName = consumableName;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		_model.useConsumable(_consumableName);
	}

}
