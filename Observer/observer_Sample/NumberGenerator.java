package observer_Sample;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
	private ArrayList<Observer> observers = new ArrayList<Observer>(); // Observer���� ����

	public void addObserver(Observer observer) { // Observer�� �߰�
		observers.add(observer);
	}

	public void deleteObserver(Observer observer) { // Observer�� ����
		observers.remove(observer);
	}

	public void notifyObservers() { // Observer�� ����
		Iterator<Observer> it = observers.iterator();
		while (it.hasNext()) {
			Observer o = (Observer) it.next();
			o.update(this);
		}
	}

	public abstract int getNumber(); // ���� ����Ѵ�

	public abstract void execute(); // ���� �����Ѵ�
}
