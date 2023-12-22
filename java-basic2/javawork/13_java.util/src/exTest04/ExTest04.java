package exTest04;

import java.util.ArrayList;

public class ExTest04 extends Person{

    ExTest04(String name, int age, String phone, String address) {
		super(name, age, phone, address);
		
	}

	@Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", phone=" + phone + ", address=" + address + "]";
    }

    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();

        // 3개의 Person 객체를 ArrayList에 추가
        personList.add(new Person("가나다", 30, "123-456-7890", "서울시"));
        personList.add(new Person("라마바", 25, "987-654-3210", "광명시"));
        personList.add(new Person("사아자", 40, "555-123-7777", "부천시"));

        // ArrayList의 내용 출력
        for (Person person : personList) {
            System.out.println(person);
        }
    }
	
}