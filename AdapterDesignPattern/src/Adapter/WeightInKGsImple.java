package Adapter;

import Adaptee.WeightInPounds;

public class WeightInKGsImple implements WeightInKgs{

	WeightInPounds weight;
	public WeightInKGsImple(WeightInPounds weight) {
		this.weight = weight;
	}
	@Override
	public int getWeightInKGs() {
		// TODO Auto-generated method stub
		return (int) (weight.getWeightinPounds()*0.45);
	}

}
