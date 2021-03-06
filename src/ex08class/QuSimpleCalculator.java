package ex08class;

class CalculatorEx 
{
	int addCnt;
	int minCnt;
	int mulCnt;
	int divCnt;
	
	public void init() {
		addCnt = 0;
		minCnt = 0;
		mulCnt = 0;
		divCnt = 0;
	}
	public double add(double a, double b) {
		addCnt++;
		double num = a+b;
		return num;
	}
	public double min(double a, double b) {
		minCnt++;
		double num = a-b;
		return num;
	}
	public double mul(double a, double b) {
		mulCnt++;
		double num = a*b;
		return num;
	}
	public double div(double a, double b) {
		divCnt++;
		double num = a/b;
		return num;
	}		
	
	public void showOpCount() {
		System.out.println("덧셈횟수: "+ addCnt);
		System.out.println("뺄셈횟수: "+ minCnt);
		System.out.println("곱셈횟수: "+ mulCnt);
		System.out.println("나눗셈횟수: "+ divCnt);
	}
}

public class QuSimpleCalculator
{
	public static void main(String[] args)
	{
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
	}
}
