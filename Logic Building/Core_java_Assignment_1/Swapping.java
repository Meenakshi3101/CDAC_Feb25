
import java.util.*;
class Swapping{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);

System.out.println("Enter two numbers: ");
int num1 = obj.nextInt();
int num2 = obj.nextInt();

System.out.println("Before Swapping");
System.out.println("num1 : " + num1);

System.out.println("num2 : " + num2);

int temp = num1;num1 = num2 ; num2 = temp;


System.out.println("After Swapping");
System.out.println("num1 : " + num1);

System.out.println("num2 : " + num2);
}

}



