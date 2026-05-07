package PalindromeNumber;

public class PalindromeNumber {
	public static void main(String []args) {
		System.out.println(isPalindrome(221)); // false
		System.out.println(isPalindrome(212)); // true

	}
	
	 public static boolean isPalindrome(int x) {

	        if (x < 0) return false;
	        
	        String numberString = String.valueOf(x);
	        int left = 0;
	        int right = numberString.length() - 1;
	        char[] array = numberString.toCharArray();

	        while(left < right){
	            if (array[left] != array[right]) {
	                return false;
	            }
	            if (array[left] == array[right]){
	                left += 1;
	                right -= 1;
	            }
	        }
	        return true;
	    }
}
