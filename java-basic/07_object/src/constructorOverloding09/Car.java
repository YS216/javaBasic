package constructorOverloding09;

public class Car {
	
	String company;
	String model;
	String color;
	int speed;
	
	Car(){
		this("삼성");
		System.out.println("매개변수가 없는 생성자");
	}
	Car(String company){
		System.out.println("매개변수가 1개인 생성자");
		this.company = company;
	}
	Car(String company, String model){
		System.out.println("매개변수가 2개인 생성자");
		this.company = company;
		this.model = model;
	}
	Car(String comapny, String model, String color) {
		System.out.println("매개변수가 3개인 생성자");
		this.company = comapny;
		this.model = model;
		this.color = color;
		
	}
	
}
