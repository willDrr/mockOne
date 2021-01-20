package app.gui.builder;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class BuilderPanel  extends JPanel {

	
	private Map<JComponent, Object> componentExternalClass;  
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BuilderPanel(PanelBuilder builder) {
		super.setLayout(builder.manager);
		super.setBackground(builder.color);
		super.setFont(builder.font);
		super.setOpaque(builder.opaque);
		super.setBorder(builder.bordex);  
		
		componentExternalClass = builder.componentsBuilder;
		
		for (Map.Entry<JComponent, Object> entry : componentExternalClass.entrySet()) {
		    final JComponent container = entry.getKey();
		    final Object contrains = entry.getValue();
		    super.add(container, contrains);
		}
		
	}
	
	public static class PanelBuilder extends JPanel {
		
		private final LayoutManager manager;
		private Color color;
		private Font font;	
		private Border bordex;
		private boolean opaque;
		
		private Map<JComponent, Object> componentsBuilder = new LinkedHashMap<>();  
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		public PanelBuilder(LayoutManager manager) { 
			this.manager = manager;
		}
				
		public PanelBuilder color(Color color) {
			this.color = color; 
			return this;
		}
		
		public PanelBuilder font(Font font) {
			this.font = font; 
			return this;
		}
		
		public PanelBuilder opaque(boolean opaque) {
			this.opaque = opaque;
			return this;
		}
		
		public PanelBuilder addContainer(JComponent container, Object object) {
			componentsBuilder.put(container, object);
			return this;
		}
		
		public PanelBuilder addContainer(JComponent container) {
			componentsBuilder.put(container, null); 
			return this;
		}
		
		public PanelBuilder addBordex(Border bordex) {
			this.bordex = bordex;
			return this;
		}
		
		public PanelBuilder addComponent(JComponent component) {
			componentsBuilder.put(component, null);
			return this;
		}
				
		public BuilderPanel build() {
			return new BuilderPanel(this); 
		}

	}


}