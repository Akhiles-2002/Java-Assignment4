//Print Duplicate Characters 

import java.util.*;
public class PrintDuplicateCharacters1 
{
    public static void main(String[] args)
    {
        String str="Good Morning";

        char[] ch = str.toCharArray();

        for(int i=0;i<ch.length;i++)
        {
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    System.out.print(ch[j]+" ");
                }
            }
        }     
    }
   
}
