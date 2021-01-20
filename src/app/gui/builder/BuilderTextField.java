package app.gui.builder;

import java.awt.Font;

import javax.swing.JTextField;

public class BuilderTextField extends JTextField {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BuilderTextField(TextFieldBuilder textFieldBuilder) {
		super.setColumns(textFieldBuilder.columns); 
		super.setText(textFieldBuilder.text);
		super.setFont(textFieldBuilder.font);  
	}
	
	public static class TextFieldBuilder {
		
		private int columns;
		
		private String text;
		private Font font;
		

		public TextFieldBuilder text(String text) {
			this.text = text;
			return this;
		}

		public TextFieldBuilder font(Font font) {
			this.font = font;
			return this;
		}

		public TextFieldBuilder columns(int columns) {
			this.columns = columns;
			return this;
		}
		

		public BuilderTextField build() {
			BuilderTextField textfield = new BuilderTextField(this);
			return textfield;
		}

	}

}
