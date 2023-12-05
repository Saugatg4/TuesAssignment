package com.skillstorm.tues;



public class GasTank implements Fillable {

	private final double GALLONS;

	private double gas;

	public GasTank(double gallons) {
		this.GALLONS = gallons;
		this.gas = 0;
	}

	@Override
	public void fill() {
		this.gas = GALLONS;
	}

	@Override
	public void empty() {
		this.gas = 0;
	}

	@Override
	public void fill(double quantity) {
		this.gas = Math.min(GALLONS, this.gas + quantity);
	}

	@Override
	public void empty(double quantity) {
		this.gas = Math.max(0,this.gas - quantity);
	}

	public double getGas() {
		return gas;
	}

	@Override
	public String toString() {
		return "GasTank [GALLONS=" + GALLONS + ", gas=" + gas + "]";
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GasTank other = (GasTank) obj;
		return Double.compare(other.gas, gas) == 0;
	}


}
