import java.util.*;
class AverageOfThreeNo{
	public static void main(String[]args){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int num1= obj.nextInt();
		int num2= obj.nextInt();
		int num3= obj.nextInt();
		
		int result = num1 + num2 + num3;
		float avg = result/3;

		System.out.println("The average is: " + avg);
	}
}