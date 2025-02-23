import java.util.Scanner;
class Divide{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter Num1");
int num1 = input.nextInt();

System.out.println("Enter Num2");
int num2 = input.nextInt();

float num = 0;
if(num1 == 0 || num2 == 0){
System.out.println("Cannot divide by 0");
}else{

int divide = num1/num2;

System.out.println("The division is : " + divide);

}

}

}