package factoryMethod.exercicio_2_1;

public class NomeDiretoParser extends NameParserCreator{

	@Override
	protected ParserName getParser() {
		
		return new NomeDireto();
	}

}
