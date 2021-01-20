package app.gui.panels_info.central_part.quick_info;

import static java.awt.Color.WHITE;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import app.gui.builder.BuilderLabel;
import app.gui.builder.JPanelTemplate;
import app.model.User;

public class PanelQuickInfoUser extends JPanelTemplate {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelQuickInfoUser(User user) {
		
		super(new FlowLayout(), WHITE);
		
		
		final Font montserrat = new Font("Montserrat", Font.PLAIN, 13);
		
		final JLabel labelIsInContacts = new BuilderLabel.LabelBuilder()
				.text("Contact")
				.font(montserrat)
				.icon(new ImageIcon("images/location.png"))
				.build();
		
		final JLabel labelSendMessage = new BuilderLabel.LabelBuilder()
				.text("Send Message")
				.font(montserrat)
				.icon(new ImageIcon("images/chat.png"))
				.build();
		
		final JLabel labelBookmark= new BuilderLabel.LabelBuilder()
				.text("Bookmark")
				.font(montserrat)
				.icon(new ImageIcon("images/bookmark.png"))
				.build();
		
		final JLabel labelReportUser= new BuilderLabel.LabelBuilder()
				.text("Report user")
				.font(montserrat)				
				.build();
		
		
		super.add(labelIsInContacts);
		super.add(labelSendMessage);
		super.add(labelBookmark);
		super.add(labelReportUser);
		
	}

}
