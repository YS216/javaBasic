package objConstructor07;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car("현대", "그렌저", "하양");
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println(car1.color);
		
		System.out.println();
		
		Car car2 = new Car("기아", "K9", "남색");
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.color);

	}

}
