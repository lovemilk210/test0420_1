package test0420_1;

public class test1 {
	public static void main(String[] args) {
		System.out.println("Hello world");
		
		int a = 0;
		CalculateService cal = new CalculateService();
		a = cal.sum(1, 2);
		System.out.println(a);
		
		cal.loop();
	}

}
