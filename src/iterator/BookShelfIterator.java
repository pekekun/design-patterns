package iterator;

/**
 * BookShelf�N���X�̃X�L�������s��
 * 
 * @author a_matsumoto
 *
 */
public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf;

	private int index;

	/**
	 * �R���X�g���N�^
	 * 
	 * 
	 * @param bookShelf
	 */
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	/*
	 * (�� Javadoc)
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
	 * (�� Javadoc)
	 * 
	 * @see iterator.Iterator#next()
	 */
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
}
