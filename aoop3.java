import java.util.Scanner;

public class aoop3 {
    public static void main(String[] args) throws Exception {
        String test;
        Scanner sc=new Scanner(System.in);
        test=sc.next();
        if(!test.contains("SDMCET"))
        {
            throw new SubStringNotFoundException();
        }
    }
}
class SubStringNotFoundException extends Exception{
    @Override
    public String toString() {
        return "Substring SDMCET not found";
    }
}
