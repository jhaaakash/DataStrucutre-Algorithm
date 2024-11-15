public class FibonacciUsingRecursion {

    private static int fibonacci(int n) {
        
        if(n<1)
        {
            return 0;
        }
        if(n==1)
        {
            return 1 ;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
        
    }

    
    public static void main(String[] args) {
        int numberInput=10;
        int output= fibonacci(numberInput);
        System.out.println(output);
    }

   
}
