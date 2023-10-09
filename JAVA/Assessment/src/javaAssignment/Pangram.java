package javaAssignment;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
};
     char sentance[]=new GetInput().input().toLowerCase().toCharArray();
     int pangram=0;
     int count=0;
     for(char alpha: arr) {
    	 for(char sentanceLetter : sentance) {
    		 if(sentanceLetter!=alpha) {
    			 pangram++;
    		 }
    		
    	 }
    	 if(pangram ==0) {
			 count++;
		 }
     }
     if(count==0) {
    	 System.out.println("Given word is a pangram");
     }
     else {
    	 System.out.println("Given word is not a pangram");
     }
	}

}

class GetInput {
	Scanner sc= new Scanner(System.in);
	public  String input() {	
		String sentence=sc.nextLine();
		return sentence;
	}
}
