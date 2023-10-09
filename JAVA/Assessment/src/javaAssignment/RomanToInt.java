package javaAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInt {

	static Scanner sc= new Scanner(System.in);
	  
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Give any romanNumeral");
		String romanNumeral =sc.nextLine();
	        int integerEquivalent =Convertor.romanToInt(romanNumeral);
	        System.out.println("The integer equivalent of " + romanNumeral + " is: " + integerEquivalent);
	    
	}

}
class Convertor {
	    public static int romanToInt(String s) {
	        Map<Character, Integer> romanNumerals = new HashMap<>();
	        romanNumerals.put('I', 1);
	        romanNumerals.put('V', 5);
	        romanNumerals.put('X', 10);
	        romanNumerals.put('L', 50);
	        romanNumerals.put('C', 100);
	        romanNumerals.put('D', 500);
	        romanNumerals.put('M', 1000);
	        
	        int result = 0;
	        int prevValue = 0;
	        
	        for (int i = s.length() - 1; i >= 0; i--) {
	            int currentValue = romanNumerals.get(s.charAt(i));
	            if (currentValue < prevValue) {
	                result -= currentValue;
	            } else {
	                result += currentValue;
	            }
	            prevValue = currentValue;
	        }
	        
	        return result;
	    }

	   
}