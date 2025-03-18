
/* 3. Implement ArrayIndexOutOfBoundsException
Create an array of 5 elements and try to access an index that does not exist (e.g., index 10). 
Handle the exception properly. */


class demo3{
    public static void main(String[] args){
        System.out.println("Start");
        int arr[] = {1,2,3,4,5,6};
        
         
        try{
        System.out.println("In try block");
        System.out.println(arr[9]);
        
        }catch(ArrayIndexOutOfBoundsException e){
       
            System.out.println("Not in array");
        }
        System.out.println("Finished");
        
        
    }
}