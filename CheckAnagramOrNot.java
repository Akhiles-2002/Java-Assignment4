//Check Anagram or Not
import java.util.*;
public class CheckAnagramOrNot 
{
    public static void main(String[] args)
    {
        String s1="Triangle";
        String s2="Integral";

        s1=s1.replace(" ","");
        s2=s2.replace(" ","");

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2))
        {
            System.out.println("It is an anagram");
        }
        else
        {
            System.out.println("It is not a anagram");
        }


    }   
}
