package adapter;

/**
 * プリントバナークラス <br>
 * Adapterの役割
 * 
 * 
 * @author a_matsumoto
 *
 */
public class PrintBanner extends Banner implements Print {
	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeak() {
		showWithParen();
	}

	@Override
	public void printStrong() {
		showWithAster();
	}

}
