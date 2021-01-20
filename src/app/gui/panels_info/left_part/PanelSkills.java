package app.gui.panels_info.left_part;

import static java.awt.Color.WHITE;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import app.gui.builder.BuilderLabel;
import app.gui.panels_info.generic.PanelInfoGeneric;
import app.model.Person;
import app.model.User;

public class PanelSkills extends PanelInfoGeneric<Person>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PanelSkills(User user) {
		
		super(new GridLayout(0, 1), user, new CompoundBorder(new TitledBorder("Skills"), new EmptyBorder(0, 5, 0, 0))); 
		
		final Font montserrat = new Font("Montserrat", Font.PLAIN, 13);
				
		final String[] skills = user.getSkills();
		
		for (String skill : skills) {			 
			final JLabel label = new BuilderLabel.LabelBuilder()
					.text(skill)
					.horizontalAligment(JLabel.LEADING)
					.font(montserrat)
					.opaque(true)
					.color(WHITE)
					.build();
			
			super.add(label);
			
		}
		
	}
	
}
