import java.io.*;

public class aoop4 {
    public static void main(String[] args) throws Exception {
        File f=new File("alphaet.txt");
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        FileOutputStream fos=new FileOutputStream("consonant.txt");
        int c=0;
        while((c=fr.read())!=-1)
        {
            char test= (char)c;
            System.out.println(test);
            try {
                if (test == 'a'|| test=='e'|| test=='i'||test=='o' || test=='u') {
                    throw new vowelNotAllowed();

                }
                else
                    fos.write(test);
            }
            catch (vowelNotAllowed e)
            {
                System.out.println(e);
                continue;
            }


        }

    }
}

class vowelNotAllowed extends Exception{
    @Override
    public String toString() {
        return "No vowels allowed";
    }
}