package test0420_1;

public class CalculateService {
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int big(int a, int b) {
		if (a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	public void loop() {
		for(int a=1;a<=9;a++) {
			for(int b=1;b<=9;b++) {
				System.out.print(a+"*"+b+"="+a*b+" ");
			}
			System.out.println();
		}
	
	}
}
