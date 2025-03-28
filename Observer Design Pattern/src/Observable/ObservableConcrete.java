package Observable;

import java.util.ArrayList;
import java.util.List;

import Observer.Observer;

public class ObservableConcrete implements Observable {

	public List<Observer> ObserverList = new ArrayList<>();
	public int data = 0;
	
	@Override
	public void addObserver(Observer observer) {
		ObserverList.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		ObserverList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : ObserverList) {
			observer.update();
		}
	}

	@Override
	public void setData(int data) {
		this.data += data; 	
		if(data > 0) {
			notifyObservers();
		}
	}

	@Override
	public int getData() {
		return data;
	}

}
