package ValidPalindrome;

import java.util.ArrayList;
import java.util.List;

public class ValidPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("racecar"));
	}
	
	  public static boolean isPalindrome(String s) {

	        String lower = s.toLowerCase();
	        List<Character> array = new ArrayList<>();

	        for (char c : lower.toCharArray()){ 
	            int ascii = (int) c;

	            if(ascii >= 32 && ascii <= 47) continue;
	            if(ascii >= 58 && ascii <= 64) continue;
	            if(ascii >= 91 && ascii <= 96) continue;
	            if(ascii >= 123 && ascii <= 126) continue;

	            array.add(c);
	        }
	        
	        int left = 0;
	        int right = array.size() - 1;

	        while(left < right){
	            if (array.get(left) != array.get(right)) return false;

	            if (array.get(left) == array.get(right)){
	                left += 1;
	                right -= 1;
	            }
	        }
	        return true;
	    }
}
