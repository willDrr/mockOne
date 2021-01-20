package app.gui.mainpanel;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 

//	static {
//		try {
//			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
//				if ("Nimbus".equals(info.getName())) {
//					UIManager.setLookAndFeel(info.getClassName());
//					break;
//				}
//			}
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//	}
	
	private MainFrame() {}
	
	
	/**
	 * 
	 */
	public static final void init() {
		
		final JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/**
		 * <h1>Adding subpanel</h1>
		 */
		frame.getContentPane().add(new SubPanel());
		
		frame.pack();
		frame.setLocationRelativeTo(null); 
		frame.setVisible(true);
	}

}
