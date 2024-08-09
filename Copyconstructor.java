public class Copyconstructor {
    public static void main(String[]args)
    {
        Student s1=new Student();
        s1.name="Jiya";
        s1.roll=456;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        //Now student one will forgot it's password
        Student s2=new Student(s1);
        s2.password="xyz";
        //Already copied so there is no changes but later on this change will come but initally not come
        s1.marks[2]=100; 
        for(int i=0;i<3;i++)
        {
            System.out.print(s2.marks[i]+" ");
        }
        System.out.println();
        //Changing marks of s1
        
        for(int i=0;i<3;i++)
        {
            System.out.print(s2.marks[i]+" ");
        }
        

    }
    
}
class Student
{
    String name;
    int roll;
    String password;
    int marks[];
    //Copy constructor
    Student(Student s1)
    {
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        //in this this.marks:refence of array copied
        this.marks=s1.marks;
        
    }
    Student()
    {
        marks=new int[3];
        System.out.println("Constructor is called");
    }
    Student(String name)
    {
        marks=new int[3];
        this.name=name;
    }
    Student(int roll)
    {
        marks=new int[3];
        this.roll=roll;
    }
}
