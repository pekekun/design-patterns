package templatemethod;

public class Main {

	public static void main(String[] args) {
		// 'H'を持ったCharDisplayのインスタンスを1個作る
		AbstractDisplay d1 = new CharDisplay('H');
		// "Hello World."を持ったStringDisplayのインスタンスを1個作る
		AbstractDisplay d2 = new StringDisplay("Hello World.");
		// "こんにちは。"を持ったStringDisplayのインスタンスを1個作る
		AbstractDisplay d3 = new StringDisplay("こんにちは。");

		d1.display();
		d2.display();
		d3.display();

	}

}
