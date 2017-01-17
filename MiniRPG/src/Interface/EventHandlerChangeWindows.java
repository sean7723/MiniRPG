package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlerChangeWindows implements ActionListener {
	/*
	 * 1 = Store Window
	 */
	private BackEnd _model;
	private int _window;

	public EventHandlerChangeWindows(BackEnd model, int window) {
		_model = model;
		_window = window;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		_model.toggleWindow(_window);
	}

}
