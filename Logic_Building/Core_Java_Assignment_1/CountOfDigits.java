import java.util.*;
class CountOfDigits{
	public static void main(String[]args){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Number:");
		int n= obj.nextInt();
		int temp=n;
		
		int count=0;

		while(n>0){
			int rem=n%10;
			count++;
			n=n/10;
		}
		System.out.println("the number " + temp + " has " + count + " digits");
	}
}