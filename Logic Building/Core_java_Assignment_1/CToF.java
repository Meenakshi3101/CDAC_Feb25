import java.util.*;
class CToF{
	public static void main(String[]args){

		Scanner obj = new Scanner(System.in);

		System.out.print("Enter degree celsius: ");
		float celsius = obj.nextInt();

		float fahrenheit = (celsius*9/5)+32;

		System.out.println(celsius + "C is equal to " + fahrenheit + "F");		
	
	}
}