import java.util.*;
interface Icolour
{
    public void col();
}
interface Ishape extends Icolour
{
    public void area();
    public void volume();
}
class Square implements Ishape
{  int x=10;
    public void area()
    {
        System.out.println("area="+x*x);
    }
    public void volume()
    {
        System.out.println("volume"+x*x*x);
    }
    public void col()
    {
        System.out.println("colour is red");
    }
}
class Solution
{
    public static void main(String[] args)
    {
        Square s=new Square();
        s.area();
        s.volume();
        s.col();
    }
}
