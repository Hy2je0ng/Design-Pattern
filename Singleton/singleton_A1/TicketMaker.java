package singleton_A1;

public class TicketMaker {
	
	private int ticket = 1000;
	private static TicketMaker singleton = new TicketMaker();

	private TicketMaker() {
		System.out.println("TicketMaker °´Ã¼ »ý¼º");
	}

	public static TicketMaker getInstance() {
		return singleton;
	}

	public synchronized int getNextTicketNumber() {
		return ticket++;
	}
}
