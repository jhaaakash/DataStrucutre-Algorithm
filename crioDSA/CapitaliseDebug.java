package crioDSA;

import java.util.Scanner;

class CapitaliseDebug {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();

            char[] words= str.toCharArray();

        for (int i = 0; i < words.length; i++) {

            char ch = str.charAt(i);
             if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);              
            }
                 
            result.append(ch);
        }
        System.out.println(result.toString());
    }
}
