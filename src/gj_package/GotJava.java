package gj_package;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Murray, Devan, Cerrell
 *
 */

public class GotJava {

private JMenuItem item1 = new JMenuItem("Login");
private JMenuItem item2 = new JMenuItem("About");
private String aboutFiller1 = "Created by Devan Parsley";
private String aboutFiller2 = "Murray Sloan Jr.";
private String aboutFiller3 = "and Cerrell Brown";
private String aboutFiller4 = "Go Team GotJava!";
	
	public GotJava() {
		
		JFrame frame = new JFrame("");
        JMenuBar menubar = new JMenuBar();
        JMenu menu1 = new JMenu("Admin");
        JMenu menu2 = new JMenu("Help");
        
        // Adds the Admin and Help menus to the menubar, then adds
        // the menubar to the frame.
        menu1.add(item1);
        menu2.add(item2);
        menubar.add(menu1);
        menubar.add(menu2);
        frame.setJMenuBar(menubar);
        
		JPanel panel = new JPanel();
		
		// Sets the background color and layout style of the panel.
		panel.setBackground( Color.WHITE );
		panel.setLayout( new BoxLayout ( panel, BoxLayout.PAGE_AXIS ) );
		
		JLabel title = new JLabel();
		
		// Sets the properties of the title and adds it to the panel.
		title.setFont( new Font( "Serif", Font.BOLD, 32 ) );
		title.setText( "GotJava Search Engine" );
		panel.add( title );
		
		JTextField searchBox = new JTextField( 30 );
		
		// Sets the properties of the searchbox and adds it to the panel.
		searchBox.setSize( 50, 20 ); // Not changing the size currently
		panel.add( searchBox );
		
		JButton search = new JButton( "Search" );
		
		panel.add( search );
		
		// Sets the properties of the frame, including title, size, default
		// close operation, and default location. Adds the panel to the frame.
		frame.add( panel );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.add( panel );
		frame.setTitle( "GotJava Search Engine" );
		frame.pack();
		frame.setLocationRelativeTo( null );
		frame.setResizable( false );		
		frame.setVisible( true );

//These are the actions for the menu items

item1.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {
JFrame adminFrame = new JFrame("Admin");
JPanel adminPanel = new JPanel();
adminFrame.setVisible(true);
adminFrame.setSize(365, 600);
adminFrame.setResizable(false);


//This is where you would add the actions for the login section


}

});

item2.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

JFrame aboutFrame = new JFrame("About");
aboutFrame.setVisible(true);
aboutFrame.setSize(300, 120);
aboutFrame.setResizable(false);

JPanel aboutPanel = new JPanel() {

//Having issues getting paint to work

@Override
public void paint (Graphics g)
{
super.paint(g);
g.setColor(Color.BLACK);
g.setFont( new Font("Times New Roman", Font.BOLD, 16));
g.drawString(aboutFiller1, 60, 20);
g.setColor(Color.BLACK);
g.setFont( new Font("Times New Roman", Font.BOLD, 16));
g.drawString(aboutFiller2, 95, 40);
g.setColor(Color.BLACK);
g.setFont( new Font("Times New Roman", Font.BOLD, 16));
g.drawString(aboutFiller3, 85, 60);
g.setColor(Color.BLACK);
g.setFont( new Font("Times New Roman", Font.BOLD, 16));
g.drawString(aboutFiller4, 85, 80);
}
};
aboutFrame.setSize(600, 365);
aboutFrame.setResizable(false);

aboutPanel.setLayout(null);
aboutPanel.setBackground(Color.WHITE);
aboutFrame.add(aboutPanel);
//This is where you would add the actions for the about section
}
});
		
	}
	
	public static void main( String[] args ) {
		
		new GotJava();
		
	}
	
}