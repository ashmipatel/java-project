public class abstract_class 
{
    public static void main(String args[])
    {
        Derived d1=new Derived();
        d1.fun();

    }
    
}

abstract class  base
{
    base()
    {
        System.out.println("base constructor call");
    }
     abstract void fun();
}
class Derived extends base 
{
    Derived()
    {
        System.out.println("Derived constructor call");
    }
    void fun()
        {
            System.out.println("Derived fun() call");

        }
    

}