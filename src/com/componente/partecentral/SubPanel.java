package com.componente.partecentral;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.singletons.font.Fuente;
import com.singletons.font.Singleton;

@SuppressWarnings("serial")
public class SubPanel extends JPanel {

	public SubPanel() {
		
		super(new BorderLayout());		
		
		final Tabbed tabbed = new Tabbed();
		final JPanel subPanelDos = new SubPanelDos();		
		
		final JPanel panelcontainerTabbed = new JPanel(new FlowLayout(JLabel.TRAILING));  
		panelcontainerTabbed.add(tabbed);
		
		add(subPanelDos, BorderLayout.CENTER);
		add(panelcontainerTabbed, BorderLayout.SOUTH); 
		
	}

	private class Tabbed extends JPanel {

		//	javax.swing.UIManager.put("TabbedPane.contentBorderInsets", new Insets(0, 0, 0, 0));
		
		public Tabbed() {
			
			//	super(new GridLayout(1, 1)); // this makes the layout take the complete view
			 

			final String[] PATHS = new String[] {"./icons/timeline-eye.png", "./icons/about.png"};  			
			final Font font = Singleton.getInstance().getFondoGeneral(Fuente.POPPINS_REGULAR).deriveFont(12f);						
			final Color twitter = new Color(33, 150, 243);

			final JTabbedPane tabbedPane = new JTabbedPane();
			tabbedPane.setFont(font);   
			tabbedPane.setBorder(BorderFactory.createMatteBorder(0, 0, 10, 0, twitter));  
			
			
			final ImageIcon iconTimeline = new ImageIcon(PATHS[1]);    
			final ImageIcon iconAbout = new ImageIcon(PATHS[0]);  
			
			final JPanel panelToAdd = new SubPanell();
			final JComponent panel1 = makeTextPanel("Timeline");
			panel1.add(panelToAdd);
			tabbedPane.addTab("Timeline", iconTimeline, panel1, "Timeline");			
			tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

			final JComponent panel2 = makeTextPanel("About");			 
			tabbedPane.addTab("About", iconAbout, panel2, "About");
			tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);


			add(tabbedPane);

			tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
			
		}

		protected JComponent makeTextPanel(String text) {
			
			final JPanel panel = new JPanel(false);
			
			
			return panel;
			
		}
		
		@SuppressWarnings("unused") 
		protected JComponent makeTextPanelFiller(String text) {
			
			final JPanel panel = new JPanel(false);
			final JLabel filler = new JLabel(text);
			
			filler.setHorizontalAlignment(JLabel.CENTER);
			panel.setLayout(new GridLayout(1, 1));
			panel.add(filler);
			
			return panel;
			
		}
		
		
		private class SubPanell extends JPanel {
			
			public SubPanell() {
				
				super(new BorderLayout());
				super.setOpaque(false);  
				
				// both panels use this grid
				final LayoutManager gridlayout = new GridLayout(0, 2, 10, 10);
								
				
				// panel who manage contact information labels
				final String[] contactInfo = new String[] {"+1 234 567 8900", "La Fortuna", "willxdd97@gmail.com", "www.sitecom.dot"}; 
				final String[] contactInformation = new String[] {"Phone", "Adress", "E-mail", "Site"};				
				final JLabel[] labelsInformation = new JLabel[ contactInformation.length ];
				final Border titledInfo = getTitledBorder("Contact Information");
				final JPanel panelInfo = new JPanel(gridlayout);
				panelInfo.setOpaque(false);  
				panelInfo.setBorder(titledInfo);    				
				fillInfo(contactInformation, contactInfo ,labelsInformation, panelInfo);
				
								
				// panel who manage basic information labels 
				final String[] extraInfo = new String[] {"17/06/1997", "Male"};  
				final String[] extra = new String[] {"Birthday", "Gender"};
				final JLabel[] labelsExtra = new JLabel[extra.length];
				final Border titledExtra = getTitledBorder("Basic information"); 
				final JPanel panelExtra = new JPanel(gridlayout);		
				panelExtra.setOpaque(false); 
				panelExtra.setBorder(titledExtra); 
				fillInfo(extra, extraInfo, labelsExtra, panelExtra); 

				
				// this panel handle both panel, it is the container
				final Border emptyBorder = new EmptyBorder(10, 10, 10, 10);
				final JPanel panelContainerInformation = new JPanel(new BorderLayout(10, 10)); // pad between panels
				panelContainerInformation.setOpaque(false); 
				panelContainerInformation.setBorder(emptyBorder);				
				panelContainerInformation.add(panelInfo, BorderLayout.CENTER);
				panelContainerInformation.add(panelExtra, BorderLayout.SOUTH); 
				
				
				add(panelContainerInformation);
				
			}


			private final Border getTitledBorder(String title) {
				final Font fontRegular = Singleton.getInstance().getFondoGeneral(Fuente.POPPINS_REGULAR).deriveFont(12f);
				final TitledBorder titled = new TitledBorder(title);
				titled.setTitleFont(fontRegular); 
				return titled;
			}
			
			/**
			 * 
			 * @param info
			 * @param mock
			 * @param labels
			 * @param panel
			 */
			private final void fillInfo(String[] info, String[] mock ,JLabel[] labels, JPanel panel) {
				
				final Font fontRegular = Singleton.getInstance().getFondoGeneral(Fuente.POPPINS_REGULAR).deriveFont(14f); 						
				final Font fontBold = Singleton.getInstance().getFondoGeneral(Fuente.POPPINS_SEMIBOLD).deriveFont(14f); 						
				for (int i = 0; i < labels.length; i++) {
					
					final String placeholder = info[i];
					final String infoHolder = mock[i];
					final JLabel labelPlaceholder = new JLabel(placeholder);
					labelPlaceholder.setFont(fontRegular); 
					final JLabel labelInfo = new JLabel(infoHolder);
					labelInfo.setFont(fontBold); 
					
					labels[i] = labelPlaceholder;
					
					
					panel.add(labels[i]);
					panel.add(labelInfo); 
					
				}
			}						
		}	
	}
}
