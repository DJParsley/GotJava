package gj_package;

// Import statements. Will attempt to implement the wildcard function to trim the fat.
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;


/**
 * @author Murray, Devan, Cerrell
 *
 */

public class GotJava extends JFrame {
	
	JPanel window = new JPanel();
	JLabel title = new JLabel();
	JTextField searchBox = new JTextField( 30 );
	
	public GotJava(){
		
		setTitle( "GotJava Search Engine" );
		setSize( 600, 400 );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setLocationRelativeTo( null );
		setResizable( false );
		add( title );
		add( searchBox );
		setVisible( true );
		
	}
	
	public static void main( String[] args ) {
		
		GotJava gj = new GotJava();
		
	}
	
}