package addDigits;

public class addDigits {
	
	public static void main(String[] args) {
		System.out.println(addDigits(444));
	}
	
	public static int addDigits(int num) {

        int soma = 0;
        String str = String.valueOf(num);
        
        if (str.length() == 1){
            return num;
        }

        for (char c : str.toCharArray()){
            int num0 =  Character.getNumericValue(c);
            soma += num0;
        }
        
        String str1 = String.valueOf(soma);
        soma = 0;
        for(char c1 : str1.toCharArray()){
            int num1 = Character.getNumericValue(c1);
            soma += num1;
        }

        return addDigits(soma);
  }  
}
