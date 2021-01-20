package app.gui.panels_info.left_part;

import static java.awt.Color.WHITE;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;

import app.gui.builder.BuilderLabel;
import app.gui.panels_info.generic.PanelInfoGeneric;
import app.model.Person;
import app.model.User;

public class PanelInfoWork extends PanelInfoGeneric<Person>  { 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;  
	

	public PanelInfoWork(User user) {

		super(new GridLayout(0, 2), user); 
		
		final Font montserrat = new Font("Montserrat", Font.PLAIN, 14);
		
		
		final JLabel labelBirthday = new BuilderLabel.LabelBuilder()
				.text("Birthday")
				.font(montserrat)
				.opaque(true)
				.color(WHITE)
				.foreground(Color.BLUE.brighter()) 
				.build();
		
		final JLabel labelUserBirthday = new BuilderLabel.LabelBuilder()
				.text(user.getBirth().toString())
				.font(montserrat)
				.opaque(true)
				.color(WHITE)
				.foreground(Color.BLUE.brighter())
				.build();
				
		
		final JLabel labelGender = new BuilderLabel.LabelBuilder()
				.text("Gender")
				.font(montserrat)
				.opaque(true)
				.color(WHITE)
				.foreground(Color.BLUE.brighter()) 
				.build();
		
		final JLabel labelUserGender = new BuilderLabel.LabelBuilder()
				.text(user.getGender())
				.font(montserrat)
				.opaque(true)
				.color(WHITE)
				.foreground(Color.BLUE.brighter())
				.build();
		
		
		super.add(labelBirthday);
		super.add(labelUserBirthday);
		
		super.add(labelGender);
		super.add(labelUserGender);
		
	}

}
