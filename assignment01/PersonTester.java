package assignment01;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.File;


public class PersonTester {
	public static void main(String[] args) {

    StreetUSAddress address1 = new StreetUSAddress("999 Main Street", "Apartment 174", "Binghamton", "New York", "12345");
    DateAndPlaceOfBirth DPob1 = new DateAndPlaceOfBirth(1985, 5, 16, "Buffalo", "New York", "USA");

    Person person1 = new Person("Joe", "Smith", "123001234", DPob1, address1);

    System.out.println(person1);

    try(var output = new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println

    StreetUSAddress address12 = new StreetUSAddress("999 Main Street", "Apartment 174", "Binghamton", "New York", "12345");
    DateAndPlaceOfBirth DPob12 = new DateAndPlaceOfBirth(1985, 5, 16, "Buffalo", "New York", "USA");

    Person person12 = new Person("Joe", "Smith", "123001234", DPob12, address12);

    output.println(person12);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
