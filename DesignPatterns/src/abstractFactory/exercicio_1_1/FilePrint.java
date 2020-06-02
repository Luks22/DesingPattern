package abstractFactory.exercicio_1_1;

public class FilePrint implements HelloWorld{

	@Override
	public String print() {
		System.out.println("Printing...");
		return "Output.txt";
	}

}
