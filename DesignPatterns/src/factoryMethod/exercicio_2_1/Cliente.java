package factoryMethod.exercicio_2_1;

import java.util.ArrayList;

public class Cliente {

	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("José Lucas");
		nomes.add("Lucas, José");
		nomes.add("Morais, Aline");
		nomes.add("Wilson Fernando");
		
		NameParserCreator parser;
		
		for(String nome: nomes) {
			if(nome.contains(",")) {
				parser = new NomeInversoParser();
			}else {
				parser = new NomeDiretoParser();
			}
			
			parser.gravar(nome);
		}

	}

}
