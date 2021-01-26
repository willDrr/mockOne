package app.gui.mainpanel;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.util.Date;

import javax.swing.JPanel;

import app.gui.builder.BuilderPanel;
import app.gui.builder.JPanelTemplate;
import app.gui.login.PanelForm;
import app.gui.panels_info.central_part.PanelDetailedInfoWork;
import app.gui.panels_info.left_part.LeftColumn;
import app.model.User;

public class SubPanelToggle extends JPanelTemplate {
	
	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;

	
	public  static final CardLayout cardlayout = new CardLayout();
	
	public SubPanelToggle() {
		
		super(cardlayout);
		
		final User user = new User("wilder", "foobar@gmail.com", "foobar", new Date() , "M", false);
				
		final JPanel panelForm = new PanelForm(user, this);
		
		final JPanel panelLanding = new BuilderPanel.PanelBuilder(new BorderLayout())				
				.addContainer(new LeftColumn(user), BorderLayout.WEST)
				.addContainer(new PanelDetailedInfoWork(user), BorderLayout.CENTER)
				.build();
		
		super.add(panelForm, NameCards.PANEL_FORM.string()); 
		super.add(panelLanding, NameCards.PANEL_LANDING.string());
		
	}

	enum NameCards {
		
		PANEL_FORM("panel_form"), PANEL_LANDING("panel_landing");
		
		private String text ;
		
		private NameCards(String text) { this.text = text;	}
		
		private String string() { return text; }
		
	}
	
}
