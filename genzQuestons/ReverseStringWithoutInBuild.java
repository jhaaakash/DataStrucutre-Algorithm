public class ReverseStringWithoutInBuild {
   
    public static void main(String[] args) {
        System.out.println("File is ok");

        String input= "Jhaaakash";
        System.out.println("Input is"+input);
        char[] chars = input.toCharArray();
        int left=0;
        int right=chars.length-1;
        while(left < right){
            char temp= chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        System.out.println( new String(chars));

    }
}
