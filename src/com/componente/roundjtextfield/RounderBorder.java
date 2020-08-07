package com.componente.roundjtextfield;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JTextField;

public class RounderBorder {

	public RounderBorder() {}

	@SuppressWarnings("serial")
	public final JTextField getRounderBorder(int columnas) {
		JTextField textfield = new JTextField(columnas) { 
			@Override
			protected void paintComponent(Graphics g) {
				if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
					Graphics2D g2 = (Graphics2D) g.create();
					g2.setPaint(getBackground());
					g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(0, 0, getWidth() - 1, getHeight() - 1));
					g2.dispose();
				}
				super.paintComponent(g);
			}
	
			@Override
			public void updateUI() {
				super.updateUI();
				setOpaque(false);
				setBorder(new RoundedCornerBorder());
			}
		};
		return textfield;
	}

}
