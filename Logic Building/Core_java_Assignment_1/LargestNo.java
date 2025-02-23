import java.util.*;
class LargestNo{
public static void main(String[] args){

Scanner obj = new Scanner(System.in);

System.out.println("Enter three numbers: ");
int num1 = obj.nextInt();
int num2 = obj.nextInt();
int num3 = obj.nextInt();


if(num1>num2 && num1>num3){
System.out.println("largest number is : " + num1);
}else if(num2>num1 && num2>num3){
System.out.println("largest number is : " + num2);
}else{
System.out.println("largest number is : " + num3);
}

}
}





