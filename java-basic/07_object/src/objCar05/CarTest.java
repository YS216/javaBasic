package objCar05;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		Car fCar = new Car();
		
		fCar.company = "기아자동차";
		fCar.model1 = "K9";
		fCar.color = "회색";
//		fCar.MAX_SPEED = 250;  바꿀 수 없음
		
		System.out.println("-----내 차 정보-----");
		System.out.println("회사 : " + myCar.company);
		System.out.println("모델 : " + myCar.model1);
		System.out.println("컬러 : " + myCar.color);
		System.out.println("최고속도 : "+ myCar.MAX_SPEED);
		
		System.out.println();
		
		System.out.println("-----친구 차 정보-----");
		System.out.println("회사 : " + fCar.company);
		System.out.println("모델 : " + fCar.model1);
		System.out.println("컬러 : " + fCar.color);
		System.out.println("최고속도 : "+ fCar.MAX_SPEED);
		
//		myCar.run -> 변수
//		myCar.run(); -> 메소드
		
		System.out.println("----------------------------");
		System.out.print("내 차를 ");
		myCar.run();
		
//		System.out.println("현재속도 : " + myCar.speedUp());
//		System.out.println("현재속도 : " + myCar.speedUp());
//		System.out.println("현재속도 : " + myCar.speedDown());
		
		System.out.println("내 차의 현재 속도 : " + myCar.speedUp(30));
		System.out.println("내 차의 현재 속도 : " + myCar.speedUp(50));
		System.out.println("내 차의 현재 속도 : " + myCar.speedDown(20));
		System.out.println();
		
		System.out.println("친구차의 현재 속도:" + fCar.speed);
		
		System.out.print("내 차의 ");
		myCar.run();
		
		System.out.println();
		
		System.out.print("친구차를 ");
		fCar.run();
		
		System.out.println("친구차의 현재 속도 : " + fCar.speedUp(40));
		System.out.println("친구차의 현재 속도 : " + fCar.speedUp(60));
		System.out.println("친구차의 현재 속도 : " + fCar.speedDown(30));
		System.out.println();
		
		System.out.println("내 차의 현재 속도:" + myCar.speed);
		
		System.out.print("친구차의 ");
		fCar.run();
		
		
		
		

	}

}
