import java.util.*;
public class arraylist
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(10);
        for(int i=0;i<10;i++)
        {
            list.add(sc.nextInt());
        }
        System.out.println(list);
        list.remove(9);
        System.out.println(list);
        list.set(0,0 );
        System.out.println(list);
        System.out.println(list.contains(0));
    }
}