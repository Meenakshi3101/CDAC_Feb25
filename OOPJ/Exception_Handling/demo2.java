
/* 2. Implement ArithmeticException
Write a Java program that performs division by zero and catches the ArithmeticException.*/



class demo2{
    public static void main(String[] args){
        System.out.println("Start");
         
        try{
        System.out.println("In try block");
        int a = 200;
        int result = a/0;
        System.out.println(result);
        
      }catch(ArithmeticException e){
            System.out.println("cannot divide by 0");
        }
        System.out.println("Finished");
        
        
    }
}
