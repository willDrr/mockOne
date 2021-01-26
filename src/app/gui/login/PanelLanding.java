package app.gui.login;

import static java.awt.Color.WHITE;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JLabel;
import javax.swing.JPanel;

import app.gui.builder.BuilderLabel;
import app.gui.builder.BuilderPanel;
import app.gui.builder.JPanelTemplate;

public class PanelLanding extends JPanelTemplate {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final LayoutManager MANAGER = new GridLayout(1, 0);
	
	private static final Font font = new Font("Montserrat", Font.BOLD, 30);
	private static final Color COLOR_TWILIO = new Color(242, 47, 70);
	
	
	public PanelLanding(PanelToggle panelToggle) {
		
		super(MANAGER, WHITE);
		
		final JLabel label = new BuilderLabel.LabelBuilder()
				.text("<html>Manage and storage<br> your CV'S")
				.font(font)
				.opaque(true)
				.foreground(COLOR_TWILIO) 
				.build();
		
		final JPanel panelLabelLanding = new BuilderPanel.PanelBuilder(new GridLayout(1, 1))
				.addComponent(label)
				.build();
		
		
		
		
		
		super.add(panelLabelLanding);
		super.add(panelToggle);
		
	}

}
