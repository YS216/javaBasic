package ex3;

public class PersonTest {

	public static void main(String[] args) {
		Person person1 = new Person(1);
        Person person2 = new Person(1);

        // equals 메소드 호출한 if문
        if (person1.equals(person2)) {
            System.out.println("person1과 person2는 equals 메소드로 같다.");
        } else {
            System.out.println("person1과 person2는 equals 메소드로 다르다.");
        }

        // == 사용한 if문
        if (person1 == person2) {
            System.out.println("person1과 person2는 == 연산자로 같다.");
        } else {
            System.out.println("person1과 person2는 == 연산자로 다르다.");
        }

	}

}
