

import java.text.SimpleDateFormat;
import java.util.*;
 
public class P23 
{
    public static void main(String[] args) throws Exception
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a date in dd/mm/yyyy format: ");
        String strDate = sc.nextLine();
 
        Date date = new SimpleDateFormat("dd/mm/yyyy").parse(strDate);

        System.out.print(strDate + " " + date);
    }
}
