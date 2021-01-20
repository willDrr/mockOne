package app.gui.panels_info.central_part.panel_tabs;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import app.gui.builder.BuilderLabel;
import app.gui.builder.JPanelTemplate;

public class PanelTabCardController extends JPanelTemplate {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelTabCardController() {
		
		super(new FlowLayout(FlowLayout.LEADING));
		
		final Font montserrat = new Font("Montserrat", Font.PLAIN, 15);
		
		final MouseListener mouseListener = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {			
				super.mouseClicked(e);

				final JLabel label = (JLabel)e.getSource();
				
				if ( label.getText().equals("About") ) {
					System.out.println("ABOUT");
				} else if (label.getText().equals("Timeline")) {
					System.out.println("TIMELINE");
				} else {
					System.out.println("LOST");
				}
					
			}
		};
		
		final Color COLOR_TWILIO = new Color(241, 46, 69);
		
		final JLabel buttonAbout = new BuilderLabel.LabelBuilder()
				.text("About")
				.icon(new ImageIcon("images/about.png"))
				.font(montserrat)				
				.bordex(BorderFactory.createMatteBorder(0, 0, 5, 0, COLOR_TWILIO)) 
				.mouseListener(mouseListener)
				.build();
		
		final JLabel buttonTimeline = new BuilderLabel.LabelBuilder()
				.text("Timeline")
				.icon(new ImageIcon("images/timeline-eye.png"))  
				.font(montserrat)
				.bordex(BorderFactory.createMatteBorder(0, 0, 5, 0, COLOR_TWILIO))  
				.mouseListener(mouseListener) 
				.build();
		
		
		
		super.add(buttonAbout);
		super.add(buttonTimeline);
		
	}

}
