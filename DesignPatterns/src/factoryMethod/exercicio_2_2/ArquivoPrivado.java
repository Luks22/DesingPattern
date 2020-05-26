package factoryMethod.exercicio_2_2;

public class ArquivoPrivado implements Arquivo{

	@Override
	public String getArquivo() {
		
		return "Confidencial.txt";
	}

}