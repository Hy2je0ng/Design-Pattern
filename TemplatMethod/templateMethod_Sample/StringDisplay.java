package templateMethod_Sample;

public class StringDisplay implements AbstractDisplay { // StringDisplay - AbstrctDisplay�� ���� Ŭ����.
	private String string; // ǥ���ؾ� �� ���ڿ�
	private int width; // ����Ʈ ������ ����� ���ڿ��� ������.

	public StringDisplay(String string) {
		this.string = string;
		this.width = string.getBytes().length; // ����Ʈ ������ ���� �ʵ忡 ����� �ΰ� ���߿� ����Ѵ�
	}

	public void open() { // �������̵�
		printLine();
	}

	public void print() {
		System.out.println("|" + string + "|"); // �ʵ忡 ����� �� ���ڿ��� ���Ŀ� "|"�� �ٿ��� ǥ��.
	}

	public void close() {
		printLine();
	}

	private void printLine() {
		System.out.print("+"); // �׵θ��� �𼭸��� ǥ���ϴ� "+" ��ũ�� ǥ��.
		for (int i = 0; i < width; i++) { // width���� "-"�� ǥ���ϰ�
			System.out.print("-"); // �׵θ� ������ �̿��Ѵ�.
		}
		System.out.println("+"); // �׵θ��� �𼭸��� ǥ���ϴ� "+" ��ũ�� ǥ��.
	}

}
