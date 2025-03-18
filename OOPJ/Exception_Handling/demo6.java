
/* 6. Implement IOException
Write a Java program that attempts to read from a file that does not exist and catches IOException.*/

import java.io.*;
class demo6{
	public static void main(String [] args){
	
	
	    try{
			 
        System.out.println("In try block");
		
		System.out.println("Enter any character: ");
		int j = System.in.read();
		System.out.println("Enter char = " +(char)j);
		}catch(IOException e) {
            System.out.println("Error: Input/Output exception occurred.");
		
	}
	 
       System.out.println("Finished");
}
}


