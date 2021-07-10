package decorator_A2;

public class Main {
	public static void main(String[] args) {
		MultiStringDisplay md = new MultiStringDisplay();
		md.add("Good Morning.");
		md.add("Hello");
		md.add("Good Night, See you tomorrow");
		md.show();
		System.out.println();

		Display d1 = new SideBorder(md, '#');
		d1.show();
		System.out.println();
		Display d2 = new FullBorder(md);
		d2.show();
		System.out.println();
	}
}
