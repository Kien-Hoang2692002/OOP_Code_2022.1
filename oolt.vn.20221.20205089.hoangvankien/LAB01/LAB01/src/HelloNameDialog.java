//2.2.3 Write, compile the first input dialog Java application
// Hoang Van Kien - 20205089
import javax.swing.JOptionPane;

public class HelloNameDialog {
	public static void main(String[] args) {
		String result;
		result = JOptionPane.showInputDialog("Please enter your name: ");
		JOptionPane.showMessageDialog(null, "Hi "+ result +"!");
		System.exit(0);
	}
}
