package iterator;

/**
 * �{�N���X.
 * <p>
 * �{�̖��O��getName()�Ŏ擾�ł���
 * 
 * @author a_matsumoto
 *
 */
public class Book {
	private String name;

	/**
	 * �R���X�g���N�^
	 * 
	 * @param name
	 */
	public Book(String name) {
		this.name = name;
	}

	/**
	 * �{�̖��O���擾����.
	 * 
	 * @return ����
	 */
	public String getName() {
		return name;
	}
}
