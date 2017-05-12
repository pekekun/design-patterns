package templatemethod;

/**
 * AbstractDisplayのサブクラス
 * 
 * @author a_matsumoto
 *
 */
public class CharDisplay extends AbstractDisplay {

	private char ch;

	public CharDisplay(char ch) {
		this.ch = ch;
	}

	/*
	 * (非 Javadoc)
	 * 
	 * @see templatemethod.AbstractDisplay#open()
	 */
	@Override
	public void open() {
		System.out.print("<<");
	}

	/*
	 * (非 Javadoc)
	 * 
	 * @see templatemethod.AbstractDisplay#print()
	 */
	@Override
	public void print() {
		System.out.print(ch);
	}

	/*
	 * (非 Javadoc)
	 * 
	 * @see templatemethod.AbstractDisplay#close()
	 */
	@Override
	public void close() {
		System.out.println(">>");
	}

}
