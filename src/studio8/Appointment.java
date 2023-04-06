package studio8;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Appointment {
	
	private Date date;
	private Time time;
	private String person1;
	private String person2;
	
	private static Set<Appointment> calender = new HashSet<Appointment>();
	

	public Appointment(Date date, Time time, String person1, String person2) {
		super();
		this.date = date;
		this.time = time;
		this.person1 = person1;
		this.person2 = person2;
		calender.add(this);
	}


	public int hashCode() {
		return Objects.hash(date, person1, person2, time);
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(person1, other.person1)
				&& Objects.equals(person2, other.person2) && Objects.equals(time, other.time);
	}
	
	

	@Override
	public String toString() {
		return person1 + " has an appointment with " + person2 + " at " + time + " on " + date;
	}
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub	public static void main(String[] args) {
		
		Time a = new Time (13,54,true);
		Time b = new Time (13,56,false);
		Date today = new Date(4,6,2023,false);
		Date yesterday = new Date(4,5,2023,false);
		
		Appointment c = new Appointment(today,a,"Amy","Sam");
		Appointment d = new Appointment(today,a,"Joy","Sam");
		System.out.println(c);
		System.out.println(d);
		System.out.println(calender);
		System.out.println(c.equals(b));

	}

}
