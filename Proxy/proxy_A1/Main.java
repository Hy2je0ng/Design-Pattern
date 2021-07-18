package proxy_A1;

public class Main {
	public static void main(String[] args) {
		Printable p = new PrinterProxy("Alice", "proxy_A1.Printer"); // ��Ű�������� �����ֱ�
		System.out.println("�̸��� ���� " + p.getPrinterName() + "�Դϴ�.");
		p.setPrinterName("Bob");
		System.out.println("�̸��� ���� " + p.getPrinterName() + "�Դϴ�.");
		p.print("Hello, world.");
	}
}