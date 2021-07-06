package templateMethod_Sample;

public interface AbstractDisplay { // �߻� Ŭ���� AbstractDisplay
	public abstract void open(); // ���� Ŭ������ ������ �ñ�� �߻� �޼ҵ� (1) open
	public abstract void print(); // ���� Ŭ������ ������ �ñ�� �߻� �޼ҵ� (2) print
	public abstract void close(); // ���� Ŭ������ ������ �ñ�� �߻� �޼ҵ� (3) close

	default void display() { // �߻� Ŭ�������� �����ǰ� �ִ� �޼ҵ�
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
}
