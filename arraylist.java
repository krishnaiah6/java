import java.util.*;
public class arraylist {
    public static void main(String[] args) {
    //int[] arr=new int[5];
    int[] arr={10,20,30,40};
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
    ArrayList<Integer> al=new ArrayList<>();
    al.add(10);
    al.add(20);
    al.add(30);
    System.out.println(al);
    al.remove(0);
    System.out.println(al);
    al.add(40);
    System.out.println(al);
    al.set(0,90);
    System.out.println(al);
    System.out.println(al.get(0));
    }
}