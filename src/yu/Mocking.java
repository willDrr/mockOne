package yu;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.componente.columnaperfil.MontajeColumna;
import com.componente.header.Header;
import com.componente.partecentral.PanelMain;

public class Mocking {

	public static void setLnF()  {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(Mocking::new);
	}
	
	public Mocking() {
		iniciar();
	}

	private final void iniciar() {
		
		final JFrame frame = new JFrame("OKTA AZUL");
		frame.setIconImage(Toolkit.getDefaultToolkit().createImage("./icons/github.png"));  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
//		Color twitter = new Color(33, 150, 243); 
		final JPanel header = new Header(); 
		//final JPanel panelCentral = new SubPanel();
		final JPanel panelmain = new PanelMain();
		final JPanel columna = new MontajeColumna();

		frame.add(header, BorderLayout.NORTH);
		frame.add(columna, BorderLayout.WEST);
		frame.add(panelmain, BorderLayout.CENTER); 

		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
	}	

}