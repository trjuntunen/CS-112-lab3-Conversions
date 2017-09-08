/*
Class that runs the methods in the Count class
and keeps track of a count data member

Author: Teddy Juntunen
*/

public class CounterDriver {

	public static void main(String[] args) {

		// 2 Counter objects
		Counter obj1 = new Counter();
		Counter obj2 = new Counter();

		// using Counter class methods on obj1
		obj1.click();
		System.out.println(obj1.getCount());
		obj1.reset();
		System.out.println(obj2.getCount());

		// using Counter class methods on obj2
		obj2.click();
		System.out.println(obj2.getCount());
		obj2.reset();
		System.out.println(obj2.getCount());

	}

}