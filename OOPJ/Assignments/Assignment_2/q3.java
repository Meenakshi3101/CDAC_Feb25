public class q3 {

    public static void main(String[] args) {
        int num = 5664; 
        int sum = 0;
        int temp = num; 

        while (temp != 0) {
            int digit = temp % 10; 
            sum += digit;          
            temp /= 10;       
        }

        System.out.println("Sum of digits of " + num + " is: " + sum);
    }
}