package singleton.exercicio_3_1;

public class TesteIncremental {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Incremental.getInstance());
		}
		
	}
}