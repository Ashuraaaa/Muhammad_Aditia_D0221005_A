import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner l=new Scanner(System.in);
        String s=l.next();
        System.out.println(getMD5(s));
        l.close();
    }
    public static String getMD5(String s)
    {
        StringBuffer sb=new StringBuffer();
        try
        {
            MessageDigest md=MessageDigest.getInstance("MD5");
            byte[] result=md.digest(s.getBytes());
            for(int i=0;i<result.length;i++)
            {
                String hex=Integer.toHexString(0xff & result[i]);
                if(hex.length()==1)
                sb.append('0');
                sb.append(hex);
            }
        }
        catch(NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        return sb.toString();
    }
    
}