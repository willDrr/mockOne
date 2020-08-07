package com.componente.header;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Header extends JPanel {

	public Header() {
		
		super(new BorderLayout());
		
		final Marca marca = new Marca();
		final Contador contador = new Contador();
		
		JPanel panel = new JPanel(new FlowLayout());
		panel.setBackground(Color.WHITE);  
		panel.add(marca);
		panel.add(contador);
		
		add(panel);
		
	}
	
	
	
}
