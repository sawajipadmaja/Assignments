
import java.util.Scanner;

public class P16 
{

    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter No.:");
        int num = sc.nextInt();
        for(int i = 1; i <= 10; i++)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}