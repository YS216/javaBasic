package objTvMethod;

public class Tv {
	// 필드
	String company = "LG";
	String model = "올레드";
	int inch = 63;
	int volume;
	int chanal;
	boolean onOff;
	
	//메소드
	void onOff() {
		onOff = !onOff;
		if(onOff)
			System.out.println("전원이 켜졌습니다");
		else
			System.out.println("전원이 꺼집니다");
	}
	
	int chanalUp() {
		chanal+=2;
		return chanal;
	}
	
	int chanalDown() {
		chanal-=2;
		return chanal;
	}
	
	int volumeUp(int volume) {
		this.volume = volume;
		return this.volume;
	}
	
	int volumeDown(int volume) {
		this.volume = volume;
		return this.volume;
	}

}
