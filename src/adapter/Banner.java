package adapter;

/**
 * �o�i�[�N���X. <br>
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
	 * ��������J�b�R�ł������ĕ\�����郁�\�b�h
	 */
	public void showWithParen() {
		System.out.println("(" + string + ")");
	}

	/**
	 * ������̑O���*��t���ĕ\�����郁�\�b�h
	 */
	public void showWithAster() {
		System.out.println("*" + string + "*");
	}

}
