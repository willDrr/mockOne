package app.gui.panels_info.central_part.panel_tabs;

import static java.awt.Color.WHITE;

import java.awt.CardLayout;

import app.gui.builder.JPanelTemplate;
import app.model.User;

public class PanelTabCard extends JPanelTemplate {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final CardLayout card = new CardLayout();
	
	public PanelTabCard(User user) {
		
		super(card, WHITE);
		
		super.add(new PanelTabCardAbout(user), "panel_tab_about");
		super.add(new PanelTabCardTimeline(user), "panel_tab_timeline");
		
	}

}
