package proxy_A1;

public class Main {
	public static void main(String[] args) {
		Printable p = new PrinterProxy("Alice", "proxy_A1.Printer"); // 패키지명까지 적어주기
		System.out.println("이름은 현재 " + p.getPrinterName() + "입니다.");
		p.setPrinterName("Bob");
		System.out.println("이름은 현재 " + p.getPrinterName() + "입니다.");
		p.print("Hello, world.");
	}
}
