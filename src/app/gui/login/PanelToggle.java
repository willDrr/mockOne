package app.gui.login;

import static java.awt.Color.WHITE;

import java.awt.CardLayout;

import app.gui.builder.JPanelTemplate;
import app.gui.mainpanel.SubPanelToggle;
import app.model.User;

public final class PanelToggle extends JPanelTemplate {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static final CardLayout card = new CardLayout();
		
	public PanelToggle(User user, SubPanelToggle subPanelToggle) {
		
		super(card, WHITE);
		
		super.add(new PanelLogin(user, this, subPanelToggle), "panellogin");
		
		super.add(new PanelRegister(user, this, subPanelToggle), "panelregister");
		
	}
	
}
