package org.tcs;

import java.io.File;
import java.io.IOException;

import org.cts.test.Employee;

public class Client{
	public static void main(String[] args) throws IOException {
		
		File f =new File("F:\\");
		
		String[] li = f.list();
		
		for (String y : li) {
			System.out.println(y);
		}
		
		File[] k = f.listFiles();
		
		for (File x : k) {
			System.out.println(x);
		}
	}
}
