package factoryMethod.exercicio_2_3;

public class TestNumeros {

	public static void main(String[] args) {
		
		String numeros = "";
		String tipo = "arquivo";

		
		for(int i = 0; i<= 10; i++) {
			numeros += i + " ";
		}
		
		
		DisplayLog log;
		
		if(tipo.equals("arquivo")) {
			log = new ArquivoDisplay();
		}else {
			log = new ConsoleDisplay();
		}
		
		
		log.display(numeros);

	}

}
