package app.gui.panels_info.left_part;

import static java.awt.Color.WHITE;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import app.gui.builder.BuilderLabel;
import app.gui.builder.BuilderPanel;
import app.gui.panels_info.generic.PanelInfoGeneric;
import app.model.Person;
import app.model.User;

public class PanelJobs extends PanelInfoGeneric<Person> {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelJobs(User user) {
		
		super(new GridLayout(0, 1), user, new TitledBorder("Recent jobs"));		
		
		final Font monserratPlain = new Font("Montserrat", Font.PLAIN, 14);
		final Font monserratBold = new Font("Montserrat", Font.BOLD, 14);
		
		final JLabel labelFirstJob = new BuilderLabel.LabelBuilder()
				.text(user.getJobs()[0])				
				.font(monserratBold)
				.opaque(true)
				.color(WHITE)
				.build();
		
		
		final JLabel labelIcon = new BuilderLabel.LabelBuilder()
				.text(Typefont.PRIMARY.getText())				
				.font(Typefont.PRIMARY.getFont()) 
				.opaque(true)
				.foreground(WHITE)
				.color(Color.BLUE.brighter())
				.build();
		
		final JPanel panel = new BuilderPanel.PanelBuilder(new FlowLayout(FlowLayout.LEADING))
				.addComponent(labelFirstJob)
				.addComponent(labelIcon)
				.build();
		
		final JPanel panelDescription = new BuilderPanel.PanelBuilder(new FlowLayout(FlowLayout.LEADING))
				
				.addComponent(new BuilderLabel.LabelBuilder()
						.text("Basically I did nothing at this")
						.horizontalAligment(JLabel.LEADING)
						.font(monserratPlain)
						.build() //building label
						)
				
				.build();
		
		
		final JPanel panelGrid = new BuilderPanel.PanelBuilder(new GridLayout(0, 1))
				.addContainer(panel)
				.addContainer(panelDescription)
				.build();
		

		///////////// SECOND JOB PANEL
		
		final JLabel labelSecondJob = new BuilderLabel.LabelBuilder()
				.text(user.getJobs()[1])
				.font(monserratBold)
				.opaque(true)
				.color(WHITE)
				.build();
		
		
		final JLabel labelSecondIcon = new BuilderLabel.LabelBuilder()
				.text(Typefont.SECUNDARY.getText())
				.font(Typefont.SECUNDARY.getFont())				
				.opaque(true)
				.foreground(WHITE)
				.color(Color.BLUE.brighter())
				.build();
		
		final JPanel panelSecond = new BuilderPanel.PanelBuilder(new FlowLayout(FlowLayout.LEADING))
				.addComponent(labelSecondJob)
				.addComponent(labelSecondIcon)
				.build();
		
		final JPanel panelDescriptionSecond = new BuilderPanel.PanelBuilder(new FlowLayout(FlowLayout.LEADING))
				.addComponent(new BuilderLabel.LabelBuilder()
						.text("Basically i did nothing in this job :)")						
						.horizontalAligment(JLabel.LEADING)
						.font(monserratPlain)
						.build()
						)
				.build();
		
		final JPanel panelGridSecond = new BuilderPanel.PanelBuilder(new GridLayout(0, 1))
				.addContainer(panelSecond)
				.addContainer(panelDescriptionSecond)
				.build();
		
		
		super.add(panelGrid);
		super.add(panelGridSecond);
	
	}
	
	enum Typefont {
				
		PRIMARY("Primary"), SECUNDARY("Secundary");
		
		static final Font font = new Font("Montserrat", Font.BOLD, 12);
		
		final String text ;
		
		Typefont(String text){ this.text = text;	}
		
		Font getFont() { return font; }
		
		String getText() { return text; }
	}

}
