import java.util.Random;
import java.util.Scanner;
 
public class Main 
{
    static void permute(int[] a, int k) 
    {
        if (k == a.length) 
        {
            for (int i = 0; i < a.length; i++) 
            {
                System.out.print(" " + a[i] + " ");
            }
            System.out.println();
        } 
        else 
        {
            for (int i = k; i < a.length; i++) 
            {
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;
 
                permute(a, k + 1);
 
                temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
        }
    }
 
    public static void main(String args[]) 
    {
        Random random = new Random();
        int[] sequence = new int[4];
        
 
        for (int i = 0; i < 4; i++)
            sequence[i] = Math.abs(random.nextInt(10));
 
        System.out.println("The random numbers are : ");
        for (int i = 0; i < 4; i++)
            System.out.print(sequence[i] + " ");
 
        System.out.println("\nAll possible numbers are : ");
        permute(sequence, 0);
 
        
    }
}
