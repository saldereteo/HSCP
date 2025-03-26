package suncoastChapter2;

public class EnumDemo {

	enum Season {winter, spring, summer, fall}
	enum Day {sunday, monday, tuesday, wednesday, thursday, friday, saturday}
	public static void main (String[] args) {
		Season season1;
		Day day1;
		
		season1 = Season.winter;
		day1 = Day.monday;
		
		//enums are a defined type. Can't set one to the other
		//day1 = Season.summer;
		System.out.println("season1 = " + season1);
		System.out.println("day1 = " + day1);
		
	}
}
