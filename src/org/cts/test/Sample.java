package org.cts.test;

public class Sample extends Parent {

	public Sample() {

		System.out.println("Default constructor");
	}

	public Sample(int id) {

		System.out.println("int para constructor");
		System.out.println(id);
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		Sample s1 = new Sample(200);
	}
}
