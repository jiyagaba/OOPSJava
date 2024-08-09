public class Constructor {
    public static void main(String[]args)
    {
        Student s1=new Student("Jiya",20);
        System.out.println("Roll number"+s1.rollnum);
    }
    
}
class Student
{
    String name;
    int rollnum;
    //function
    Student()
    {
      System.out.println("Default constructor "); 
    }
    Student(String name,int rollnum)
    {
        this.name=name;
        this.rollnum=rollnum;
    }
}
