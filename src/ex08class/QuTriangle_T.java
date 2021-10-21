package ex08class;

class Triangle_T {
	
	//멤버변수
	int bottom; //밑변
	int height; //높이
	
	//밑변과 높이를 초기화
	void init(int bottom, int height) {
		//this를 통해 멤버변수와 매개변수를 구분할 수 있다.
		this.bottom = bottom;
		this.height = height;
	}
	//밑변을 변경
	void setBottom(int bottom) {
		this.bottom = bottom;
	}
	//높이를 변경
	void setHeight(int height) {
		this.height = height;
	}
	//삼각형의 넓이를 계산 후 반환
	double getArea() {
		return (bottom * height * 0.5);
	}
}

public class QuTriangle_T {
	public static void main(String[] args) {
		Triangle_T t = new Triangle_T();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());
	}
}
