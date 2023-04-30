import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class Class {

	public static void main(String[] args) throws java.io.IOException  {
		 File file = new java.io.File("/Users/kerenperez/Downloads/test.txt");
		 Scanner scan = new Scanner(System.in);
		 Boolean found = false;
		   while(true) {
			   found = false;
			   System.out.println("Enter student id: ");
			
			   String input = scan.next();
			   if(input.equals("-1")) {
				   
			   }
			   Scanner filescan = new Scanner(file);
			   while(filescan.hasNextLine()) {
				  String line = filescan.nextLine();
				  String[] lineSplit = line.split(",");
				
				  if(lineSplit.length!=3) {
					  continue;
				  }
				  String id=lineSplit[0];
				  String name=lineSplit[1];
				  String dept=lineSplit[2];
				 
				  if(id.equals(input)) {
					  System.out.println(name);
					  System.out.println(dept);
					  found = true;
					  break;
				  }
			   }
			   if(!found) {
				   System.out.println("id not found");  
			   }
			  
		   }   
		  }
}