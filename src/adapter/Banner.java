package adapter;

/**
 * バナークラス. <br>
 * 
 * @author a_matsumoto
 *
 */
public class Banner {
	private String string;

	public Banner(String string) {
		this.string = string;
	}

	/**
	 * 文字列をカッコでくくって表示するメソッド
	 */
	public void showWithParen() {
		System.out.println("(" + string + ")");
	}

	/**
	 * 文字列の前後に*を付けて表示するメソッド
	 */
	public void showWithAster() {
		System.out.println("*" + string + "*");
	}

}
