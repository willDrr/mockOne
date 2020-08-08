package com.componente.partecentral;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelMain extends JPanel {

	private final CardLayout cardLayout;
	private final JPanel cardpanel;
	
	public PanelMain() {
		
		super(new BorderLayout());
		
		cardLayout = new CardLayout();
		cardpanel = new JPanel(cardLayout);
		

		final JPanel panelDos = new SubPanel();		
		final JPanel panelInicial = new JPanel(new GridLayout(0, 1, 10, 10));
		panelInicial.add(panelDos);
		
		cardpanel.add(panelInicial, "main");
		
		
		add(cardpanel, BorderLayout.CENTER);
		
		
	}
	
	
	
	
}
