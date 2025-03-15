import java.util.Scanner;

class SecondLargestElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
		

		if(n<2){
		System.out.println("Array must have at least two elements");
		return;
		}
		
        
		int arr[] = new int[n];
               System.out.println("Enter the array elements:");
               for (int i = 0; i < arr.length; i++) {
               arr[i] = sc.nextInt();
               }
		
		
		//Second largest Element
		int largest = arr[0];
		int secondLargest = Integer.MIN_VALUE;
		

		for(int i=1;i<n;i++) {
		if(arr[i]>largest){
		secondLargest = largest;
		largest = arr[i];
		} else if (arr[i] > secondLargest &&arr[i] != largest){
		secondLargest = arr[i];
		}
		}

		
		
                //PRINT VALUES
		
		if(secondLargest == Integer.MIN_VALUE){
		System.out.print("No secondLargest element found");
		} else {
		System.out.print("SecondLargesr element is: " + secondLargest);
		
		}
		}
		}
		
		
		
		
		
