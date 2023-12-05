package com.skillstorm.tues;

public class FillableTest {

	public static void main(String[] args) {

		testGasTank();

		testCoffeMug();
	}

	private static void testGasTank() {
		GasTank gasTank = new GasTank(20);

		gasTank.fill();
		assertDoubleEquals(20, gasTank.getGas());

		gasTank.empty();
		assertDoubleEquals(0, gasTank.getGas());

		gasTank.fill(15);
		assertDoubleEquals(15, gasTank.getGas());

		gasTank.empty(5);
		assertDoubleEquals(10, gasTank.getGas());

		gasTank.fill(30);
		assertDoubleEquals(20, gasTank.getGas());

		System.out.println(gasTank);
		System.out.println("You have " + gasTank.getGas() + " Gallons of gas in your tank!");

	} private static void testCoffeMug() {

		CoffeMug coffeeMug = new CoffeMug(16);

		coffeeMug.fill();
		System.out.println("Filling your coffee mug " + coffeeMug); 

		coffeeMug.empty();
		System.out.println("Emptying your cofee mug " + coffeeMug);

		coffeeMug.fill(10);
		System.out.println("After filling with cofee " + coffeeMug);

		coffeeMug.empty(3);
		System.out.println("After emptying your cofee " + coffeeMug);
	}

	private static void assertDoubleEquals(double expected, double actual) {
		if (Math.abs(expected - actual) > 0.0001) {
			System.out.println("Assertion failed: Expected " + expected + ", Actual: " + actual);
			throw new AssertionError("Values are not equal.");
		} else {
			System.out.println("Assertion passed: Expected " + expected + ", Actual: " + actual);
		}
	}


}