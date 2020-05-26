package factoryMethod.exercicio_2_1;

public class NomeDireto implements ParserName {

	@Override
	public Nome parse(String s) {
		
		int espaco = s.indexOf(" ");
		String nome = s.substring(0, espaco);
		String sobrenome = s.substring(espaco+1, s.length());
		
		return new Nome(nome, sobrenome);
	}

}
