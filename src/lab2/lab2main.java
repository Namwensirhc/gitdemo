package lab2;

import java.util.Scanner;

public class lab2main {
	static double width;
	static double length;
	static double area;
	static double perimeter;
	static double width2;
	static double length2;
	static double area2;
	static double perimeter2;
	static double width3;
	static double length3;
	static double area3;
	static double perimeter3;
	static String answer;
	static String answer2;
	static String answer3;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(
				"Hello stranger, today we will be calculationg the perimeter and area of the rooms at Grandcircus.");
		Begin();
	}

	public static void Begin() {
		System.out.println("Please input the width of your classroom");
		width = sc.nextDouble();
		System.out.println("Thanks! You said the room's width is " + width);
		System.out.println("Now we need you to enter the length of your classroom");
		length = sc.nextDouble();
		System.out.println("Much Obliged! You said the length of your room was " + length
				+ " Now before I calculate these dimensions I have to be sure you want to continue. "
				+ "Please enter 'y' to continue or 'n' to exit (Case matters)");
		sc.nextLine();
		answer = sc.next();

		if (answer.charAt(0) == 'y') {
			Calc();
		}
		if (answer.charAt(0) == 'n') {
			System.out.println("Goodbye!");
		}

	}

	public static void Calc() { // used to find perimeter and area
		area = (length * width);
		perimeter = ((length * 2) + (width * 2));
		System.out.println(" Area is equal to " + area + " And perimeter is equal to " + perimeter);
		Controoms();
	}

	public static void Controoms() { // submit
		System.out.println("Would you like to continue this exercise and provide dimensions for more rooms? (y/n)");
		answer2 = sc.next();
		if (answer2.charAt(0) == 'y') {
			Begin();

		}
		if (answer2.charAt(0) == 'n') {
			System.out.println("Goodbye!");
		}

	}

}