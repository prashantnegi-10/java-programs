import java.util.*;
class Solution
{
    public static void main(String[] agrs)
    {
        int []arr={-1,-9,-6,-8,-2,-3};
        int l=arr.length;
        Solution s=new Solution();
       int total=s.maxsum(arr,l);
       System.out.println("max total to sub array is "+total);
    }
    int maxsum(int arr[],int l)
    {  int max=Integer.MIN_VALUE;
        for(int i=0;i<l-1;i++)
        {  int current=0;
            for(int j=i;j<l;j++)
            {  current+=arr[j];
              if(current>max)
              max=current;
            }
        }
         return max;
}
}
