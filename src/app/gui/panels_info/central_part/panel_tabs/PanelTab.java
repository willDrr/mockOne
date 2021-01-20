package app.gui.panels_info.central_part.panel_tabs;

import java.awt.BorderLayout;

import app.gui.panels_info.generic.PanelInfoGeneric;
import app.model.Person;
import app.model.User;

public class PanelTab extends PanelInfoGeneric<Person> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelTab(User user) {
		
		super(new BorderLayout(), user);
		
		super.add(new PanelTabCardController(), BorderLayout.NORTH);
		
		super.add(new PanelTabCard(user), BorderLayout.CENTER);
		
	}

}
