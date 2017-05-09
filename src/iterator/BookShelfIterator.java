package iterator;

/**
 * BookShelfクラスのスキャンを行う
 * 
 * @author a_matsumoto
 *
 */
public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf;

	private int index;

	/**
	 * コンストラクタ
	 * 
	 * 
	 * @param bookShelf
	 */
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	/*
	 * (非 Javadoc)
	 * 
	 * @see iterator.Iterator#hasNext()
	 */
	public boolean hasNext() {
		if (index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * (非 Javadoc)
	 * 
	 * @see iterator.Iterator#next()
	 */
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
}
