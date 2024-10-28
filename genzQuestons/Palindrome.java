public class Palindrome {
    
    public static  void  isPalindrome(String abc)
    {
        int left=0; 
        int right=abc.length()-1;
        while (left<right) {
            if(abc.charAt(left)!=abc.charAt(right))
            {
                System.out.println("the given word is not palindrome"); 
                return;
            }
            left++;
            right--;
        }
        System.out.println("the given word is palindrome"); 
            }

            public static void main(String[] args) {
                String wordUnderTest="kamak";
                System.out.println("Hi Aakash how are you");
               isPalindrome(wordUnderTest);
               
            }

    }

