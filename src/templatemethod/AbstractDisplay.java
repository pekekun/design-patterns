package templatemethod;

/**
 * 抽象クラスAbstractDisplay
 * 
 * @author a_matsumoto
 *
 */
public abstract class AbstractDisplay {

	/**
	 * サブクラスに実装を任せる抽象メソッド <br>
	 * open
	 */
	public abstract void open();

	/**
	 * サブクラスに実装を任せる抽象メソッド <br>
	 * print
	 */
	public abstract void print();

	/**
	 * サブクラスに実装を任せる抽象メソッド <br>
	 * close
	 */
	public abstract void close();

	/**
	 * displayメソッド。AbstractDisplayクラス内で実装している。 <br>
	 * 5回プリントを繰り返す。
	 * 
	 */
	public final void display() {
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}

}
