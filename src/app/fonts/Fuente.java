package app.fonts;

public enum Fuente {
	
	POPPINS_LIGHT ("./poppins-font/Poppins-Light.ttf"), 
		POPPINS_MEDIUM ("./poppins-font/Poppins-Medium.ttf"), 
			POPPINS_REGULAR ("./poppins-font/Poppins-Regular.ttf"), 
				POPPINS_SEMIBOLD ("./poppins-font/Poppins-SemiBold.ttf");
		
	
	private final String path ;
	
	/**
	 * 
	 * @param path
	 */
	private Fuente(String path) {
		this.path = path;
	}

	public final String getPath() {
		return this.path;
	}
	
}
