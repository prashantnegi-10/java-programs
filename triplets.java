import java.util.*;
class Solution
{
    public static void main(String[] agrs)
    {
        int []arr={1,5,3,2,6,3};
        int l=arr.length;
        Solution s=new Solution();
       int total=s.count(arr,l);
       System.out.println("number of triplets are "+total);
    }
    int count(int arr[],int l)
    {  int c=0,sum=0;
        for(int i=0;i<l-1;i++)
        {  
            for(int j=i+1;j<l;j++)
            {   sum=arr[i]+arr[j];
              for(int k=0;k<l;k++)
              {
                  if(sum==arr[k])
                  {
                      c++;
                  }
              }
                
            }
        }
         return c;
}
}
