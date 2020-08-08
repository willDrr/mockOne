package com.componente.partecentral;

import java.awt.BorderLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SubPanelDos extends JPanel {

	public SubPanelDos() {
		
		super(new BorderLayout());
		
		
		final JPanel container = new PanelDos();
		
		
		add(container); 
		
	}
	
	private class PanelDos extends JPanel  {
		
		public PanelDos() {
			
			super(new BorderLayout());
			
						
			
		}
		
		
	}
	
}
