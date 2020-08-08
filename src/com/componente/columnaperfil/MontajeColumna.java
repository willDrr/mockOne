package com.componente.columnaperfil;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.singletons.font.Fuente;
import com.singletons.font.Singleton;

@SuppressWarnings("serial")
public class MontajeColumna extends JPanel {

	public MontajeColumna() {
		
		super(new BorderLayout());
		super.setBackground(Color.WHITE); 
		
		
		final ImagenPerfil imagenPerfil = new ImagenPerfil();
		final Informacion informacion = new Informacion();		
		
		//TODO:: arreglar luego 
		final JPanel container = new JPanel(new BorderLayout(10, 10));		
		container.setBackground(Color.WHITE);		
		container.add(imagenPerfil, BorderLayout.NORTH);
		container.add(informacion, BorderLayout.CENTER);
		
		add(container);
		
	}
	
	private class ImagenPerfil extends JPanel {
		
		
		public ImagenPerfil() {
			
			super(new BorderLayout());	
			
			final String path = "./icons/github-big.png"; 
			final ImageIcon icon = new ImageIcon(path);
			
			final JLabel labelcontainer = new JLabel();
			labelcontainer.setIcon(icon);
								
			final JPanel container = new JPanel();
			container.setBackground(Color.WHITE); // this makes the panel logo white   
			container.add(labelcontainer);
			
			add(container);
			
		}
		
	}
	
	private class Informacion extends JPanel {
		
		public Informacion() {
			
			super(new BorderLayout());
			super.setBackground(Color.WHITE);

			
			final Color colorgray = new Color(195, 195, 195);			
			final Font font = Singleton.getInstance().getFondoGeneral(Fuente.POPPINS_MEDIUM).deriveFont(12f); 
			
			
			final TitledBorder titledWork = getTitledBorder("Work", font, colorgray); 						
			final TitledBorder titledSkills = getTitledBorder("Skills", font, colorgray);
			final String[] skills = new String[] {"Java", "Python", "JavaScript", "Scala", "Haskell"};
				
			
			final JPanel panelcontainerWorks = new JPanel(new GridLayout(2, 0, 10, 10));				
			panelcontainerWorks.setOpaque(false); 
			panelcontainerWorks.setBorder(titledWork);
			
			final JPanel panelWorkOne = panelWork(font);
			final JPanel panelWorkTwo = panelWork(font);
			
			panelcontainerWorks.add(panelWorkOne);
			panelcontainerWorks.add(panelWorkTwo);
			
			final JPanel panelContainerSkills = new JPanel(new BorderLayout()); 			
			panelContainerSkills.setOpaque(false);
			
			final JPanel panelSkills = panelSkills(skills, font); 			
			panelSkills.setBorder(titledSkills);
			
			panelContainerSkills.add(panelSkills);
						
			
			final JPanel container = new JPanel(new BorderLayout());
			container.setBorder(new EmptyBorder(0, 10, 0, 10));   
			container.setOpaque(false);   
			container.add(panelcontainerWorks, BorderLayout.CENTER);
			container.add(panelContainerSkills, BorderLayout.SOUTH);  
			
			add(container);
			
		}
		
		
		/**
		 * 
		 * @param texto
		 * @param font
		 * @param color
		 * @return
		 */
		private final TitledBorder getTitledBorder(String texto, Font font, Color color) {
			final TitledBorder titledSkills = new TitledBorder(texto); 
			titledSkills.setTitleFont(font);
			titledSkills.setTitleColor(color);
			return titledSkills;
		}
		
		
		/**
		 * 
		 * @param font
		 * @return
		 */
		private final JPanel panelWork(Font font) {
			
			final JPanel panel = new JPanel(new GridLayout(0, 1, 10, 10)); 			
			panel.setOpaque(false);  
			panel.setBorder(new EmptyBorder(0, 10, 5, 10));  
			
			final Font fuenteTitulo = Singleton.getInstance().getFondoGeneral(Fuente.POPPINS_SEMIBOLD).deriveFont(14f);  
			
			final JLabel labelTituloTrabajo = new JLabel("Spotify New York");
			labelTituloTrabajo.setBorder(new EmptyBorder(30, 0, 20, 0)); 
			labelTituloTrabajo.setFont(fuenteTitulo); 
			
			final JLabel labelCalle = new JLabel("170 Willian Street");
			labelCalle.setFont(font);			
			
			final String latin = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean eu nulla urna.";		    
		    final String htmlBody = "<html><body style='width: %1spx'>%1s"; 
		    final String str = String.format(htmlBody, 200, latin); // tamano arreglado a 200px  
			final JLabel labelEstado = new JLabel(str);
			labelEstado.setFont(font); 

			panel.add(labelTituloTrabajo);
			panel.add(labelCalle);
			panel.add(labelEstado);
			
									
			return panel;
			
		}
		
		
		/**
		 * 
		 * @param skills
		 * @param font
		 * @return
		 */
		private final JPanel panelSkills(String[] skills, Font font) {
			
			final JLabel[] labels = new JLabel[skills.length];
			final Border empty = new EmptyBorder(0, 10, 5, 10);
			final JPanel panel = new JPanel(new GridLayout(0, 1, 10, 10));			
			panel.setOpaque(false);   
			
			for (int i = 0; i < skills.length; i++) {
				 labels[i] = new JLabel(skills[i]);
				 labels[i].setBorder(empty);
				 labels[i].setFont(font); 
				 
				 panel.add(labels[i]);  
			}
			
			return panel;
					
		}		
	}
}
