package oop;

public class CalRunner {

	public static void main(String[] args) {
		boolean isWeekDay = CalRunner.isWeekDay(5);
		String monthName = CalRunner.getMonthName(11);
		String dayName = CalRunner.getWeekdayName(5);

		System.out.println(isWeekDay);
		System.out.println(monthName);
		System.out.println(dayName);

	}

	public static boolean isWeekDay(int i) {
		switch (i) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				return true;
		}
		return false;
	}

	public static String getMonthName(int i) {
		switch (i) {
			case 1:
				return "January";
			case 2:
				return "February";
			case 3:
				return "March";
			case 4:
				return "April";
			case 5:
				return "May";
			case 6:
				return "June";
			case 7:
				return "July";
			case 8:
				return "August";
			case 9:
				return "Septemebr";
			case 10:
				return "October";
			case 11:
				return "November";
			case 12:
				return "December";
		}
		return "Unknown";
	}

	public static String getWeekdayName(int i) {
		switch (i) {
			case 0:
				return "Sunday";
			case 1:
				return "Monday";
			case 2:
				return "Tuesday";
			case 3:
				return "Wednesday";
			case 4:
				return "Thursday";
			case 5:
				return "Friday";
			case 6:
				return "Saturday";
		}
		return "Unknown";
	}

}
