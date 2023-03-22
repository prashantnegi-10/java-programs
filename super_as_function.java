import java.util.*;
class A
{  int m,n;
    A()
    {
        System.out.println("A is here ");
    }
    A(int x, int y)
    {
        m=x;
        n=y;
        System.out.println("m="+m+" n="+n);
    }
    
}
class B extends A
{  int c,d;
    B()
    {
        System.out.println("B is here");
    }
    B(int a,int b)
    { super(11,9);
        c=a;
    d=b;
    System.out.println("c="+c+" d="+d);
        
    }
}
class Solution
{
    public static void main(String[] agrs)
    {
        B b  = new B();
        B b1 =  new B(3,5);
    }
}
