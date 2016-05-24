import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Line {
	
	static void count(){
		 try
		   {
		        File myFile = new File("IC.html");
		        FileInputStream fIn = new FileInputStream(myFile);
		        BufferedReader myReader = new BufferedReader(
		                new InputStreamReader(fIn));
		        
		        String bigWord = "";
		        int i=0;
		        int max=0;
		        int maxLine=0;
		        
		        while ((bigWord=myReader.readLine()) != null) {            
		            i++;            
	                if(bigWord.length() > maxLine){            	
	                    max=i;
	                    maxLine=bigWord.length();
	                }
		        }
		        System.out.println("biggest line: "+max+"\t Lenght: "+maxLine);
		   }
		   catch (Exception e) 
		   {
			   System.out.println(e.getMessage());
		   }
	}

	public static void main(String[] args){
		Line.count();
	}
	
   
}
