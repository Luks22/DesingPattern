package factoryMethod.exercicio_2_2;

public class ArquivoPublicoDisplay extends DisplayArquivo{

	@Override
	protected Arquivo verificarArquivo() {

		return new ArquivoPublico();
	}

}
