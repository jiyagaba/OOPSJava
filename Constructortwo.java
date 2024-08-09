public class Constructortwo {
    public static void main(String[]args)
    {
        Student s1=new Student();
        Student s2=new Student("Jiya",31);
        System.out.println(s1.name);//null
        System.out.println(s2.name);
    }
    
}
class Student
{
    String name;
    int rollnum;
    //function
    Student()
    {
      System.out.println("Non parametrized construcotor "); 
    }
    Student(String name,int rollnum)
    {
        System.out.println("parametrized construcotor "); 
        this.name=name;
        this.rollnum=rollnum;
    }
}
