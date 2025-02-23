

import java.util.*;
class Table{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);

System.out.println("Enter Number : ");
int num = obj.nextInt();

System.out.println("Table");

for(int i=1; i<=12; i++){
System.out.println(num + "*"+ i + "=" + num*i);
}
}
}
