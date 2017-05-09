package iterator;

/**
 * 集合体インターフェース.
 * <p>
 * 集合体に対応するiteratorメソッドを宣言.
 * <p>
 * 集合体を数え上げたり1つずつ調べていきたい場合に利用する.
 * 
 * @author a_matsumoto
 *
 */
public interface Aggregate {
	public abstract Iterator iterator();
}