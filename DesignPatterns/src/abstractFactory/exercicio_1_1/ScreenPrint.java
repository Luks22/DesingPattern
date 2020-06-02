package abstractFactory.exercicio_1_1;

import javax.swing.JOptionPane;

public class ScreenPrint implements HelloWorld{

	@Override
	public String print() {
		System.out.println("Printing...");
		JOptionPane.showMessageDialog(null, "Hello World");
		return "Message Printed";
	}

}
