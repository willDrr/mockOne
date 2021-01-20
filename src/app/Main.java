package app;

import javax.swing.SwingUtilities;

import app.gui.mainpanel.MainFrame;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(MainFrame::init); 
	}
	
}
