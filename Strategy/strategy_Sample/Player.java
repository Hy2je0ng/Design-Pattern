package strategy_Sample;

public class Player {
	private String name;
	private Strategy strategy;
	private int wincount;
	private int losecount;
	private int gamecount;

	public Player(String name, Strategy strategy) { // 이름과 전략을 할당받는다
		this.name = name;
		this.strategy = strategy;
	}

	public Hand nextHand() { // 전략의 지시를 받는다
		return strategy.nextHand(); // strategy에 위임
	}

	public void win() {
		strategy.study(true);
		wincount++;
		gamecount++;
	}

	public void lose() {
		strategy.study(false);
		losecount++;
		gamecount++;
	}

	public void even() {
		gamecount++;
	}

	public String toString() {
		return "[" + name + ":" + gamecount + " games, " + wincount + " win, " + losecount + " lose" + "]";
	}
}
