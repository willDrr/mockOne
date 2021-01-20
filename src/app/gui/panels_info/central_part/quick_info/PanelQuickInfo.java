package app.gui.panels_info.central_part.quick_info;

import java.awt.GridLayout;

import app.gui.panels_info.generic.PanelInfoGeneric;
import app.model.Person;
import app.model.User;

public class PanelQuickInfo extends PanelInfoGeneric<Person> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelQuickInfo(User user) {
		
		super(new GridLayout(0, 2), user);

		super.add(new PanelQuickInfoUser(user));
		
		super.add(new PanelQuickInfoActions(user));
		
	}

}
