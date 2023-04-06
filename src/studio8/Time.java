package studio8;

import java.util.Objects;

public class Time {
	
	private int hour;
	private int minute;
	private boolean if24Format;
	

	public Time(int hour, int minute, boolean if24Format) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.if24Format = if24Format;
	}

	
	public String toString() {
		if (if24Format) {
			return hour + ":" + minute;
		} else {
			if (hour <= 12) {
				return hour + ":" + minute + " a.m.";
			} else {
				return (hour - 12) + ":" + minute + " p.m.";
			}
		}
		
//		if (if24Format) {
//			return "The time is " + hour + ":" + minute + ".";
//		} else {
//			if (hour <= 12) {
//				return "The time is " + hour + ":" + minute + " a.m.";
//			} else {
//				return "The time is " + (hour - 12) + ":" + minute + " p.m.";
//			}
//		}
	}
	
	

	public int hashCode() {
		return Objects.hash(hour, minute);
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}


	public static void main(String[] args) {
		
		Time a = new Time (13,54,true);
		Time b = new Time (13,54,false);
		Time c = a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(c.hashCode());
		
    }

}