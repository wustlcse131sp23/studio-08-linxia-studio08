package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	
	private int month;
	private int day;
	private int year;
	private boolean ifHoliday;
	
	/**
	 * 
	 * @param month the month of the date
	 * @param day the day of the date
	 * @param year the year of the date
	 * @param ifHoliday whether the date is a holiday
	 */

    public Date(int month, int day, int year, boolean ifHoliday) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
		this.ifHoliday = ifHoliday;
	}
 
	public String toString() {
		return month + "/" + day + "/" + year;
		
//		String printDate = "The date is " + month + "/" + day + "/" + year;
//		if (ifHoliday) {
//			printDate += ", it is a holiday.";
//		} else {
//			printDate += ", it is not a holiday.";
//		}
//		return printDate;
	}
	
	
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	public static void main(String[] args) {
		
		Date today = new Date(4,6,2023,false);
		Date yesterday = new Date(4,5,2023,false);
		Date foolsDay = new Date(4,1,2023,true);
		Date birthday = new Date(4,12,2000,false);
		Date newYear = new Date(1,1,2023,true);
		System.out.println(today);
		System.out.println(yesterday);
		System.out.println(foolsDay);
		System.out.println(today.equals(yesterday));
		
		LinkedList<Date> listOfDate = new LinkedList<Date>();
		listOfDate.add(today);
		listOfDate.add(today);
		listOfDate.add(yesterday);
		listOfDate.add(foolsDay);
		listOfDate.add(birthday);
		listOfDate.add(newYear);
		System.out.println(listOfDate);
		
		listOfDate.remove(1);
		listOfDate.add(newYear);
		listOfDate.set(5,new Date(3,31,2023,false));
		System.out.println(listOfDate);
		
		HashSet<Date> set = new HashSet<Date>();
		set.add(today);
		set.add(yesterday);
		set.add(today);
		System.out.println(set);

    }

}
