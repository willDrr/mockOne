package app.gui.mainpanel;

import static java.awt.Color.WHITE;

import java.awt.BorderLayout;

import app.gui.builder.JPanelTemplate;
import app.gui.header.Header;

public class SubPanel extends JPanelTemplate {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SubPanel() { 
		
		
		super(new BorderLayout(), WHITE);
				
		final SubPanelToggle subPanelToggle = new SubPanelToggle();
		
		final Header header = new Header(subPanelToggle);
		
		super.add(header, BorderLayout.NORTH); 
		
		super.add(subPanelToggle, BorderLayout.CENTER);
		
	}

}
