package visitor_A1;

import java.util.*;

public class FileFindVisitor extends Visitor {
	private String filetype;
	private List<Entry> found = new ArrayList<Entry>();

	public FileFindVisitor(String filetype) { // ��.txt���� ���� Ȯ���ڸ� .�ٿ� ����
		this.filetype = filetype;
	}

	public Iterator<Entry> getFoundFiles() { // �߰��� ������ ��´�
		return found.iterator();
	}

	public void visit(File file) { // ������ �湮�� �� ȣ��ȴ�
		if (file.getName().endsWith(filetype)) {
			found.add(file);
		}
	}

	public void visit(Directory directory) { // ���͸��� �湮�� �� ȣ��ȴ�
		Iterator<Entry> it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = it.next();
			entry.accept(this);
		}
	}
}
