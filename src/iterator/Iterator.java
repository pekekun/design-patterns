package iterator;

/**
 * Iterator�C���^�[�t�F�[�X.
 * <p>
 * ���̗v�f�����݂��邩�ǂ����𒲂ׂ�hasNext���\�b�h
 * <p>
 * ���̗v�f�𓾂邽�߂�next���\�b�h������.
 * 
 * @author a_matsumoto
 *
 */
public interface Iterator {
	public abstract boolean hasNext();

	public abstract Object next();
}
