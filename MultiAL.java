import java.util.Scanner;
import java.util.*;
public class MultiAL {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        //intialiazation
        for(int i=0;i<3;i++)
        {
            arr.add(new ArrayList<>());
        }
        //declaration
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr.get(i).add(sc.nextInt());
            }
        }
        //printing
        System.out.println(arr);
    }
    
}
