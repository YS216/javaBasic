package objTvMathod02;

public class TvTest {

	public static void main(String[] args) {
		Tv tv1 = new Tv("LG", "올레드", "63");
		System.out.println(tv1.company);
		System.out.println(tv1.model);
		System.out.println(tv1.inch);
		
		System.out.println();
		
		Tv tv2 = new Tv("삼성", "OLED", "57");
		System.out.println(tv2.company);
		System.out.println(tv2.model);
		System.out.println(tv2.inch);

	}

}
