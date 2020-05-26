package factoryMethod.exercicio_2_2;

public abstract class DisplayArquivo {
	
	public void display() {
		Arquivo arquivo = verificarArquivo();
		String msg = arquivo.getArquivo();
		System.out.println(msg);
	}
	
	protected abstract Arquivo verificarArquivo();

}
