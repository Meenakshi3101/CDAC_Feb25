import java.util.Scanner;

class Duplicates_From_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int num = sc.nextInt();

        
        if (num <= 0) {
            System.out.println("Array must have at least one element.");
            sc.close();
            return;
        }

        int arr[] = new int[num]; 

   
        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        
        int uniqueIndex = 0; 
        for (int j = 1; j < num; j++) { 
            if (arr[j] != arr[uniqueIndex]) { 
                uniqueIndex++; 
                arr[uniqueIndex] = arr[j];
            }
        }

       
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i <= uniqueIndex; i++) { 
            System.out.print(arr[i] + " ");
        }

     
    }
}
