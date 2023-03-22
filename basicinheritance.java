import java.util.*;

class A
{
    public void show()
    {
        System.out.println("this is class A method ");
    }
}
class B extends A
{
    public void show1()
    {
        System.out.println("this is class B method");
    }
}
class C extends B 
{
    public void show2()
    {
        System.out.println("this class C method");
    }
}
class sol
{
    public static void main(String[] agrs)
{
    C c=new C();
    c.show();
    c.show1();
    c.show2();
}
}
