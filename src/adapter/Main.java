package adapter;

public class Main {
	public static void main(String[] ars) {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}

}
