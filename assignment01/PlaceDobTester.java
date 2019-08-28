package assignment01;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.File;


public class PlaceDobTester {
	public static void main(String[] args) {


		DateAndPlaceOfBirth DPob1 = new DateAndPlaceOfBirth(2000, 4, 10, "Binghamton", "New York", "USA");
		DateAndPlaceOfBirth DPob2 = new DateAndPlaceOfBirth(2000, 4, 10, "Los Angeles", "California", "USA");
		DateAndPlaceOfBirth DPob3 = new DateAndPlaceOfBirth(1988, 9, 21, "Atlanta", "Georgia", "USA");
		DateAndPlaceOfBirth DPob4 = new DateAndPlaceOfBirth(1979, 4, 10, "Barcelona", "Italy");
		DateAndPlaceOfBirth DPob5 = new DateAndPlaceOfBirth(1996, 8, 24, "Athens", "Greece");

		//Testing toString()
		System.out.println(DPob1);
		System.out.println(DPob2);
		System.out.println(DPob3);
		System.out.println(DPob4);
		System.out.println(DPob5);


		//Testing olderThan
			//Same Age
		System.out.println(DPob1.olderThan(DPob2)); //False
		System.out.println(DPob2.olderThan(DPob1)); //False


			//Older
		System.out.println(DPob3.olderThan(DPob1)); //True
		System.out.println(DPob3.olderThan(DPob2)); //True
		System.out.println(DPob3.olderThan(DPob5)); //True
		System.out.println(DPob4.olderThan(DPob1)); //True
		System.out.println(DPob4.olderThan(DPob2)); //True
		System.out.println(DPob4.olderThan(DPob3)); //True
		System.out.println(DPob4.olderThan(DPob5)); //True
		System.out.println(DPob5.olderThan(DPob1)); //True
		System.out.println(DPob5.olderThan(DPob2)); //True

			//Younger
		System.out.println(DPob1.olderThan(DPob3)); //False
		System.out.println(DPob1.olderThan(DPob4)); //False
		System.out.println(DPob1.olderThan(DPob5)); //False
		System.out.println(DPob2.olderThan(DPob3)); //False
		System.out.println(DPob2.olderThan(DPob4)); //False
		System.out.println(DPob2.olderThan(DPob5)); //False
		System.out.println(DPob3.olderThan(DPob4)); //False
		System.out.println(DPob5.olderThan(DPob3)); //False
		System.out.println(DPob5.olderThan(DPob4)); //False



		System.out.println("\n");


		//Testing youngerThan
			//Same Age
		System.out.println(DPob1.youngerThan(DPob2)); //False
		System.out.println(DPob2.youngerThan(DPob1)); //False


			//Older
		System.out.println(DPob3.youngerThan(DPob1)); //False
		System.out.println(DPob3.youngerThan(DPob2)); //False
		System.out.println(DPob3.youngerThan(DPob5)); //False
		System.out.println(DPob4.youngerThan(DPob1)); //False
		System.out.println(DPob4.youngerThan(DPob2)); //False
		System.out.println(DPob4.youngerThan(DPob3)); //False
		System.out.println(DPob4.youngerThan(DPob5)); //False
		System.out.println(DPob5.youngerThan(DPob1)); //False
		System.out.println(DPob5.youngerThan(DPob2)); //False

			//Younger
		System.out.println(DPob1.youngerThan(DPob3)); //True
		System.out.println(DPob1.youngerThan(DPob4)); //True
		System.out.println(DPob1.youngerThan(DPob5)); //True
		System.out.println(DPob2.youngerThan(DPob3)); //True
		System.out.println(DPob2.youngerThan(DPob4)); //True
		System.out.println(DPob2.youngerThan(DPob5)); //True
		System.out.println(DPob3.youngerThan(DPob4)); //True
		System.out.println(DPob5.youngerThan(DPob3)); //True
		System.out.println(DPob5.youngerThan(DPob4)); //True


		System.out.println("\n");


		//Testing hasSameBirthDateAs
			//Same Date
		System.out.println(DPob1.hasSameBirthDateAs(DPob2)); //True
		System.out.println(DPob2.hasSameBirthDateAs(DPob1)); //True

			//Same Day
		System.out.println(DPob1.hasSameBirthDateAs(DPob4)); //False
		System.out.println(DPob2.hasSameBirthDateAs(DPob4)); //False
		System.out.println(DPob4.hasSameBirthDateAs(DPob1)); //False
		System.out.println(DPob4.hasSameBirthDateAs(DPob2)); //False

			//Other
		System.out.println(DPob1.hasSameBirthDateAs(DPob3)); //False
		System.out.println(DPob1.hasSameBirthDateAs(DPob5)); //False
		System.out.println(DPob2.hasSameBirthDateAs(DPob3)); //False
		System.out.println(DPob2.hasSameBirthDateAs(DPob5)); //False
		System.out.println(DPob3.hasSameBirthDateAs(DPob4)); //False
		System.out.println(DPob3.hasSameBirthDateAs(DPob1)); //False
		System.out.println(DPob3.hasSameBirthDateAs(DPob2)); //False
		System.out.println(DPob3.hasSameBirthDateAs(DPob5)); //False
		System.out.println(DPob4.hasSameBirthDateAs(DPob3)); //False
		System.out.println(DPob4.hasSameBirthDateAs(DPob5)); //False
		System.out.println(DPob5.hasSameBirthDateAs(DPob3)); //False
		System.out.println(DPob5.hasSameBirthDateAs(DPob4)); //False
		System.out.println(DPob5.hasSameBirthDateAs(DPob1)); //False
		System.out.println(DPob5.hasSameBirthDateAs(DPob2)); //False


		System.out.println("\n");


		//Testing has sameBirthDayAs
		//Same Date
		System.out.println(DPob1.hasSameBirthDayAs(DPob2)); //True
		System.out.println(DPob2.hasSameBirthDayAs(DPob1)); //True

			//Same Day
		System.out.println(DPob1.hasSameBirthDayAs(DPob4)); //True
		System.out.println(DPob2.hasSameBirthDayAs(DPob4)); //True
		System.out.println(DPob4.hasSameBirthDayAs(DPob1)); //True
		System.out.println(DPob4.hasSameBirthDayAs(DPob2)); //True

			//Other
		System.out.println(DPob1.hasSameBirthDayAs(DPob3)); //False
		System.out.println(DPob1.hasSameBirthDayAs(DPob5)); //False
		System.out.println(DPob2.hasSameBirthDayAs(DPob3)); //False
		System.out.println(DPob2.hasSameBirthDayAs(DPob5)); //False
		System.out.println(DPob3.hasSameBirthDayAs(DPob4)); //False
		System.out.println(DPob3.hasSameBirthDayAs(DPob1)); //False
		System.out.println(DPob3.hasSameBirthDayAs(DPob2)); //False
		System.out.println(DPob3.hasSameBirthDayAs(DPob5)); //False
		System.out.println(DPob4.hasSameBirthDayAs(DPob3)); //False
		System.out.println(DPob4.hasSameBirthDayAs(DPob5)); //False
		System.out.println(DPob5.hasSameBirthDayAs(DPob3)); //False
		System.out.println(DPob5.hasSameBirthDayAs(DPob4)); //False
		System.out.println(DPob5.hasSameBirthDayAs(DPob1)); //False
		System.out.println(DPob5.hasSameBirthDayAs(DPob2)); //False



    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println

		DateAndPlaceOfBirth DPob12 = new DateAndPlaceOfBirth(2000, 4, 10, "Binghamton", "New York", "USA");
		DateAndPlaceOfBirth DPob22 = new DateAndPlaceOfBirth(2000, 4, 10, "Los Angeles", "California", "USA");
		DateAndPlaceOfBirth DPob32 = new DateAndPlaceOfBirth(1988, 9, 21, "Atlanta", "Georgia", "USA");
		DateAndPlaceOfBirth DPob42 = new DateAndPlaceOfBirth(1979, 4, 10, "Barcelona", "Italy");
		DateAndPlaceOfBirth DPob52 = new DateAndPlaceOfBirth(1996, 8, 24, "Athens", "Greece");

		//Testing toString()
		output.println(DPob12);
		output.println(DPob22);
		output.println(DPob32);
		output.println(DPob42);
		output.println(DPob52);


		//Testing olderThan
			//Same Age
		output.println(DPob12.olderThan(DPob22)); //False
		output.println(DPob22.olderThan(DPob12)); //False


			//Older
		output.println(DPob32.olderThan(DPob12)); //True
		output.println(DPob32.olderThan(DPob22)); //True
		output.println(DPob32.olderThan(DPob52)); //True
		output.println(DPob42.olderThan(DPob12)); //True
		output.println(DPob42.olderThan(DPob22)); //True
		output.println(DPob42.olderThan(DPob32)); //True
		output.println(DPob42.olderThan(DPob52)); //True
		output.println(DPob52.olderThan(DPob12)); //True
		output.println(DPob52.olderThan(DPob22)); //True

			//Younger
		output.println(DPob12.olderThan(DPob32)); //False
		output.println(DPob12.olderThan(DPob42)); //False
		output.println(DPob12.olderThan(DPob52)); //False
		output.println(DPob22.olderThan(DPob32)); //False
		output.println(DPob22.olderThan(DPob42)); //False
		output.println(DPob22.olderThan(DPob52)); //False
		output.println(DPob32.olderThan(DPob42)); //False
		output.println(DPob52.olderThan(DPob32)); //False
		output.println(DPob52.olderThan(DPob42)); //False



		output.println("\n");


		//Testing youngerThan
			//Same Age
		output.println(DPob12.youngerThan(DPob22)); //False
		output.println(DPob22.youngerThan(DPob12)); //False


			//Older
		output.println(DPob32.youngerThan(DPob12)); //False
		output.println(DPob32.youngerThan(DPob22)); //False
		output.println(DPob32.youngerThan(DPob52)); //False
		output.println(DPob42.youngerThan(DPob12)); //False
		output.println(DPob42.youngerThan(DPob22)); //False
		output.println(DPob42.youngerThan(DPob32)); //False
		output.println(DPob42.youngerThan(DPob52)); //False
		output.println(DPob52.youngerThan(DPob12)); //False
		output.println(DPob52.youngerThan(DPob22)); //False

			//Younger
		output.println(DPob12.youngerThan(DPob32)); //True
		output.println(DPob12.youngerThan(DPob42)); //True
		output.println(DPob12.youngerThan(DPob52)); //True
		output.println(DPob22.youngerThan(DPob32)); //True
		output.println(DPob22.youngerThan(DPob42)); //True
		output.println(DPob22.youngerThan(DPob52)); //True
		output.println(DPob32.youngerThan(DPob42)); //True
		output.println(DPob52.youngerThan(DPob32)); //True
		output.println(DPob52.youngerThan(DPob42)); //True


		output.println("\n");


		//Testing hasSameBirthDateAs
			//Same Date
		output.println(DPob12.hasSameBirthDateAs(DPob22)); //True
		output.println(DPob22.hasSameBirthDateAs(DPob12)); //True

			//Same Day
		output.println(DPob12.hasSameBirthDateAs(DPob42)); //False
		output.println(DPob22.hasSameBirthDateAs(DPob42)); //False
		output.println(DPob42.hasSameBirthDateAs(DPob12)); //False
		output.println(DPob42.hasSameBirthDateAs(DPob22)); //False

			//Other
		output.println(DPob12.hasSameBirthDateAs(DPob32)); //False
		output.println(DPob12.hasSameBirthDateAs(DPob52)); //False
		output.println(DPob22.hasSameBirthDateAs(DPob32)); //False
		output.println(DPob22.hasSameBirthDateAs(DPob52)); //False
		output.println(DPob32.hasSameBirthDateAs(DPob42)); //False
		output.println(DPob32.hasSameBirthDateAs(DPob12)); //False
		output.println(DPob32.hasSameBirthDateAs(DPob22)); //False
		output.println(DPob32.hasSameBirthDateAs(DPob52)); //False
		output.println(DPob42.hasSameBirthDateAs(DPob32)); //False
		output.println(DPob42.hasSameBirthDateAs(DPob52)); //False
		output.println(DPob52.hasSameBirthDateAs(DPob32)); //False
		output.println(DPob52.hasSameBirthDateAs(DPob42)); //False
		output.println(DPob52.hasSameBirthDateAs(DPob12)); //False
		output.println(DPob52.hasSameBirthDateAs(DPob22)); //False


		output.println("\n");


		//Testing has sameBirthDayAs
		//Same Date
		output.println(DPob12.hasSameBirthDayAs(DPob22)); //True
		output.println(DPob22.hasSameBirthDayAs(DPob12)); //True

			//Same Day
		output.println(DPob12.hasSameBirthDayAs(DPob42)); //True
		output.println(DPob22.hasSameBirthDayAs(DPob42)); //True
		output.println(DPob42.hasSameBirthDayAs(DPob12)); //True
		output.println(DPob42.hasSameBirthDayAs(DPob22)); //True

			//Other
		output.println(DPob12.hasSameBirthDayAs(DPob32)); //False
		output.println(DPob12.hasSameBirthDayAs(DPob52)); //False
		output.println(DPob22.hasSameBirthDayAs(DPob32)); //False
		output.println(DPob22.hasSameBirthDayAs(DPob52)); //False
		output.println(DPob32.hasSameBirthDayAs(DPob42)); //False
		output.println(DPob32.hasSameBirthDayAs(DPob12)); //False
		output.println(DPob32.hasSameBirthDayAs(DPob22)); //False
		output.println(DPob32.hasSameBirthDayAs(DPob52)); //False
		output.println(DPob42.hasSameBirthDayAs(DPob32)); //False
		output.println(DPob42.hasSameBirthDayAs(DPob52)); //False
		output.println(DPob52.hasSameBirthDayAs(DPob32)); //False
		output.println(DPob52.hasSameBirthDayAs(DPob42)); //False
		output.println(DPob52.hasSameBirthDayAs(DPob12)); //False
		output.println(DPob52.hasSameBirthDayAs(DPob22)); //False



		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
