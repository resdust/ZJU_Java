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
		//��hour, minute��second��ʼ��ʱ�䡣
		this.hour.setValue(hour);
		this.minute.setValue(minute);
		this.second.setValue(second);		
	}
	
	
	public void tick() {
		//����ડ�һ�£�ʱ����1�롣
		second.increase();
		if (second.getValue()==0) {
			minute.increase();
			if (minute.getValue()==0) {
				hour.increase();
			}
		}
	}
	
	public String toString() {
		//����һ��String��ֵ����"hh:mm:ss"����ʽ��ʾ��ǰʱ�䡣����ÿ����ֵ��ռ����λ��������λʱ��0���硰00:01:22"��ע�����е�ð�������ĵģ��������ĵġ�"
		return String.format("%02d:%02d:%02d",hour.getValue(), minute.getValue(), second.getValue());
	}
	
	
	public static void main(String[] args) {
//		Clock clock = new Clock();
//		clock.start();
		// �Ҿ���û������ ����û��OJ https://www.icourse163.org/learn/ZJU-1001542001?tid=1464410444#/learn/ojhw?id=1237747020
			java.util.Scanner in = new java.util.Scanner(System.in);
			
			Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
			clock.tick();
			
			System.out.println(clock);
			in.close();
		}
}