
/* 4. Implement NumberFormatException
Write a Java program that tries to convert a non-numeric string to an integer using Integer.parseInt() and catches the NumberFormatException.*/



class demo4{
    public static void main(String[] args){
        System.out.println("Start");
    
        try{
         System.out.println("In try block");
        String str = "meenu";
        int number = Integer.parseInt(str);
        System.out.println("Number is: " + number);
        
        }catch(NumberFormatException e){
       
            System.out.println("Error: Invalid Number Format");
        }
        System.out.println("Finished");
        
        
    }
}