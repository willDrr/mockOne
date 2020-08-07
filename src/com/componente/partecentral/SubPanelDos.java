package com.componente.partecentral;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SubPanelDos extends JPanel {

	public SubPanelDos() {
		
		super(new BorderLayout());
		
		final JPanel panel = new PanelDos();
		
		add(panel);
		
	}
	
	private class PanelDos extends JPanel implements ActionListener {
		
		public PanelDos() {
			
			super(new BorderLayout());
			
			final JButton hello =new JButton("HELLO");						
			hello.addActionListener(this); 
			hello.setActionCommand("h"); 
			
			
			final JPanel panelcontainer = new JPanel(new FlowLayout());
			panelcontainer.add(hello);
			
			
			add(panelcontainer);
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			final char a = e.getActionCommand().charAt(0);
			if (  'h' == a ) { 
				JOptionPane.showMessageDialog(this, "Hello world" );  
			}
		}
		
	}
	
}
