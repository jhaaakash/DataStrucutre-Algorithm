package crioDSA;

import java.util.Scanner;

/*
Sample Input 1
the quick Brown fox jumps over The lazy dog.
Sample Output 1
The Quick Brown Fox Jumps Over The Lazy Dog.
*/
public class Capitalise {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String captStr = capitalise(str);
        System.out.println(captStr);
    }

    static String capitalise(String str) {
        StringBuilder result = new StringBuilder(str.length());
        for(int i=0; i<str.length(); i++)
        {
            if((i==0 || str.charAt(i-1)==' ') && (str.charAt(i)>='a' && str.charAt(i)<='z') )
            {
                result.append((char) (str.charAt(i) - 32));
            }
            else
            {
                result.append(str.charAt(i));
            }
        }
            return result.toString();
    }
}
