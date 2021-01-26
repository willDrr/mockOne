package app.gui.login;

import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import app.gui.mainpanel.SubPanelToggle;
import app.gui.panels_info.generic.PanelInfoGeneric;
import app.model.Person;
import app.model.User;

public final class PanelForm  extends PanelInfoGeneric<Person> { 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final int inset = 150;
	
	private static final LayoutManager manager = new BorderLayout();
	private static final Border border = new EmptyBorder(inset, inset, inset, inset);
	
	public PanelForm(User user, SubPanelToggle subPanelToggle) {		
		
		super(manager, user, border);
		
		
//		super.add(new PanelToggle(user, subPanelToggle));
		
		super.add(new PanelLanding(new PanelToggle(user, subPanelToggle)));
		
		
	}

}
