package bridge_A2;

public class Main {
	public static void main(String[] args) {
		CountDisplay d = new CountDisplay(new FileDisplayImpl("star.txt"));
		d.multiDisplay(4);
	}
}
