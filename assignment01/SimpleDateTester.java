package assignment01;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.File;


public class SimpleDateTester {
	public static void main(String[] args) {

    SimpleDate date1 = SimpleDate.of(1999, 10, 22);
    System.out.println(date1);

    // date1 is before
    SimpleDate date5 = SimpleDate.of(2003, 10, 22);
      System.out.println(date1.before(date5)); //True
    SimpleDate date6 = SimpleDate.of(1999, 12, 22);
      System.out.println(date1.before(date6)); //True
    SimpleDate date7 = SimpleDate.of(1999, 10, 29);
      System.out.println(date1.before(date7)); //True

    // date1 is after
    SimpleDate date2 = SimpleDate.of(1985, 10, 22);
      System.out.println(date1.before(date2)); //False
    SimpleDate date3 = SimpleDate.of(1999, 6, 22);
      System.out.println(date1.before(date3)); //False
    SimpleDate date4 = SimpleDate.of(1999, 6, 11);
      System.out.println(date1.before(date4)); //False

    //Same
    SimpleDate date8 = SimpleDate.of(1999, 10, 22);
      System.out.println(date1.before(date8)); //False


		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\n\nTESTS FOR SimpleDateTester.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println

    SimpleDate date12 = SimpleDate.of(1999, 10, 22);
    output.println(date12);

    // date12 is before
    SimpleDate date52 = SimpleDate.of(2003, 10, 22);
      output.println(date12.before(date52)); //True
    SimpleDate date62 = SimpleDate.of(1999, 12, 22);
      output.println(date12.before(date62)); //True
    SimpleDate date72 = SimpleDate.of(1999, 10, 29);
      output.println(date12.before(date72)); //True

    // date1 is after
    SimpleDate date22 = SimpleDate.of(1985, 10, 22);
      output.println(date12.before(date22)); //False
    SimpleDate date32 = SimpleDate.of(1999, 6, 22);
      output.println(date12.before(date32)); //False
    SimpleDate date42 = SimpleDate.of(1999, 6, 11);
      output.println(date12.before(date42)); //False

    //Same
    SimpleDate date82 = SimpleDate.of(1999, 10, 22);
      output.println(date12.before(date82)); //False

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
