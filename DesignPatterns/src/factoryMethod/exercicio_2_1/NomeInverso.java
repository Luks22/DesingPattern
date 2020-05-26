package factoryMethod.exercicio_2_1;


public class NomeInverso implements ParserName {

	@Override
	public Nome parse(String s) {

		int espaco = s.indexOf(" ");
		String nome = s.substring(espaco+1, s.length());
		String sobrenome = s.substring(0, espaco-1);
		
		return new Nome(nome, sobrenome);
	}

}
