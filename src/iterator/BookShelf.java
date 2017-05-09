package iterator;

import java.util.ArrayList;

/**
 * �{�I��\������N���X <br>
 * �R���N���[�g�E�A�O���Q�[�g
 * 
 * @author a_matsumoto
 *
 */
public class BookShelf implements Aggregate {
	private ArrayList<Book> books;

	/**
	 * �R���X�g���N�^
	 * 
	 * @param initialsize
	 */
	public BookShelf(int initialsize) {
		this.books = new ArrayList<Book>(initialsize);
	}

	/**
	 * �{�̏ꏊ���擾����
	 * 
	 * @param index
	 * @return �{�̏ꏊ
	 */
	public Book getBookAt(int index) {
		return books.get(index);
	}

	/**
	 * �{��{�I�ɒǉ�����
	 * 
	 * @param book
	 */
	public void appendBook(Book book) {
		books.add(book);
	}

	/**
	 * �{�̐����擾����
	 * 
	 * @return
	 */
	public int getLength() {
		return books.size();
	}

	/*
	 * (�� Javadoc)
	 * 
	 * @see iterator.Aggregate#iterator()
	 */
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}