package factoryMethod.exercicio_2_2;

public class TestArquivos {

	public static void main(String[] args) {

		String senha = "desi gnpatt er ns";

		DisplayArquivo arquivo;

		if (senha.equals("desi gnpatt er ns")) {
			arquivo = new ArquivoPrivadoDisplay();
		} else {
			arquivo = new ArquivoPublicoDisplay();
		}

		arquivo.display();

	}

}
