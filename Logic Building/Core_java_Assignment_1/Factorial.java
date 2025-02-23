

import java.util.Scanner;
class Factorial{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter Number");
int num = input.nextInt();

int fact = 1;

for(int i= num;i>=1;i--){
fact = fact*i;
}

System.out.println("Factorial of " + num + " is " + fact);
}
}