import java.util.Scanner;

public class aoop2 {
    public static void main(String[] args) throws Exception{
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if(isPrime(n))
        {
            System.out.println(n+ " Is a prime number ");
        } else if (n<0) {
            throw new negativeNumberNotAllowed();
        }
        else {
            throw new NumberNotPrimeException();
        }


    }
    static boolean isPrime(int n)
    {

        if (n <= 1)
            return false;


        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }


}
class negativeNumberNotAllowed extends Exception{
    @Override
    public String toString() {
        return "Negative number not allowed";
    }
}
class NumberNotPrimeException extends Exception{
    public String toString(){
        return "Not a prime number";

    }
}