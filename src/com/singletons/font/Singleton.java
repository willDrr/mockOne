package com.singletons.font;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class Singleton {

	private static Singleton singleton = new Singleton();

	/**
	 * <p><i>Singleton</i> debe implementar un constructor privado por defecto</p>
	 */
	private Singleton() {}

	public static Singleton getInstance() {
		return singleton;
	}
	

	/**
	 * <p>Para usar este <i>font</i>, se hace de la siguiente manera:<br>&nbsp;&nbsp;&nbsp;&nbsp;<code>Font poppin = this.deriveFont(12f);</code></p>
	 * 
	 * @return <p>- Fuente especificada en el argumento</p> 
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
		
		return Objects.requireNonNull(font, "El fondo especial no pudo ser cargado");
		
	}

}