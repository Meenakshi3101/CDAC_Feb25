import java.util.*;
class Prime{
	public static void main(String[]args){

		Scanner obj = new Scanner(System.in);

		System.out.print("Enter number: ");
		int n = obj.nextInt();

		int count =0;


		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}

		if(count ==2){
			System.out.println("The number "+ n + " is prime");
		}else{
			System.out.println("The number "+ n + " is not prime");
		}
	}

}
