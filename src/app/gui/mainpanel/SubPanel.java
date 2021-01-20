package app.gui.mainpanel;

import java.awt.BorderLayout;
import java.util.Date;

import app.gui.builder.JPanelTemplate;
import app.gui.header.Header;
import app.gui.panels_info.central_part.PanelDetailedInfoWork;
import app.gui.panels_info.left_part.LeftColumn;
import app.model.User;

public class SubPanel extends JPanelTemplate {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SubPanel() { 
		
		
		super(new BorderLayout());
				
		super.add(new Header(), BorderLayout.NORTH); 
		
		
		/**
		 * 
		 */
		final User user = new User("wilder", "foobar@gmail.com", "foobar", new Date() , "M", false);
		
		super.add(new LeftColumn(user), BorderLayout.WEST); 
		
		super.add(new PanelDetailedInfoWork(user), BorderLayout.CENTER); 
		
	}

}
