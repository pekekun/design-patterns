package iterator;

/**
 * 本クラス.
 * <p>
 * 本の名前をgetName()で取得できる
 * 
 * @author a_matsumoto
 *
 */
public class Book {
	private String name;

	/**
	 * コンストラクタ
	 * 
	 * @param name
	 */
	public Book(String name) {
		this.name = name;
	}

	/**
	 * 本の名前を取得する.
	 * 
	 * @return 書名
	 */
	public String getName() {
		return name;
	}
}
