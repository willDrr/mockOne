package app.gui.panels_info.central_part;

import java.awt.GridLayout;

import javax.swing.border.EmptyBorder;

import app.gui.panels_info.central_part.panel_tabs.PanelTab;
import app.gui.panels_info.central_part.quick_info.PanelQuickInfo;
import app.gui.panels_info.generic.PanelInfoGeneric;
import app.model.Person;
import app.model.User;

public class PanelDetailedInfoWork extends PanelInfoGeneric<Person>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final int inset = 20;

	public PanelDetailedInfoWork(User user) {
		
		super(new GridLayout(0, 1), user, new EmptyBorder(inset, inset, inset, inset));
		
		
		super.add(new PanelQuickInfo(user)); 
		
		super.add(new PanelTab(user));
		
		
	}
	
}
