package app.gui.panels_info.left_part;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import app.gui.builder.BuilderLabel;
import app.gui.panels_info.generic.PanelInfoGeneric;
import app.model.Person;
import app.model.User;

public class PanelPic extends PanelInfoGeneric<Person>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PanelPic(User user) {
		
	
		super(new BorderLayout(), user, BorderFactory.createLineBorder(Color.BLUE));  
		
		final JLabel labelPic = new BuilderLabel.LabelBuilder()
				.icon(new ImageIcon("images/reddit.png"))
				.build();
		
		
		super.add(labelPic);
		
	}

}
