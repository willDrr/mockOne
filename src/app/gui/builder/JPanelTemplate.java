package app.gui.builder;

import static java.awt.Color.WHITE;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.border.Border;

public class JPanelTemplate extends JPanel {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JPanelTemplate(LayoutManager manager) {
		this(manager, WHITE);		
	}
	
	public JPanelTemplate(LayoutManager manager, Color color) {
		this(manager, color, null); 
	}
	
	public JPanelTemplate(LayoutManager manager, Color color, Border border) {
		super(manager);		
		super.setBackground(color); 
		super.setBorder(border); 
	}

}
