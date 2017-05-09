package iterator;

import java.util.ArrayList;

/**
 * 本棚を表現するクラス <br>
 * コンクリート・アグリゲート
 * 
 * @author a_matsumoto
 *
 */
public class BookShelf implements Aggregate {
	private ArrayList<Book> books;

	/**
	 * コンストラクタ
	 * 
	 * @param initialsize
	 */
	public BookShelf(int initialsize) {
		this.books = new ArrayList<Book>(initialsize);
	}

	/**
	 * 本の場所を取得する
	 * 
	 * @param index
	 * @return 本の場所
	 */
	public Book getBookAt(int index) {
		return books.get(index);
	}

	/**
	 * 本を本棚に追加する
	 * 
	 * @param book
	 */
	public void appendBook(Book book) {
		books.add(book);
	}

	/**
	 * 本の数を取得する
	 * 
	 * @return
	 */
	public int getLength() {
		return books.size();
	}

	/*
	 * (非 Javadoc)
	 * 
	 * @see iterator.Aggregate#iterator()
	 */
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}