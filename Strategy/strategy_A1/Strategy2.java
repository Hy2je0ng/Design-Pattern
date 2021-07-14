package strategy_A1;

import java.util.Random;

public class Strategy2 implements Strategy {

	private Random random;

	public Strategy2(int seed) {
		random = new Random(seed);
	}

	public Hand nextHand() {
		return Hand.getHand(random.nextInt(3));
	}

	public void study(boolean win) {

	}
}
