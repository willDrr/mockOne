package app.fonts;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class Singleton {

	private static Singleton singleton;

	/**
	 * 
	 */
	private Singleton() {}

	public static Singleton getInstance() {
		return null != singleton ? singleton : new Singleton();			
	}
	

	/**
	 * 
	 * @return <p></p> 
	 * 
	 */
	public final  Font getFondoGeneral(Fuente fuente) {	

		final InputStream is = Singleton.class.getResourceAsStream(fuente.getPath()); 				
		Font font = null;
		
		try {
			font = Font.createFont(Font.TRUETYPE_FONT, is);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
		
		return Objects.requireNonNull(font, "Font could not be loaded");
		
	}

}