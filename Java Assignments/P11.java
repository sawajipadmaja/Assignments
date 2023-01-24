
import java.util.*;

public class P11
{	
    public static void main(String[] args) 
    {
          
        List<String> l1 = new ArrayList<>();  
        l1.add("Pink");  
        l1.add("Purple");  
        l1.add("White");  
        l1.add("Blue");  
        l1.add("Yellow");  
        
        System.out.println("Converting ArrayList to Array" ); 
        
        String[] item = l1.toArray(new String[l1.size()]);  
        for(String s : item)
        {  
            System.out.println(s);  
        }  
        
        System.out.println("Converting Array to ArrayList" );
        
        List<String>l2 = new ArrayList<>();  
        l2 =  Arrays.asList(item);  
        System.out.println(l2);  
    }  
}  
