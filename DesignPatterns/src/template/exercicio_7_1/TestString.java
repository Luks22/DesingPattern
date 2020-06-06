package template.exercicio_7_1;


import javax.swing.JOptionPane;

public class TestString {

	public static void main(String[] args) {
		
		StringConversor reverse = new ReverseString();
		StringConversor duplicate = new DuplicateString();
		StringConversor lowerCase = new LowerString();
		StringConversor upperCase = new UpperString();
		
		String palavra = JOptionPane.showInputDialog("Escreva uma palavra");
		System.out.println("Palavra reversa");
		reverse.run(palavra);
		System.out.println("\n"+"Palavra Duplicada");
		duplicate.run(palavra);
		System.out.println("\n"+"Palavra em Minúscula");
		lowerCase.run(palavra);
		System.out.println("\n"+"Palavra em Maiúscula");
		upperCase.run(palavra);

	}

}
