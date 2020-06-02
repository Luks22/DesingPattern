package strategy.exercicio_6_2;

public class Ordenador {
	
	public int[] sort(int[] array) {
		
		int random = (int) Math.ceil((Math.random()*10));
		
		switch(random) {
		
		case 0: case 1: case 2: array = new BubbleSort().ordenar(array);
		break;
		case 3: case 4: case 5: array = new InsertionSort().ordenar(array);
		break;
		case 6: case 7: array = new SelectionSort().ordenar(array);
		break;
		case 8: case 9: array = new QuickSort().ordenar(array);
		break;
		}
		
		return array;
	}

}
