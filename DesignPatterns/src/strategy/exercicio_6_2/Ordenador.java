package strategy.exercicio_6_2;

public class Ordenador {
	
	public int[] sort(int[] array, String ordenador) {
		
		
		
		switch(ordenador) {
		
		case "BubbleSort": array = new BubbleSort().ordenar(array);
		break;
		case "InsertionSort": array = new InsertionSort().ordenar(array);
		break;
		case "SelectionSort":array = new SelectionSort().ordenar(array);
		break;
		case "QuickSort": array = new QuickSort().ordenar(array);
		break;
		default: System.out.println("Selecione uma forma de ordenação válida");
		}
		
		return array;
	}

}
