package strategy_Sample;

import java.util.Random;

public class ProbStrategy implements Strategy {
	private Random random;
	private int prevHandValue = 0;
	private int currentHandValue = 0;
	private int[][] history = { { 1, 1, 1, }, { 1, 1, 1, }, { 1, 1, 1, }, };

	public ProbStrategy(int seed) {
		random = new Random();
	}

	public Hand nextHand() {
		int bet = random.nextInt(getSum(currentHandValue)); // 현재 손의 다음손으로 0, 1, 2냈을 때 이긴 횟수 합과 0 사이의 난수 생성
		int handvalue = 0;
		if (bet < history[currentHandValue][0]) { // 0 ~ 주먹 횟수 -1 사이
			handvalue = 0;
		} else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
			// 주먹횟수 ~ 주먹횟수 + 가위 횟수 -1
			handvalue = 1;
		} else {// 그 외 범위
			handvalue = 2;
		}
		prevHandValue = currentHandValue;
		currentHandValue = handvalue;
		return Hand.getHand(handvalue);
	}

	private int getSum(int hv) { // 현재 손 대비 주먹가위보 이긴 횟수 합
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += history[hv][i];
		}
		return sum;
	}

	public void study(boolean win) {
		if (win) {
			history[prevHandValue][currentHandValue]++;
		} else {
			history[prevHandValue][(currentHandValue + 1) % 3]++;
			history[prevHandValue][(currentHandValue + 2) % 3]++;
		}
	}
}
