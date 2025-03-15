import java.util.Scanner;

class SumAndAvg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
		
		if (n <= 0) {
            System.out.println("Array must have at least one element.");
          
        }


       int arr[] = new int[n];

         int sum =0;
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
		
            arr[i] = sc.nextInt();
			sum += arr[i];
        }
		
		
	     double average = (double) sum / n;

        
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
		
		}
		}
		
		