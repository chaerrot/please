package ex08class;

class Triangle {
	
	int bottom;
	int height;
	
	public void init(int b, int h) {
		bottom = b;
		height = h;
	}
	
	public void setBottom(int b) {
		bottom = b;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	
	public double getArea() {
		double num = (bottom*height)/2.0;
		return num;
	}
}

public class QuTriangle
{
	public static void main(String[] args)
	{
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());
	}
}
