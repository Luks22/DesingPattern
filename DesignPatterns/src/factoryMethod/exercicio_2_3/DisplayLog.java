package factoryMethod.exercicio_2_3;

public abstract class DisplayLog {
	
	public void display(String numeros) {
		Log l = printType();
		String msg = l.getLog(numeros);
		System.out.println(msg);
	}
	
	protected abstract Log printType();

}
