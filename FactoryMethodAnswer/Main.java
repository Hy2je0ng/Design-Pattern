import framework.*;
import idcard.*;

public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("joy");
		Product card2 = factory.create("hye");
		Product card3 = factory.create("jeong");
		card1.use();
		card2.use();
		card3.use();
	}
}
