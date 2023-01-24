

import java.util.ArrayList;

public class P10
{
   public static void main(String args[])
   {
	   
	   ArrayList<String> list1 = new ArrayList<String>();
	   list1.add("Rose");
       list1.add("Lotus");
       list1.add("Lily");
       System.out.println("Contents of list1 ::"+list1);

       ArrayList<String> list2 = new ArrayList<String>();
       list2.add("Pink");
       list2.add("Violet");
       list2.add("White");
       System.out.println("Contents of list2 ::"+list2);

       list1.addAll(list2);
       System.out.println("Contents of list1 after adding list2 to it ::"+list1);
   }
}
