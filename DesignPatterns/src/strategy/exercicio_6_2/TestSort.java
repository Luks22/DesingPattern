package strategy.exercicio_6_2;

public class TestSort {

	public static void main(String[] args) {

		int vet[] = new int[10];
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = (int) (Math.random() * 1000);
		}
		
		vet = new Ordenador().sort(vet);
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
		
		

	}

}
