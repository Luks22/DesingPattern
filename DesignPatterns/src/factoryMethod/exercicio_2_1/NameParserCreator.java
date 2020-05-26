package factoryMethod.exercicio_2_1;

public abstract class NameParserCreator {
	
	public void gravar(String nome) {
		ParserName parser = getParser();
		Nome parsedName = parser.parse(nome);
		System.out.println(parsedName);
	}
	
	protected abstract ParserName getParser();

}
