package clock;

public class Display{
	private int value = 0;
	private int limit = 0;
//	private static int step = 0;
	
	public Display(int limit) {
		this.limit = limit;
	}
	
	public int setValue(int value) {
		this.value = value;
		return value;
	}
	
	public void increase() {
		value++;
		if (value==limit) {
			value = 0;
		}
	}
	
	public int getValue() {
		return value;
	}
	
	public void main() {
		
	}
}