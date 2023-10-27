package proxy;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image = new ProxyImage("Teste");
		
		image.display();
		System.out.println("");
		
		image.display();

	}

}
