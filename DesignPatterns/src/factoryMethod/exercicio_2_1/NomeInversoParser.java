package factoryMethod.exercicio_2_1;

public class NomeInversoParser extends NameParserCreator{

	@Override
	protected ParserName getParser() {
		
		return new NomeInverso();
	}

}
