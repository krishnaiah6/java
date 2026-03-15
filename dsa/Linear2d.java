package dsa;
import java.util.*;
public class Linear2d {
    public static void main(String[] args) {
        int[][] arr={
            {12,34,38,56},
            {13,17,226},
            {4,10,23,17},
            {27,98}
        };
        int  target=226;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
        int maximum=max(arr);
        System.out.println(maximum);
    }
    static int[] search(int[][] arr,int target)
    {
        if(arr.length==0)
        {
            return new int[]{-1,-1};
        }
        for(int r=0;r<arr.length;r++)
        {
            for(int c=0;c<arr[r].length;c++)
            {
                if(arr[r][c]==target)
                {
                    return new int[]{r,c};
                }
            }
        }
        return new int[]{-1,-1};
    }
     static int max(int[][] arr)
    {
        int maxim=Integer.MIN_VALUE;
        for(int[] val:arr)
        {
            for(int ele:val)
          {
            if(ele>maxim)
            {
                maxim=ele;
            }
          }
    }
    return maxim;
}
}
