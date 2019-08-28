package assignment01;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.File;


public class USAddressTester {
	public static void main(String[] args) {

    StreetUSAddress address1 = new StreetUSAddress("123 Cherry Lane", "Apartment 2A", "Newark", "NJ", "01234");
    StreetUSAddress address2 = new StreetUSAddress("321 Maple Avenue", "", "Trenton", "NJ", "43210");

    System.out.println(address1);

		System.out.println("\n");

    System.out.println(address2);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\n\nTESTS FOR StreetUSAddress.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println

		StreetUSAddress address12 = new StreetUSAddress("123 Cherry Lane", "Apartment 2A", "Newark", "NJ", "01234");
    StreetUSAddress address22 = new StreetUSAddress("321 Maple Avenue", "", "Trenton", "NJ", "43210");

    output.println(address12);

		output.println("\n");

    output.println(address22);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
