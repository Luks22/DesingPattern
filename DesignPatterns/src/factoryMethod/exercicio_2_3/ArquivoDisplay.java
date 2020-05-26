package factoryMethod.exercicio_2_3;

public class ArquivoDisplay extends DisplayLog{

	@Override
	protected Log printType() {
		return new Arquivo();
	}

}