import java.util.*;
class A
{
    public int x,y,z;
    A()
    {
        System.out.println("Welcome to JAVA");
    }
    A(int n,int m,int o)
    {
        x=n;
        y=m;
        z=o;
    }
    public void show()
    {
        System.out.println("x="+x+" y="+y+" z="+z);
    }
}
class Solution
{
    public static void main(String[] agrs)
    {   A a = new A();
        A a1 = new A(4,7,9);
        a1.show();
    }
}
