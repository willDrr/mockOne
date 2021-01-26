package app.gui.panels_info.generic;

import static java.awt.Color.WHITE;

import java.awt.LayoutManager;

import javax.swing.border.Border;

import app.gui.builder.JPanelTemplate;
import app.model.Person;

public abstract class PanelInfoGeneric <T extends Person> extends JPanelTemplate {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public PanelInfoGeneric(LayoutManager manager, T t) {  
		super(manager, WHITE);		
	}
	
	public PanelInfoGeneric(LayoutManager manager, T t, Border border) {  
		super(manager, WHITE, border);		
	}
	
	

}
