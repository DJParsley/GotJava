package gj_package;

import javax.swing.*;
import java.awt.*;


/**
 * @author Murray, Devan, Cerrell
 *
 */

public class GotJava {
	
	public GotJava() {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel title = new JLabel();
		JTextField searchBox = new JTextField();
		
		panel.setBackground( Color.WHITE );
		
		// Sets the properties of the title and adds it to the panel.
		title.setFont( new Font( "Serif", Font.BOLD, 32 ) );
		title.setText( "GotJava Search Engine" );
		panel.add( title );
		
		// Sets the properties of the searchbox and adds it to the panel.
		searchBox.setSize(200, 50);
		panel.add( searchBox );
		
		// TextField is super small and not usable.
		
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
		
	}
	
	public static void main( String[] args ) {
		
		new GotJava();
		
	}
	
}