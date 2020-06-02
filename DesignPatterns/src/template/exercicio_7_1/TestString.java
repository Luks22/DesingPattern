package template.exercicio_7_1;

public class TestString {

	public static void main(String[] args) {
		
		StringConversor reverse = new ReverseString();
		StringConversor duplicate = new DuplicateString();
		StringConversor lowerCase = new LowerString();
		StringConversor upperCase = new UpperString();
		
		reverse.run("Jose");
		duplicate.run("Jose");
		lowerCase.run("Jose");
		upperCase.run("Jose");

	}

}
