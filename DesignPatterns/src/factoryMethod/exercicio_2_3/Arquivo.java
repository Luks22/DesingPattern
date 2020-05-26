package factoryMethod.exercicio_2_3;

public class Arquivo implements Log{

	@Override
	public String getLog(String numeros) {
		return "Log.txt";
	}

}
