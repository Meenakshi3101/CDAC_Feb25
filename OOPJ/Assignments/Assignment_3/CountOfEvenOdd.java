import java.util.Scanner;

class CountOfEvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

      
        int arr[] = new int[n];

       
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int evenCount = 0 , oddCount = 0;
     
        for(int i = 0; i < arr.length; i++){
        if(n % 2 == 0){
            evenCount++;
        } else {
        oddCount++;
		}
		}
 System.out.println("Even numbers count is: " + evenCount);
 System.out.println("Odd numbers count is: " + oddCount );
}
}