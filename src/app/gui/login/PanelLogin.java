package app.gui.login;

import static java.awt.Color.WHITE;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import app.gui.builder.BuilderButton;
import app.gui.builder.BuilderLabel;
import app.gui.builder.BuilderTextField;
import app.gui.builder.JPanelTemplate;
import app.gui.mainpanel.SubPanelToggle;
import app.model.User;

public final class PanelLogin  extends JPanelTemplate {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private static final int insetExtremes = 50;
	private static final int insetSides = 100;
	private static final int rows = 0;
	private static final int columns = 1;
	
	private static final int gap = 10;
	
	private static final Border border = new EmptyBorder(insetExtremes, insetSides, insetExtremes, insetSides);
	private static final LayoutManager layoutManager = new GridLayout(rows, columns, gap, gap);
	
	private static final Color COLOR_TWILIO = new Color(242, 47, 70);
	
	public PanelLogin( User user, PanelToggle panelToggle, SubPanelToggle subPanelToggle) { 
		
		super(layoutManager, COLOR_TWILIO, border);
		
		
		final Font montserrat = new Font("Montserrat", Font.BOLD, 16);
		
		final JLabel labelEmail = new BuilderLabel.LabelBuilder()
				.text("Email")
				.foreground(WHITE)
				.font(montserrat)
				.opaque(true)
				.build();
		
		final JTextField textFieldEmail = new BuilderTextField.TextFieldBuilder()
				.columns(20)
				.build();
		
		final JLabel labelPassword = new BuilderLabel.LabelBuilder()
				.text("Password")
				.foreground(WHITE) 
				.font(montserrat)
				.opaque(true)
				.build();
		
		final JTextField textFieldPassword = new BuilderTextField.TextFieldBuilder()
				.columns(20)
				.build();
		
		final JButton buttonLogIn = new BuilderButton.ButtonBuilder()
				.text("Log in")
				.font(montserrat)
				.actioncommand("login")
				.actionListener(e -> {					
					SubPanelToggle.cardlayout.show(subPanelToggle, "panel_landing");
				})
				.build();
		
		
		final MouseListener mouseAdapter = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {			
				super.mouseClicked(e);
				
				final JLabel label = (JLabel)e.getSource();
				
				if (label.getText().equals("Not registered? Register!")) {
					PanelToggle.card.show(panelToggle, "panelregister");
				} 
				
			}
		};
		
		
		final JLabel labelNotRegistered = new BuilderLabel.LabelBuilder()
				.text("Not registered? Register!")
				.font(montserrat)
				.opaque(true)
				.foreground(WHITE)
				.mouseListener(mouseAdapter)
				.build();
				
		
		super.add(labelEmail);
		super.add(textFieldEmail);
		
		
		super.add(labelPassword);
		super.add(textFieldPassword);
		
		super.add(buttonLogIn);
		super.add(labelNotRegistered); 
		
	}
	
}
