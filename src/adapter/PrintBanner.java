package adapter;

/**
 * �v�����g�o�i�[�N���X <br>
 * Adapter�̖���
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
