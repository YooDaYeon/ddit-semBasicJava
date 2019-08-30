package f_OOP2;

public class TimeTest {
	public static void main(String[] args) {
		TimeVO t = new TimeVO();
		t.setHour(30);
		System.out.println(t.getHour()); // 6
		//setMinute(140)
		System.out.println(t.getHour()+" : "+t.getMinute()); // 8 : 20
		
		//setSeconds(10000)
		System.out.println(t.getHour()+" : "+t.getMinute()+" : "+t.getSeconds()); // 11 : 6 : 40
		
	}
}

class TimeVO{
	private int hour;
	private int minute;
	private int seconds;
	
	void setHour(int hour){
		this.hour = hour%24;
	}
	
	int getHour(){
		return hour;
	}

	public void setMinute(int minute) { // 186
		this.minute = minute%60; //6
		setHour(hour += minute/60); // 6+3 
	}
	
	public int getMinute() {
		return minute;
	}

	public void setSeconds(int seconds) {
		setMinute(minute += seconds/60);
		this.seconds = seconds%60;
	}
	
	public int getSeconds() {
		return seconds;
	}
	
}








