package templateMethod_Sample;

public class StringDisplay implements AbstractDisplay { // StringDisplay - AbstrctDisplay의 하위 클래스.
	private String string; // 표시해야 할 문자열
	private int width; // 바이트 단위로 계산한 문자열의 「폭」.

	public StringDisplay(String string) {
		this.string = string;
		this.width = string.getBytes().length; // 바이트 단위의 폭을 필드에 기억해 두고 나중에 사용한다
	}

	public void open() { // 오버라이드
		printLine();
	}

	public void print() {
		System.out.println("|" + string + "|"); // 필드에 기억해 둔 문자열의 전후에 "|"을 붙여서 표시.
	}

	public void close() {
		printLine();
	}

	private void printLine() {
		System.out.print("+"); // 테두리의 모서리를 표현하는 "+" 마크를 표시.
		for (int i = 0; i < width; i++) { // width개의 "-"을 표시하고
			System.out.print("-"); // 테두리 선으로 이용한다.
		}
		System.out.println("+"); // 테두리의 모서리를 표현하는 "+" 마크를 표시.
	}

}
