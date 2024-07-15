public class empdata
{
    int id;
    String name;
    long salary;

    public void getdata()
    {
       id=101;
       name="xyz";
       salary=100000;

    }
    public void display()
        {
            System.out.println("id="+id);
            System.out.println("name="+name);
            System.out.println("salary="+salary);
        }

        public static void main (String[] args)
        {
            empdata e1=new empdata();
            e1.getdata();
            e1.display();
        }
    


    
}
