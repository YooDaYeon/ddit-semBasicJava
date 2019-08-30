package y_exam;

public class TotalTest {
	public static void main(String[] args) {

		TvMaker.color = "Blue"; //
		TvMaker tm = new TvMaker();
		tm.age = 30; //
		// 3. 메서드 호출
		// 3.1
		System.out.println(TvControll.channel);
		TvControll.volumeDown();
		System.out.println(TvControll.channel);

		// 3.2
		TvControll tc; //
		tc = new TvControll(); //
		System.out.println(tc.volume);
		tc.volumeUp();
		System.out.println(tc.volume);
		tc.volumeUp();
		System.out.println(tc.volume);

		//
		Calc cc = new Calc();
		System.out.println(cc.add(Integer.MAX_VALUE, 4));
		System.out.println(cc.add(3L, Integer.MAX_VALUE));

	}
}

class TvMaker {
	// 1.
	// 1.1
	static String color;
	static int inch;
	// 1.2
	String name = "";
	int age;

	// 2.
	// 2.1
	TvMaker() {
		this("man", 25);
	}

	// 2.2
	TvMaker(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class TvControll {
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	static final int MAX_CHANNEL = 50;
	static final int MIN_CHANNEL = 1;

	static int channel = 15;
	int volume = 99;

	// 4. return문
	int volumeUp() {
		if (volume == MAX_VOLUME) {
			volume = MIN_VOLUME;
		} else {
			volume++;
		}

		return volume;
	}

	static int volumeDown() {
		if (channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			channel++;
		}
		return channel;
	}
}

class Calc {
	// 5.
	int add(int a, int b) {
		return a + b;
	}

	long add(long a, int b) {
		return a + b;
	}

	int minus(int a, int b) {
		return a + b;
	}
}