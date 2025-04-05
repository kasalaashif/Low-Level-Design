package qdapterDesignPattern;

import Adaptee.WeightInPoundsImple;
import Adapter.WeightInKgs;
import Adapter.WeightInKGsImple;
public class Main {

	public static void main(String[] args) {
		WeightInKgs weight = new WeightInKGsImple( new WeightInPoundsImple());
		
		System.out.print(weight.getWeightInKGs());
	}

}
