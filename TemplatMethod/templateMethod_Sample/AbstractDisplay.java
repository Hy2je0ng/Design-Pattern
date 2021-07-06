package templateMethod_Sample;

public interface AbstractDisplay { // 추상 클래스 AbstractDisplay
	public abstract void open(); // 하위 클래스에 구현을 맡기는 추상 메소드 (1) open
	public abstract void print(); // 하위 클래스에 구현을 맡기는 추상 메소드 (2) print
	public abstract void close(); // 하위 클래스에 구현을 맡기는 추상 메소드 (3) close

	default void display() { // 추상 클래스에서 구현되고 있는 메소드
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
}
