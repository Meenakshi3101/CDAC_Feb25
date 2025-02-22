
import java.util.*;

class ArithematicOperations{
public static void main(String[] args){

Scanner obj = new Scanner(System.in);

System.out.println("Enter Num1");
int num1 = obj.nextInt();

System.out.println("Enter Num2");
int num2 = obj.nextInt();

int add = num1+num2;
System.out.println("The Addition is : " + add);

int sub = num1-num2;
System.out.println("The Subtraction is : " + sub);

int multiply = num1*num2;
System.out.println("The Multiplication is : " + multiply);

int divide = num1/num2;
System.out.println("The Division is : " + divide);

int rem = num1%num2;
System.out.println("The Remainder is : " + rem);

}
}



