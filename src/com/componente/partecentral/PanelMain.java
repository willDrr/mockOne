package com.componente.partecentral;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelMain extends JPanel {

	private final CardLayout cardLayout;
	private final JPanel cardpanel;
	
	public PanelMain() {
		
		super(new BorderLayout());
		
		cardLayout = new CardLayout();
		cardpanel = new JPanel(cardLayout);
		
		
		final Flag flag = new Flag();
		final Other other = new Other();
		final JPanel panelDos = new SubPanel();
		final JPanel panelUno = new SubPanelDos();
		
		final JPanel panelInicial = new JPanel(new GridLayout(0, 1, 10, 10));
		panelInicial.add(panelUno);
		panelInicial.add(panelDos);
		
		cardpanel.add(panelInicial, "main");
		cardpanel.add(other, "other");  
		
		
		add(cardpanel, BorderLayout.CENTER);
		add(flag, BorderLayout.NORTH);
		
	}
	
	private class Other extends JPanel implements ActionListener {
		
		public Other() {
			
			super(new BorderLayout());
			
			final JButton hello = new JButton("im am other");
			hello.setActionCommand("h"); 
			hello.addActionListener(this); 
			
			final JPanel panelcontainer = new JPanel(new FlowLayout()); 
			panelcontainer.add(hello);
			
			add(panelcontainer);
			
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			final char command = e.getActionCommand().charAt(0);
			
			if ( 'h' == command )
				JOptionPane.showMessageDialog(this, "IM AM OTHER");
			
		}
		
	}
	
	private class Flag extends JPanel implements ActionListener {
		
		
		public Flag() {
			
			super(new BorderLayout());
			
			
			final JButton buttonchange = new JButton("Siguiente");
			buttonchange.addActionListener(this); 
			buttonchange.setActionCommand("s"); 
			
			final JPanel panelcontainer = new JPanel(new FlowLayout());
			panelcontainer.add(buttonchange);
			
			add(panelcontainer);
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {			
			
			final char action = e.getActionCommand().charAt(0);
			
			if ( 's' == action )  
				cardLayout.next(cardpanel);  
			
		}
	}

}
