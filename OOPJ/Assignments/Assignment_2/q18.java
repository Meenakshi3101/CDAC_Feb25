import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the percentage: ");
        double percentage = sc.nextDouble();

        
        String result = (percentage >= 40) ? "Pass" : "Fail";

        System.out.println("Result: " + result);

        
    }
}