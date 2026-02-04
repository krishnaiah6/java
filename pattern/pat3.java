package pattern;
import java.util.*;
public class pat3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=n-i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
             for(int m=0;m<n-i-1;m++)
            {
                System.out.print(" ");
            }
            for(int l=0;l<=i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
