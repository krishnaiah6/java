package dsa;

public class Linearsearch {
    public static void main(String[] args) {
        int[] nums={22 ,33,34 ,35,79};
        int target=79;
        int ans=linear(nums,target);
        System.out.println(ans);
        // int ans2=linear2(nums,target);
        // System.out.println(ans2);
        boolean ans3=linear3(nums,target);
        System.out.println(ans3);
        
    }
static int linear(int arr[],int target)
{
if(arr.length==0)
{
    return -1;
}
    for(int i =0;i<arr.length;i++)
    {
        int element=arr[i];
        if(arr[i]==target)
        {
            return i;
        }
    }
    return -1;
}
// static int linear2(int arr[],int target)
// {
//     for(int element:arr)
//     {
//         if(element==target)
//         {
//             return element;
//         }
//     }
//     return -1;
// }
// }
static boolean linear3(int arr[],int target)
{
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==target)
        {
            return true;
        }
    }
    return false;
}
}


