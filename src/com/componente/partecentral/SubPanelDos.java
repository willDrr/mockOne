package com.componente.partecentral;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import com.singletons.font.Fuente;
import com.singletons.font.Singleton;

@SuppressWarnings("serial")
public class SubPanelDos extends JPanel {

	public SubPanelDos() {
		
		super(new BorderLayout());
		
		
		final JPanel container = new PanelDos();
		
		
		add(container); 
		
	}
	
	private class PanelDos extends JPanel  {
		
		public PanelDos() {
			
			super(new BorderLayout());
			
			final LayoutManager flowLayout = new FlowLayout(FlowLayout.LEADING, 30, 0);   
			final float SIZE_FONT = 14F; 
			final Font fontBold = Singleton.getInstance().getFondoGeneral(Fuente.POPPINS_SEMIBOLD).deriveFont(SIZE_FONT);
			final Font fontNormal = Singleton.getInstance().getFondoGeneral(Fuente.POPPINS_REGULAR).deriveFont(SIZE_FONT); 
			
			final JPanel panelPrimeraFila = new JPanel(flowLayout);
			primerFila(panelPrimeraFila, fontNormal);
			
			final JPanel panelSegundaFila = new JPanel(flowLayout);
			segundaFila(panelSegundaFila, fontBold, fontNormal);
			
			final JPanel panelTercerFila = new JPanel(flowLayout);
			terceFila(panelTercerFila, fontBold, fontNormal); 
			
			
			final GridLayout grid = new GridLayout(0, 1, 10, 10);
			final Border empty = new EmptyBorder(20, 0, 0, 0);
			final JPanel panelcontainer = new JPanel(grid);
			panelcontainer.setBorder(empty);  
			panelcontainer.add(panelPrimeraFila);
			panelcontainer.add(panelSegundaFila);
			panelcontainer.add(panelTercerFila);
			
			add(panelcontainer);

		}
		
		
		private final void primerFila(JPanel panel, Font font) {
			
			final JLabel labelNombre = new JLabel("Jeremy Rose");
			labelNombre.setFont(font); 
						
			final String path = "./icons/location.jpg";
			final ImageIcon iconLocation = getIconStart(path);			
			final JLabel labelLocation = new JLabel();
			labelLocation.setFont(font); 
			labelLocation.setIcon(iconLocation);
			labelLocation.setText("New York");
			
			final String pathBook = "./icons/bookmark.png";
			final ImageIcon iconBookmark = getIconStart(pathBook);
			final JLabel labelBookmark = new JLabel();
			labelBookmark.setFont(font); 
			labelBookmark.setIcon(iconBookmark);
			labelBookmark.setText("Bookmark"); 
			
			final JLabel labelRole = new JLabel("Product designer");
			labelRole.setFont(font); 
			
			
			panel.add(labelNombre);
			panel.add(labelLocation);
			panel.add(labelBookmark);
			panel.add(labelRole);
			
		}
		
				
		private final void segundaFila(JPanel panel, Font fontBold, Font font) {
			
			final JLabel labelRating = new JLabel("Rating");
			labelRating.setFont(font); 
			

			final JLabel labelCalification = new JLabel("8.5");
			labelCalification.setFont(fontBold);
			
			final JPanel panelEstrellas = panelEstrellas(4);
			
			
			panel.add(labelRating);
			panel.add(labelCalification);
			panel.add(panelEstrellas);
			
			
		}
		
		
		private final JPanel panelEstrellas(int numeroEstrellas) {
			final LayoutManager flow = new FlowLayout(FlowLayout.TRAILING, 10, 10); 
			final JPanel panel = new JPanel(flow);
			final JLabel[] labelStarts= new JLabel[numeroEstrellas];
			final String path = "./icons/star.png";
			for (int i = 0; i < labelStarts.length; i++) {
				ImageIcon estrella = getIconStart(path);				 
				labelStarts[i] = new JLabel(estrella);
				panel.add(labelStarts[i]);  
			}
			
			
			return panel;
			
		}
		
		
		private final ImageIcon getIconStart(final String path) {
			
			final ImageIcon icon = new ImageIcon(path);
			
			return icon;
			
		}
		
		
		private final void terceFila(JPanel panel, Font fontBold, Font font) {
			

			final String url = "./icons/chat.png";
			final ImageIcon iconMessage = new ImageIcon(url);
			final JLabel labelSendMessage = new JLabel();
			labelSendMessage.setIcon(iconMessage); 
			labelSendMessage.setText("Send message"); 
			labelSendMessage.setFont(fontBold); 
			
			final JLabel labelContacts = new JLabel("X Contacts");
			labelContacts.setFont(fontBold); 
			labelContacts.setOpaque(true);
			labelContacts.setBackground(Color.YELLOW);
			
			final JLabel labelReport = new JLabel("Report user");
			labelReport.setFont(font);
			
			
			panel.add(labelSendMessage);
			panel.add(labelContacts);
			panel.add(labelReport);
			
		}
		
		
	}
	
}
