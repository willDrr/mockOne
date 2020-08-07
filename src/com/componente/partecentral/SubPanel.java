package com.componente.partecentral;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import com.singletons.font.Fuente;
import com.singletons.font.Singleton;

@SuppressWarnings("serial")
public class SubPanel extends JPanel {

	public SubPanel() {
		
		super(new BorderLayout());
		
		final Tabbed tabbed = new Tabbed();
		
		add(tabbed);
		
	}

	private class Tabbed extends JPanel {

		public Tabbed() {
			
			super(new GridLayout(1, 1));

			final String[] PATHS = new String[] {"./icons/timeline-eye.png", "./icons/about.png"};  
			
			final Font font = Singleton.getInstance().getFondoGeneral(Fuente.POPPINS_REGULAR).deriveFont(12f);
			final Color colorBlack = Color.BLACK;
			final JTabbedPane tabbedPane = new JTabbedPane();
			tabbedPane.setFont(font); 
			tabbedPane.setBorder(BorderFactory.createMatteBorder(0, 0, 10, 0, colorBlack));  
			
//			javax.swing.UIManager.put("TabbedPane.contentBorderInsets", new Insets(0, 0, 0, 0));
			
			final ImageIcon iconTimeline = new ImageIcon(PATHS[1]);    
			final ImageIcon iconAbout = new ImageIcon(PATHS[0]);  

			final JComponent panel1 = makeTextPanel("Timeline");			
			tabbedPane.addTab("Timeline", iconTimeline, panel1, "Timeline");			
			tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

			final JComponent panel2 = makeTextPanel("About");
			tabbedPane.addTab("About", iconAbout, panel2, "About");
			tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);


			add(tabbedPane);

			// The following line enables to use scrolling tabs.
			tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
			
		}

		protected JComponent makeTextPanel(String text) {
			
			final JPanel panel = new JPanel(false);
			final JLabel filler = new JLabel(text);
			
			filler.setHorizontalAlignment(JLabel.CENTER);
			panel.setLayout(new GridLayout(1, 1));
			panel.add(filler);
			
			return panel;
			
		}

	}

}
