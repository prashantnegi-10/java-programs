import java.util.*;
class A 
{
   public void show()
    {
        System.out.println("show method of class A");
    }
}
class B extends A
{
  public  void show()
  { super.show();
      System.out.println(" show method of class B");
  }
}
class C extends B
{
    public void show()
    { super.show();
        System.out.println("show method of C");
    }
}
class Solution
{
    public static void main(String[] agrs)
    {
        C c =new C();
        c.show();
    }
}
