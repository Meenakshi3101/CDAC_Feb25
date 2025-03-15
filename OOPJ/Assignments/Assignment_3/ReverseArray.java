import java.util.Scanner;


class ReverseArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

      
        int arr[] = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
		
		
      //int num = arr.length;
      int start = 0; int end= n-1; // Reverse Array
		
		
		
        while(start<end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
		}
		
		System.out.println("Reversed Array elements are");
		
		for(int i=0;i<arr.length;i++){
		System.out.println(arr[i] + " ");
		}
		}
		}
		
		
		