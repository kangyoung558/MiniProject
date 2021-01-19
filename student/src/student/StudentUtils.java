package student;

import java.util.Scanner;

public class StudentUtils {
	private static Scanner scanner = new Scanner(System.in);
	
	public static int nextInt() {
		return Integer.parseInt(scanner.nextLine());
	}
	public static String nextLine() {
		return scanner.nextLine();
	}
}
