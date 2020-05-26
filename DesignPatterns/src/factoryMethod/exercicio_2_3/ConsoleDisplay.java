package factoryMethod.exercicio_2_3;

public class ConsoleDisplay extends DisplayLog{

	@Override
	protected Log printType() {

		return new Console();
	}

}
