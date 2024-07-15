public class checkgarbage
 {
 public void finalize()
 {
    System.out.println("object is garbage collected");
 }
 public static void main(String args[])
 {
    checkgarbage s1=new checkgarbage();
    checkgarbage s2=new checkgarbage();
    s1=null;
    s2=null;
    System.gc();
 }


    
}
