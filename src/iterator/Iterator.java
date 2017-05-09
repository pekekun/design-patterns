package iterator;

/**
 * Iteratorインターフェース.
 * <p>
 * 次の要素が存在するかどうかを調べるhasNextメソッド
 * <p>
 * 次の要素を得るためのnextメソッドを持つ.
 * 
 * @author a_matsumoto
 *
 */
public interface Iterator {
	public abstract boolean hasNext();

	public abstract Object next();
}
