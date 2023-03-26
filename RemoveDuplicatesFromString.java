//Removing Duplicates from String

import java.util.*;
public class RemoveDuplicatesFromString 
{
    static void removeDuplicates(char[] str, int length)
    {
        int index=0;

        for(int i=0; i<length; i++)
        {
            //Check whether str[i] is present
            int j;
            for(j=0; j<i; j++)
            {
                if(str[i]==str[j])
                {
                    break;
                }
            }
            //If the character is not Present
            if(i==j)
            {
                str[index++]=str[i];
            }
        }
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));
    }
    //this is main method
    public static void main(String[] args)
    {
        String string="iNeuron is the Best";
        //Converting length of the character array

        char[] str=string.toCharArray();

        //Calculating length of the character array
        int len=str.length;

        removeDuplicates(str, len);

    }    
}
