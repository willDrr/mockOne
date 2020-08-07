package com.componente.header;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

public class MouseAdaptador extends MouseAdapter {

	private final JLabel labelContador;
	private static final Color COLOR_LIGHT = new Color(225, 243, 255);  
	private static final Color COLOR_STRONG = new Color(242, 246, 249);  
	
	
	/**
	 * 
	 * @param labelContador
	 */
	public MouseAdaptador(JLabel labelContador) {
		this.labelContador = labelContador;
	}
	

	
	/**
	 * 
	 */
	private void incrementarNumeroDeMensajes() {
		final String actualCuenta = labelContador.getText();
		final int nuevaCuenta = 1 + Integer.parseInt(actualCuenta); 		
		labelContador.setText(nuevaCuenta + ""); 
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		super.mouseClicked(e);					
		final JLabel labelSource = (JLabel)  e.getSource();
		
		if (  labelSource == labelContador ) 
			incrementarNumeroDeMensajes();
		else 
			return;
		
	}
	

	@Override
	public void mouseEntered(MouseEvent e) {
		super.mouseEntered(e);		
		labelContador.setBackground(COLOR_STRONG);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		super.mouseExited(e);		
		labelContador.setBackground(COLOR_LIGHT);
	}
			
	
	
	@SuppressWarnings(value = "unused")  
	private final void cambiarColorLabel(Color color) {
		labelContador.setBackground(color);
	}

	@SuppressWarnings(value = "unused")  
	private final void decrecer(int num) {
		final int cuenta = Integer.parseInt(labelContador.getText()) -1 ;		
		labelContador.setText(cuenta + "");
	}

	@SuppressWarnings(value = "unused")  
	private final void inicializarCero() {
		labelContador.setText("0");
	}
	

}
