/* 
Class that keeps track of a count
and has click, getCount and reset methods

Author: Teddy Juntunen
*/

public class Counter {

	private int count;

	// constructor. default count value of 0
	public Counter() {
		this.count = 0;
	}

	// adds 1 to the count data member
	public void click() {
		this.count++;
	}

	// returns the current count
	public int getCount() {
		return count;
	}

	// resets the count to 0
	public void reset() {
		this.count = 0;
	}

}