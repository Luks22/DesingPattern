package strategy.exercicio_6_2;

import javax.swing.JOptionPane;

public class TestSort {

	public static void main(String[] args) {

		int vet[] = new int[5000];
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = (int) (Math.random() * 1000);
		}
		
		String tipoOrdenador = JOptionPane.showInputDialog("Digite o tipo de ordenação: " + "\n" + "BubbleSort, InsertionSort, QuickSort ou SelectionSort");
		
		long tempoI = System.currentTimeMillis();
		vet = new Ordenador().sort(vet, tipoOrdenador);
		long tempoD = System.currentTimeMillis();
		
		System.out.println("");
		System.out.println("Tempo para ordenar: " + (tempoD-tempoI) + "ms" + "\n");
		System.out.println("Vetor: ");
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
		
		

	}

}
