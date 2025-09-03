package studio1;

import java.util.Scanner;

public class Ordered 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean isOrdered;
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		boolean a = x < y && y < z;
		boolean d = x > y && y > z;
		if (a || d ){
			isOrdered = true;
        } else{
			isOrdered = false;
		}
		System.out.println("Is the sequence ordered? " + isOrdered);
  }
}
