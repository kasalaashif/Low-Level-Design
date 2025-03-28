package ObserverPattern;

import Observable.ObservableConcrete;
import Observer.Observer;
import Observer.ObserverConcrete1;
import Observer.ObserverConcrete2;

public class Main {

	public static void main(String[] args) {
		ObservableConcrete observable = new ObservableConcrete();
		Observer observer1 = new ObserverConcrete1(observable);
		Observer observer2 = new ObserverConcrete2(observable);
		observable.addObserver(observer2);
		observable.addObserver(observer1);
		observable.setData(10);
		
	}

}
