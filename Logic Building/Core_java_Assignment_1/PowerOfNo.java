import java.util.*;
class PowerOfNo{
	public static void main(String[]args){
		Scanner obj = new Scanner(System.in);

		System.out.print("Enter base number:");
                int baseNo = obj.nextInt();

		System.out.print("Enter exponent number:");
		int exponentNo = obj.nextInt();

		int result=1;

		for(int i=exponentNo;i>0;i--){
			result=result*baseNo;
		}		
		System.out.println(result);
	}
}