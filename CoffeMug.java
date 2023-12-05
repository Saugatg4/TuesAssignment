package com.skillstorm.tues;

public class CoffeMug implements Fillable {
	private final double OUNCES;
	private double coffee;

	public CoffeMug(double ounces) {
		this.OUNCES = ounces;
		this.coffee = 0;
	}
	@Override
	public void fill() {
		this.coffee = OUNCES; 

	}
	@Override
	public void empty() {
		this.coffee = 0;
	}

	@Override
	public void fill(double quantity) {
		this.coffee = Math.min(OUNCES, this.coffee + quantity); 
	}

	@Override
	public void empty(double quantity) {
		this.coffee = Math.max(0, this.coffee - quantity);
	}

	public double getCoffee() {
		return coffee;
	}

	@Override
	public String toString() {
		return "CoffeeMug [OUNCES=" + OUNCES + ", coffee=" + coffee + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		CoffeMug other = (CoffeMug) obj;
		return Double.compare(other.coffee, coffee) == 0;
	}
}