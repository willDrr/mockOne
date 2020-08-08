package com.componente.header;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.componente.roundjtextfield.RounderBorder;
import com.singletons.font.Fuente;
import com.singletons.font.Singleton;

@SuppressWarnings("serial")
public class Marca extends JPanel {
	
	private static final String[] path = new String[] {"./icons/github.png"}; 
	
	public Marca() {
		
		super(new BorderLayout());
		super.setOpaque(false);
		
		final Font font = Singleton.getInstance().getFondoGeneral(Fuente.POPPINS_MEDIUM).deriveFont(16f); 
		final JLabel labelMarca = new JLabel("OktaDeveloper");
		labelMarca.setFont(font);
		
		final ImageIcon imageIcon = new ImageIcon(path[0]); 
		final JLabel labelIcon = new JLabel();
		labelIcon.setIcon(imageIcon); 
		
		final JPanel panelMarca = new JPanel(new BorderLayout(10, 10));
		panelMarca.setOpaque(false); 
		panelMarca.add(labelIcon, BorderLayout.CENTER);
		panelMarca.add(labelMarca, BorderLayout.EAST); 
		
		
		final JTextField textField = new RounderBorder().getRounderBorder(20);
		 
		
		final FlowLayout flow = new FlowLayout(FlowLayout.LEFT, 20, 0);
		final JPanel subPanelContainer = new JPanel(flow);		 
		subPanelContainer.setOpaque(false);  
		subPanelContainer.add(panelMarca);
		subPanelContainer.add(textField);
		
		final JPanel panelcontainer = new JPanel();
		panelcontainer.setOpaque(false); 
		panelcontainer.add(subPanelContainer);
		
		add(panelcontainer);
		
	}
	

}
