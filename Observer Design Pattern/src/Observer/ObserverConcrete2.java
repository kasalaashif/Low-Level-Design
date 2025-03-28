package Observer;

import Observable.Observable;

public class ObserverConcrete2 implements Observer {
	
	public Observable observable;
	
	public ObserverConcrete2(Observable observable){
		this.observable = observable;
	}

	@Override
	public void update() {
		System.out.println("ObserverConcrete2: " + observable.getData());
	}	
}
