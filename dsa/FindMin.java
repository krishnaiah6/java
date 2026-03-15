package dsa;

public class FindMin {
    public static void main(String[] args) {
        int[] arr={12,24,-3,-7,29,48};
        System.out.println(min(arr));
    }
    static int min(int[] arr)
    {
        int mini=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<mini)
            {
                mini=arr[i];
            }
        }
        return mini;

    }
   
}
