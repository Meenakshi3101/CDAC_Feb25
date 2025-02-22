import java.util.Scanner;
class EvenOrOdd{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter Number");
int num = input.nextInt();

if(num%2==0){
System.out.println("The number is Even");
}else{
System.out.println("The number is Odd");
}
}
}


