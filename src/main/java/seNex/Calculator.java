package seNex;

public class Calculator {
	
	private int result;
	
	public void add(int x, int y) {
		result = x+y;
	}
	public void sub(int x, int y) {
		result = x-y;
	}
	
	public void Mul(int x, int y) {
		result = x*y;
	}
	
	
	
	public int getResult() {
		return result;
	}

}
