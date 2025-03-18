
/* 7. Implement FileNotFoundException
Write a Java program that tries to open a file that does not exist using FileReader, and handle the FileNotFoundException.*/



import java.io.*;

class demo7{
	public static void main(String [] args)  {
		try{
		System.out.println("In Try Block");
		
		File f = new File("abc.txt");
		
		FileReader fr = new FileReader(f);
		
		}catch(FileNotFoundException e){
			System.out.println("File not found");
		}
		System.out.println("Finished");
		
	}
}







