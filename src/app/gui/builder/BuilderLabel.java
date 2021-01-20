package app.gui.builder;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class BuilderLabel extends  JLabel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	public BuilderLabel(LabelBuilder labelBuilder) {
		super.setText(labelBuilder.text);
		super.setFont(labelBuilder.font);
		super.setIcon(labelBuilder.icon);
		super.setOpaque(labelBuilder.opaque);
		super.setBackground(labelBuilder.color);
		super.setForeground(labelBuilder.colorforeground);
		super.setHorizontalAlignment(labelBuilder.horizontalAligment);
		super.setBorder(labelBuilder.border);
		super.addMouseListener(labelBuilder.mouseListener);
		super.setIconTextGap(labelBuilder.iconTextGap); 
		
	}


	public static class LabelBuilder {
		
		private String text;
		private Font font;
		private ImageIcon icon;
		private boolean opaque;
		private Color color;
		private Color colorforeground;		
		private Border border;
				
		private MouseListener mouseListener;
		
		private int horizontalAligment;		
		private int iconTextGap;

		public LabelBuilder() {

		}
		

		public LabelBuilder text(String text) {
			this.text = text;
			return this;
		}
		
		public LabelBuilder font(Font font) {
			this.font = font;
			return this;
		}
		
		public LabelBuilder icon(ImageIcon icon) {
			this.icon = icon;;
			return this;
		}
		
		public LabelBuilder opaque(boolean opaque) {
			this.opaque = opaque;
			return this;
		}
		
		public LabelBuilder color(Color color) {
			this.color = color;
			return this;
		}
		
		public LabelBuilder foreground(Color colorforeground) {
			this.colorforeground = colorforeground;
			return this;
		}
		
		public LabelBuilder horizontalAligment(int horizontalAligment) {
			this.horizontalAligment = horizontalAligment;
			return this;
		}
		
		public LabelBuilder bordex(Border border) {
			this.border = border;
			return this;
		}
		
		public LabelBuilder mouseListener(MouseListener mouseListener) {
			this.mouseListener = mouseListener;
			return this;
		}
		
		public LabelBuilder iconTextGap(int iconTextGap) {
			this.iconTextGap = iconTextGap;
			return this;
		}
		
		
		public BuilderLabel build() {
			BuilderLabel label = new BuilderLabel(this);
			return label;
		}

	}
	
	
}
