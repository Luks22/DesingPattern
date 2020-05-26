package factoryMethod.exercicio_2_2;

public class ArquivoPrivadoDisplay extends DisplayArquivo{

	@Override
	protected Arquivo verificarArquivo() {

		return new ArquivoPrivado();
	}

}
