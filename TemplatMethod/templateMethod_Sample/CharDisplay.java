package templateMethod_Sample;

public class CharDisplay implements AbstractDisplay { // CharDisplay는 AbstractDisplay의 하위 클래스
	private char ch; // 표시해야 할 문자

	public CharDisplay(char ch) {
		this.ch = ch;
	}

	public void open() { // 오버라이드 구현
		System.out.print("<<");
	}

	public void print() {
		System.out.print(ch);
	}

	public void close() {
		System.out.println(">>");
	}
}
