package string;

public class MakePalindromeString {

    public static void main(String[] args) {
        String input = "madam"; // Test string
        String result = makePalindrome(input);
        System.out.println("Original String: " + input);
        System.out.println("Palindrome with prefix: " + result);

    }

    private static String makePalindrome(String input) {
        String reversed= new StringBuilder(input).reverse().toString();
      //  System.out.println("Reversed is "+reversed);
        for(int i=0; i<input.length();i++)
        {
           if(input.startsWith(reversed.substring(i)))
           {
               return reversed.substring(0,i)+input;
           }   
        }
       return reversed+input;
    }
}
