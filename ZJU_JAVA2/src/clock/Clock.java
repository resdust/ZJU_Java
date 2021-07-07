package clock;

public class Clock{
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	private Display second = new Display(60);
	
	public void start() {
		for (int i = 0; i < 3600*24+10; i++) { // 1 Day + 10 seconds
			this.tick();
			System.out.println(this);
		}
//			minute.increase();
//			if (minute.getValue() == 0) {
//				hour.increase();
//			}
//			System.out.printf("%02d:%02d:%02d", hour.getValue(), minute.getValue(), 
//					second.getValue());
//		}
	}
	
	public Clock () {
		
	}
	
	public Clock(int hour, int minute, int second) {
		//用hour, minute和second初始化时间。
		this.hour.setValue(hour);
		this.minute.setValue(minute);
		this.second.setValue(second);		
	}
	
	
	public void tick() {
		//“嘀嗒”一下，时间走1秒。
		second.increase();
		if (second.getValue()==0) {
			minute.increase();
			if (minute.getValue()==0) {
				hour.increase();
			}
		}
	}
	
	public String toString() {
		//返回一个String的值，以"hh:mm:ss"的形式表示当前时间。这里每个数值都占据两位，不足两位时补0。如“00:01:22"。注意其中的冒号是西文的，不是中文的。"
		return String.format("%02d:%02d:%02d",hour.getValue(), minute.getValue(), second.getValue());
	}
	
	
	public static void main(String[] args) {
//		Clock clock = new Clock();
//		clock.start();
		// 我觉得没有问题 但是没过OJ https://www.icourse163.org/learn/ZJU-1001542001?tid=1464410444#/learn/ojhw?id=1237747020
			java.util.Scanner in = new java.util.Scanner(System.in);
			
			Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
			clock.tick();
			
			System.out.println(clock);
			in.close();
		}
}