
/* 1. Implement NullPointerException
Write a Java program where you initialize a String as null and try to call the .length() method on it. 
Handle the exception using a try-catch block. */



class demo1{
    public static void main(String[] args){
        System.out.println("Start");
         
        try{
        System.out.println("In try block");
			
        String s1 = null;
        int length = s1.length();
        System.out.println("Length of string is : " + length);
       // System.out.println("In try block");
    
        }catch(NullPointerException e){
            System.out.println("In catch block");
        }
        System.out.println("Finished");
        
        
    }
}