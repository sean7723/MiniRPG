package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlerMakePurchase implements ActionListener {
	
	private BackEnd _model;
	private int _itemNum;
	
	public EventHandlerMakePurchase(BackEnd model, int itemNum) {
		_model = model;
		_itemNum = itemNum;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		_model.purchaseItem(_itemNum);
	}

}
