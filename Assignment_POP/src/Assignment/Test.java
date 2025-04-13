package week7.day4;

import week7.day3.Person;

public class Test {
	public static void main(String[] args) {
		//Insert
		Person p1 = new Person(25,"Anmol","an2@gmail.com");
		new PersonCRUDV5().insert(p1);
	}
}
