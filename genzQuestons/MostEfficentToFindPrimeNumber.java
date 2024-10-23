public class MostEfficentToFindPrimeNumber {
    public static void main(String[] args) {
        
        int number =23;
       boolean check= isPrimeNumber(number);
       if(check==true)
       {
        System.out.println("Number is Prime");
       }
       else
       {
        System.out.println("number is not prime");
       }  
    }

    private static boolean isPrimeNumber(int number) {
        if(number<=1){
            return false;
        }
        if(number<=3)
        {
            return true;
        }
        if(number%2==0 || number % 3 ==0)
        {
            return false;
        }
        for(int i=5;i<=number; i+=6)
        {
            if(number % i ==0 || number % (i+2)==0)
            {
                return false;
            }
        }
        return true;

    }
}
