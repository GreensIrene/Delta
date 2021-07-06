package org.cts.test;

public class Parent {

	public Parent() {
		System.out.println("Parent default const");
	}

	public Parent(int id) {
		System.out.println("Parent int para const");
		System.out.println(id);

	}
}
