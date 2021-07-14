package composite_Sample;

import java.util.*;

public class Directory extends Entry {

	private String name; // ���͸��� �̸�
	private ArrayList<Entry> directory = new ArrayList<Entry>(); // ���͸� ��Ʈ���� ����

	public Directory(String name) { // ������
		this.name = name;
	}

	public String getName() { // �̸��� ��´�
		return name;
	}

	public int getSize() { // ũ�⸦ ��´�
		int size = 0;
		Iterator<Entry> it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			size += entry.getSize();
		}
		return size;
	}

	public Entry add(Entry entry) { // ��Ʈ���� �߰�
		directory.add(entry);
		return this;
	}

	protected void printList(String prefix) { // ��Ʈ���� �϶�
		System.out.println(prefix + "/" + this);
		Iterator<Entry> it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			entry.printList(prefix + "/" + name);
		}
	}

}
