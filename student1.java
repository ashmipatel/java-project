public class student1 
{
    int rollno;
    String name;
    float percentage;
    String grade;
    public void display()
{
    System.out.println("rollno="+rollno);
    System.out.println("name="+name);
    System.out.println("percentage="+percentage);
    System.out.println("grade="+grade);
    
}
public static void main(String[] args)
{
    student1 s1=new student1();
    s1.rollno=101;
    s1.name="ashmi";
    s1.percentage=90;
    s1.grade="a";
    s1.display();
}

    
}
