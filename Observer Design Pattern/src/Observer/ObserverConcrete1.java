package Observer;

import Observable.Observable;

public class ObserverConcrete1 implements Observer {
	
	public Observable observable;
	
	public ObserverConcrete1(Observable observable){
		this.observable = observable;
	}

	@Override
	public void update() {
		System.out.println("ObserverConcrete1: " + observable.getData());
	}	
}
