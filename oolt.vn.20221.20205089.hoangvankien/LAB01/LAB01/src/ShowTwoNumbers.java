//2.2.4 Write, compile, and run the following example:
//Hoang Van Kien - 20205089
import javax.swing.JOptionPane;

public class ShowTwoNumbers {
	public static void main(String[] args) {
		String strNum1, strNum2;
		String strNotification = " you've just enterred:";
		strNum1 = JOptionPane.showInputDialog(null,
				"Please input the first number: ","Input the first number", JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum1 + "and";
		strNum2 = JOptionPane.showInputDialog(null,
				"Please input the second number: " , "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		strNotification +=strNum2;
		JOptionPane.showMessageDialog(null, strNotification,
				"Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
