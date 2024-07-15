import java.util.Scanner;

public class StringRe {

    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String s1=sn.nextLine();
        int n=s1.length();
        char[] charArray= s1.toCharArray();
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(" "+charArray[i]);
        }
    }
    
}

