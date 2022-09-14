public class aoop1 {
    public static void main(String[] args) {
        try{
            int a=5;
            int b=0;
            int c=a/b;

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        try{
            int [] arr=new int[3];
            arr[5]=100;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        try{
            String test=null;
            System.out.println(test.charAt(0));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
