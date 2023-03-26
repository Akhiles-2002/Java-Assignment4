//Print Duplicates Characters

public class PrintDuplicateCharacters 
{
    public static void main(String[] args)
    {
        String string="Good Morning";
        int count = 0;

        //converting given string to the character array
        char[] str = string.toCharArray();

        System.out.println("Duplicates Characters Are ");
        
        //count Each character present in the string  
        for(int i=0; i<str.length; i++)
        {
            for(int j=i+1; j<str.length; j++)
            {
                if(str[i] == str[j] && str[i] != ' ')
                {
                    count++;

                    //Set Str[i] to 0 to avoid Visited
                    str[j]='0';
                }
            }

            if(count>1 && str[i] != '0')
            {
                System.out.println(str[i]);
            }
        }

    }    
}
