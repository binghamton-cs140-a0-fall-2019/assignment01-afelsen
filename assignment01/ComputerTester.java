package assignment01;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.File;


public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.

    Computer computer1 = new Computer("Dell", "Powerful", 4, 512, true, 800);
    Computer computer2 = new Computer("Toshiba", "Decent", 8, 256, false, 650);
    Computer computer3 = new Computer("Mac", "Weak", 6, 2048, true, 1400);
    Computer computer4 = new Computer("HP", "Expensive", 16, 4096, false, 2500);

    System.out.println(computer1);
    System.out.println(computer2);
    System.out.println(computer3);
    System.out.println(computer4);



		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println

    Computer computer12 = new Computer("Dell", "Powerful", 4, 512, true, 800);
    Computer computer22 = new Computer("Toshiba", "Decent", 8, 256, false, 650);
    Computer computer32 = new Computer("Mac", "Weak", 6, 2048, true, 1400);
    Computer computer42 = new Computer("HP", "Expensive", 16, 4096, false, 2500);

    output.println(computer12);
    output.println(computer22);
    output.println(computer32);
    output.println(computer42);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
