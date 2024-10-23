public class Swap2NumberWithoutExtra {
    public static void main(String[] args) {
        int a= 10;
        int b=20;

        System.out.println("before reversing the number "+ a +" " +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After reversing the number "+ a +" " +b);

    }
}
