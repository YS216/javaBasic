package objTvMethod;

public class TvTest {

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		
		System.out.println("-----내 Tv 정보-----");
		System.out.println("회사 : " + tv1.company);
		System.out.println("모델 : " + tv1.model);
		System.out.println("인치 : " + tv1.inch);
		
		
		System.out.println("--------------------");
		tv1.onOff();
		
		System.out.println("현재 채널 : " + tv1.chanal);
		System.out.println("현재 채널 : " + tv1.chanalUp());
		System.out.println("현재 채널 : " + tv1.chanalDown());
		
		System.out.println("현재 볼륨 : " + tv1.volume);
		System.out.println("현재 볼륨 : " + tv1.volumeUp(3));
		System.out.println("현재 볼륨 : " + tv1.volumeDown(2));
		
		tv1.onOff();

	}

}
