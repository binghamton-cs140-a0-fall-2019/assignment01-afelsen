package assignment01;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.File;


public class ComputerOwnerTester {
	public static void main(String[] args) {

		StreetUSAddress address1 = new StreetUSAddress("123 State Street", "", "Pheonix", "Arizona", "00123");
    DateAndPlaceOfBirth DPob1 = new DateAndPlaceOfBirth(1999, 11, 23, "Omaha", "Nebraska", "USA");
		Person person1 = new Person("Jane", "Doe", "321991234", DPob1, address1);

		Computer computer1 = new Computer("Dell", "Powerful", 4, 512, true, 800);
    Computer computer2 = new Computer("Toshiba", "Decent", 8, 256, false, 650);
    Computer computer3 = new Computer("Mac", "Weak", 6, 2048, true, 1400);
    Computer computer4 = new Computer("HP", "Expensive", 16, 4096, false, 2500);


		ComputerOwner computerOwner1 = new ComputerOwner(person1);

		computerOwner1.addComputer(computer1);
		computerOwner1.addComputer(computer2);
		computerOwner1.addComputer(computer3);
		computerOwner1.addComputer(computer4);

		System.out.println(computerOwner1);

		System.out.println('\n');

		computerOwner1.removeComputer(0);
		computerOwner1.removeComputer(0);

		System.out.println(computerOwner1);

    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println

		StreetUSAddress address12 = new StreetUSAddress("123 State Street", "", "Pheonix", "Arizona", "00123");
		DateAndPlaceOfBirth DPob12 = new DateAndPlaceOfBirth(1999, 11, 23, "Omaha", "Nebraska", "USA");
		Person person12 = new Person("Jane", "Doe", "321991234", DPob12, address12);

		Computer computer12 = new Computer("Dell", "Powerful", 4, 512, true, 800);
		Computer computer22 = new Computer("Toshiba", "Decent", 8, 256, false, 650);
		Computer computer32 = new Computer("Mac", "Weak", 6, 2048, true, 1400);
		Computer computer42 = new Computer("HP", "Expensive", 16, 4096, false, 2500);


		ComputerOwner computerOwner12 = new ComputerOwner(person12);

		computerOwner12.addComputer(computer12);
		computerOwner12.addComputer(computer22);
		computerOwner12.addComputer(computer32);
		computerOwner12.addComputer(computer42);

		output.println(computerOwner12);

		output.println('\n');

		computerOwner12.removeComputer(0);
		computerOwner12.removeComputer(0);

		output.println(computerOwner1);



		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
