//using extending Threadd class
public class thread1 extends Thread
{
    public void run()
    {
        System.out.println("ASHMI");

    }

    public static void main(String args[])
    {
        thread1 t1= new thread1();
        t1.start();
    }

}