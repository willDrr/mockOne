package app.gui.header;

import static java.awt.Color.WHITE;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import app.gui.builder.BuilderLabel;
import app.gui.builder.BuilderPanel;
import app.gui.builder.BuilderTextField;
import app.gui.builder.JPanelTemplate;
import app.gui.mainpanel.SubPanelToggle;

public class Header extends JPanelTemplate {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final LayoutManager MANAGER;
	private static final Color COLOR_TWILIO; 
	private static final Border BORDER;
	static {
		final int inset = 30;
		final int rows = 1 ;
		final int columns = 0;
		
		MANAGER = new GridLayout(rows, columns);
		COLOR_TWILIO = new Color(242, 47, 70);		
		BORDER = new EmptyBorder(inset, inset, inset, inset);
	}
	
	public Header(SubPanelToggle subPanelToggle) {
		
		super(MANAGER, COLOR_TWILIO, BORDER); 
		
		final Font fontMontserratLight = new Font("Montserrat", Font.PLAIN, 20); 
		final Font fontMontserratBold = new Font("Montserrat", Font.BOLD, 20);
		final Font fontMontserratExtraBold = new Font("Montserrat", Font.BOLD, 30);
		
		final String linkToLogo = "images/github.png";
		
		
		// components for the first panel 
		final JLabel labelLogo = new BuilderLabel.LabelBuilder()
				.text(Labels.Redliw.text())
				.iconTextGap(30) 
				.font(fontMontserratExtraBold)
				.foreground(WHITE)
				.icon(new ImageIcon(linkToLogo))
				.build();
		
		
		final JTextField fieldSearch = new BuilderTextField.TextFieldBuilder()
				.columns(15)
				.text(Labels.Search.text())							
				.font(fontMontserratLight)
				.build(); 
		
		
		final JPanel panelLogoAndSearch = new BuilderPanel.PanelBuilder(new FlowLayout(FlowLayout.CENTER, 30, 0))				
				.addComponent(labelLogo)
				.addComponent(fieldSearch)
				.build();		
		
		
		// components for the second panel
		
		final MouseListener mouseAdapter = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {			
				super.mouseClicked(e);
				
				JLabel label = (JLabel) e.getSource();
				
				if ( label.getText().equals(Labels.Find_people.text())) { 
					SubPanelToggle.cardlayout.show(subPanelToggle, "panel_landing");  
				}
				
			}
		};
		
		final JLabel labelFindPeople = new BuilderLabel.LabelBuilder()
				.text(Labels.Find_people.text())
				.foreground(WHITE)
				.font(fontMontserratBold)
				.mouseListener(mouseAdapter)
				.build();

		final JLabel labelMessages = new BuilderLabel.LabelBuilder()
				.text(Labels.Messages.text())
				.foreground(WHITE)
				.font(fontMontserratBold)
				.build();
		
		final JLabel labelMyContacts = new BuilderLabel.LabelBuilder()
				.text(Labels.My_Contacts.text())
				.foreground(WHITE)
				.font(fontMontserratBold)
				.build();
				
		final JLabel labelLogIcon = new BuilderLabel.LabelBuilder()
				.icon(new ImageIcon(linkToLogo))
				.build();
		

		final JPanel panelHeaderActions = new BuilderPanel.PanelBuilder(new FlowLayout(FlowLayout.CENTER, 30, 0))
				.addComponent(labelFindPeople)
				.addComponent(labelMessages)
				.addComponent(labelMyContacts)
				.addComponent(labelLogIcon)
				.build();
		
		
		
		super.add(panelLogoAndSearch);
		super.add(panelHeaderActions);
		
		
	}
	
	
	private enum Labels { 
		
		Redliw("REDLIW"), Search("Search"), Find_people("Find people"), Messages("Messages"), My_Contacts("My contacts");
		
		private String text;
		
		private Labels(String text) { this.text = text; }
		
		private String text() { return text; }
		
	}

}
