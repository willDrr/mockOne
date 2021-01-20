package app.gui.panels_info.central_part.panel_tabs;

import static java.awt.Color.WHITE;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

import app.gui.builder.BuilderLabel;
import app.gui.builder.JPanelTemplate;
import app.model.User;

public final class PanelTabCardAbout extends JPanelTemplate {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final int INSET_RIGHT = 600;
	private static final int INSET_LEFT = 10;

	public PanelTabCardAbout(User user) {
		
		super(new GridLayout(0, 2), WHITE, new EmptyBorder(0, INSET_LEFT, 0, INSET_RIGHT)); 
		
		final Font montserrat = new Font("Montserrat", Font.PLAIN, 13);

		final int aligment = JLabel.LEADING;
		
		final JLabel labelPhone = new BuilderLabel.LabelBuilder()
				.text("Phone")
				.horizontalAligment(aligment)
				.font(montserrat)
				.opaque(true)
				.color(WHITE)
				.build();
		
		final JLabel labelPhoneUser = new BuilderLabel.LabelBuilder()
				.text(user.getPhone())
				.horizontalAligment(aligment)
				.font(montserrat)
				.opaque(true)
				.color(WHITE)
				.build();
		
		final JLabel labelAddress = new BuilderLabel.LabelBuilder()
				.text("Address")
				.horizontalAligment(aligment)
				.font(montserrat)
				.opaque(true)
				.color(WHITE)
				.build();
		
		final JLabel labelAddressUser = new BuilderLabel.LabelBuilder()
				.text(user.getAddress())
				.horizontalAligment(aligment)
				.font(montserrat)
				.opaque(true)
				.color(WHITE)
				.build();
		
		final JLabel labelEmail = new BuilderLabel.LabelBuilder()
				.text("Email")
				.horizontalAligment(aligment)
				.font(montserrat)
				.opaque(true)
				.color(WHITE)
				.build();
		
		final JLabel labelEmailUser = new BuilderLabel.LabelBuilder()
				.text(user.getEmail())
				.horizontalAligment(aligment)
				.font(montserrat)
				.opaque(true)
				.color(WHITE)
				.build();
		
		final JLabel labelSite = new BuilderLabel.LabelBuilder()
				.text("Site")
				.horizontalAligment(aligment)
				.font(montserrat)
				.opaque(true)
				.color(WHITE)
				.build();
		
		final JLabel labelSiteUser = new BuilderLabel.LabelBuilder()
				.text(user.getSite())
				.horizontalAligment(aligment)
				.font(montserrat)
				.opaque(true)
				.color(WHITE)
				.build();
		
		super.add(labelPhone);
		super.add(labelPhoneUser);
		
		super.add(labelAddress);
		super.add(labelAddressUser);
		
		super.add(labelEmail);
		super.add(labelEmailUser);
		
		super.add(labelSite);
		super.add(labelSiteUser);
		
	}

}
