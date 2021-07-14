package strategy_Sample;

import java.util.Random;

public class WinningStrategy implements Strategy {
	private Random random;
	private boolean won = false;
	private Hand prevHand; // Hand Class의 new는 안됨! getHand()로만 접근 가능

	public WinningStrategy(int seed) {
		random = new Random(seed);
	}

	public Hand nextHand() {
		if (!won) { // lose
			prevHand = Hand.getHand(random.nextInt(3)); // 0~2 사이 난수
		}
		return prevHand;
	}

	public void study(boolean win) {
		won = win;
	}
}
