package com.componente.header;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.singletons.font.Fuente;
import com.singletons.font.Singleton;

@SuppressWarnings("serial") 
public class Contador extends JPanel {
	
		
	public Contador() {

		super(new BorderLayout());
		super.setOpaque(false);

		final Font font = Singleton.getInstance().getFondoGeneral(Fuente.POPPINS_MEDIUM).deriveFont(16f);
		final Color colorContador = new Color(225, 243, 255);
		final int cuenta = 0;

		final JLabel labelmensajes = new JLabel("Mensajes");
		labelmensajes.setFont(font);
		
		final JLabel labelFindPeople = new JLabel("Find people");
		labelFindPeople.setFont(font); 
		
		final JLabel labelMyContacts = new JLabel("My contacts");
		labelMyContacts.setFont(font);

		
		final JLabel labelIcon = new JLabel();		
		final ImageIcon icon = new ImageIcon("./icons/snapchat.png");
		labelIcon.setIcon(icon);
		
					
		final JLabel labelContador = new JLabel(cuenta + ""); 		
		//<p>Usa clase <code>MouseAdaptador</code></p> 
		final MouseAdapter mouseAdapter = new MouseAdaptador(labelContador); 
		labelContador.addMouseListener(mouseAdapter);  
		labelContador.setOpaque(true);
		labelContador.setBorder(new EmptyBorder(5, 10, 5, 10));  
		labelContador.setBackground(colorContador);
		labelContador.setFont(font);
			

		
		final JPanel containerLableContador = new JPanel(new BorderLayout(10, 10)); 	
		containerLableContador.setOpaque(false);
		containerLableContador.add(labelmensajes, BorderLayout.CENTER);
		containerLableContador.add(labelContador, BorderLayout.EAST);
		
		final LayoutManager flow = new FlowLayout(FlowLayout.LEFT, 20, 30);
		final JPanel panelcontainer_ = new JPanel(flow); 
		panelcontainer_.setOpaque(false); 
		panelcontainer_.add(labelFindPeople);
		panelcontainer_.add(containerLableContador);
		panelcontainer_.add(labelMyContacts);
		panelcontainer_.add(labelIcon); 
		
		
		add(panelcontainer_, BorderLayout.CENTER);

	}

	

}
