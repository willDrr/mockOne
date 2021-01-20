package app.gui.builder;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;


public class BuilderButton extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public BuilderButton(ButtonBuilder buttonBuilder) {
		super.setText(buttonBuilder.text);
		super.setFont(buttonBuilder.font);
		super.setIcon(buttonBuilder.icon);
		super.setActionCommand(buttonBuilder.actioncommand);
		super.addActionListener(buttonBuilder.actionListener);
		super.setBorder(buttonBuilder.border);
	}

	

	public static class ButtonBuilder {
		private String text;
		private Font font;
		private ImageIcon icon;
		private String actioncommand;
		private ActionListener actionListener;

		private Border border;

		public ButtonBuilder text(String text) {
			this.text = text;
			return this;
		}

		public ButtonBuilder font(Font font) {
			this.font = font;
			return this;
		}

		public ButtonBuilder icon(ImageIcon icon) {
			this.icon = icon;
			return this;
		}

		public ButtonBuilder actioncommand(String actioncommand) {
			this.actioncommand = actioncommand;
			return this;
		}
		
		public ButtonBuilder actionListener(ActionListener actionListener) {
			this.actionListener = actionListener;
			return this;
		}
		
		public ButtonBuilder bordex(Border border) {
			this.border = border;
			return this;
		}
		
		

		public BuilderButton build() {
			BuilderButton button = new BuilderButton(this);
			return button;
		}

	}

}
