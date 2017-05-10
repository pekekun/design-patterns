package adapter;

/**
 * メインクラス. <br>
 * クライアント（依頼者）の振る舞いをする
 * 
 * @author a_matsumoto
 *
 */
public class Main {
	public static void main(String[] ars) {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}

}
