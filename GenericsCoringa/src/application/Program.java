package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}

	public static void printList(List<?> list) {
		//list.add(3); // erro de compilaçã
		for (Object obj : list) {
			System.out.println(obj);

		}

		/*
		 * List<Object> myObjs = new ArrayList<Object>(); List<Integer> myNumbers = new
		 * ArrayList<Integer>(); myObjs = myNumbers; // erro de compilaçãp
		 * 
		 * List<?> myObjs = new ArrayList<Object>(); List<Integer> myNumbers = new
		 * ArrayList<Integer>(); myObjs = myNumbers;
		 */

	}

}
