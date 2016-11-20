package mytest.hello;

public class Calc {

	private int initial = 1;

	public int getInitial() {
		return initial;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}
	
	public int adding(int n) {
		int result;
		result = initial + n - 1;
		return result;
	}
	
}
