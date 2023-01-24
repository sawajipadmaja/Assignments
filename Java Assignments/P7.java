

import java.util.Arrays;
import java.util.Scanner;

public class P7 
{
	public static void ChartoString()
	{
		char ch = 'p';
        String str = Character.toString(ch);
        System.out.println("The string is: " + str);
	}
	
	public static void StringtoChar()
	{
		String st = "India";

        char[] chars = st.toCharArray();
        System.out.println(Arrays.toString(chars));
	}
	
	public static void main(String args[])
	{
		P7.ChartoString();
		P7.StringtoChar();
	}
}
