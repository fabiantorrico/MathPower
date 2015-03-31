import java.util.Scanner;

public class MathPower {
	public static void main(String [] args){
		Scanner keyboard = new Scanner(System.in);
		int x,y,z;
		System.out.println("Enter a number for x");
		System.out.println("Enter a number for y");
		System.out.println("Enter a number for z");
		x=keyboard.nextInt();
		y=keyboard.nextInt();
		z=keyboard.nextInt();
		System.out.println(Math.pow(x, 10));
		System.out.println(x+y);
		System.out.println(Math.sqrt(x)+Math.abs(y)+Math.pow(z,y));
	}

}