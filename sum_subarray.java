import java.util.*;
class Solution 
{
    
    public static void main(String[] agrs)
    {   Solution s=new Solution();
        int []arr={2,4,6,3,7};// new array[5];
        //arr[5]={2,4,6,3,7};
        int l=arr.length;
        System.out.println(s);
        int sum=16;
        s.subarray(arr,l,sum);
    }
    void subarray(int [] array,int length,int sum)
    {
        for(int i=0;i<length;i++)
        {  int total=0;
            for(int j=i;j<length;j++)
            {  total+=array[j];
              if(total==sum)
              {
                  System.out.println("sum is start from "+i+" to "+j);
                  return ;
              }
              if(total>sum)
              {
                  break;
              }
                
            }
        }
    }
}
