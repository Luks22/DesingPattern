package abstractFactory.exercicio_1_1;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		
		HelloWorldFactory factory = HelloWorldFactoryProducer.getFactory("PrintFactory");
		
		HelloWorld printMessage = factory.getInstance();
		
		String msg = "";
		msg = printMessage.print();
		
		System.out.println(msg);

	}

}
