package app.gui.panels_info.left_part;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.border.EmptyBorder;

import app.gui.builder.JPanelTemplate;
import app.model.User;

public class LeftColumn extends JPanelTemplate {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final int inset = 20;
	
	private static final Color BLUE_TWILIO = new Color(13, 18, 43);
	
	public LeftColumn(User user) {
		
		
		super(new GridLayout(0, 1, 0, 10), BLUE_TWILIO, new EmptyBorder(inset, inset, inset, inset));


		super.add(new PanelPic(user));
		super.add(new PanelJobs(user));
		super.add(new PanelSkills(user));		
	
	}
	
}
