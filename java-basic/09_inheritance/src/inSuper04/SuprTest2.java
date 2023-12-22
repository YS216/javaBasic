package inSuper04;

class Parent2 {
	int x = 10;
	void display() {
		System.out.println("부모클래스의 display() 메소드");
	}
}

class Child2 extends Parent2 {
	int x = 20;
	void display() {
		System.out.println("자식클래스이 display() 메소드");
	}
	
	void method() {
		System.out.println("x=" + x);
		System.out.println("Chile2클래스의 x=" + this.x);
		System.out.println("Parent2클래스의 x=" + super.x);
	}
}
public class SuprTest2 {

	public static void main(String[] args) {
		Child2 ch2 = new Child2();
		ch2.method();
		ch2.display();

	}

}
