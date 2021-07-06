package templateMethod_Sample;

public class CharDisplay implements AbstractDisplay { // CharDisplay�� AbstractDisplay�� ���� Ŭ����
	private char ch; // ǥ���ؾ� �� ����

	public CharDisplay(char ch) {
		this.ch = ch;
	}

	public void open() { // �������̵� ����
		System.out.print("<<");
	}

	public void print() {
		System.out.print(ch);
	}

	public void close() {
		System.out.println(">>");
	}
}
