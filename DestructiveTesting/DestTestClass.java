import java.io.*;
import java.util.*;

public class DestTestClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Height of the ladder: ");
		int height = scanner.nextInt();
		System.out.println("Highest rung of the ladder: ");
		int highest = scanner.nextInt();
		int range_top, range_bot = 0, increment = (int)Math.sqrt(height), range = increment, count = 0;
		boolean check = true, top = false;
        
		while (range < highest && range <= height) {
			count++;
			range_bot = range + 1;
			range += increment;
			if(range >= highest) {
				count++;
			}
		}
		if(range >= height) {
			top = true;
			range_top = height;
			range = height;
		}
		else { 
			range_top = range;
			while(check) {
				count++;
				range_bot++;
				if(range_bot > highest) {
					check = false;
					count++;
				}
			}
			range = range_bot - 1;
		}

		System.out.println("The height of the ladder is " + height + ", The highest safe rung is " + highest +"\n");
		System.out.println("Highest safe rung determined by this experiment: " + range + "\n");
		if(top) {
			System.out.println("Rung where the first test device broke: NA\n");
			System.out.println("Rung where the second test device broke: NA\n");
		}
		else {
			System.out.println("Rung where the first test device broke: " + range_top + "\n");
			System.out.println("Rung where the second test device broke: " + range_bot + "\n");
		}
		System.out.println("Total number of drops: " + count + "\n");

	}

}