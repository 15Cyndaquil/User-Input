
import java.util.Scanner;
public class HelloMyName {
	public static void main(String[] args) {
		String name1, password1;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your Name and Password");
		name1 = keyboard.nextLine();
		password1 = keyboard.nextLine();
		System.out.print("Hello " + name1 + ", Welcome to CSC 200 Class! Your Password is ");
		System.out.print(password1);
		keyboard.close();
	}

}
