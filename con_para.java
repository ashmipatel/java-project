public class con_para {
    int id;
    String name;
    public con_para(int i , String n)
    {
        id=i;
        name=n;
    }
    public void display()
    {
        System.out.println("id="+id);
        System.out.println("name="+name);
    }
    public static void main(String args[])
    {
        con_para c1=new con_para(i:489,n:"ashmi");
        c1.display();
    }
}
