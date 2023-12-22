package ex3;

public class Person {
	
	int id;
	
	Person(int id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) { // 객체의 참조가 같은 경우
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) { // 객체가 null이거나 클래스가 다른 경우
            return false;
        }

        Person other = (Person) obj; // 형변환

        return id == other.id; // id가 같은 경우 true, 아니면 false
    }
	

}
