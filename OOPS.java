public class OOPS {
    //executiin starts at main
    //public is access specifier
    //static 
    //void is return type
    //By convention out main function should be public and static
    public static void main(String[]args)
    {
        //Pen Object created called p1 
        Pen p1=new Pen();
        //with the help of dot operator we can use function and attributes
        p1.setcolour(("Blue"));
        System.out.println(p1.colour);
        p1.settip(5);
        System.out.println(p1.tip);
        p1.setcolour(("Yellow"));
        System.out.println(p1.colour);
        p1.colour="Yellow";
        System.out.println(p1.colour);
        
    }
    
}
class Pen
{
    //properties+function
    String colour;
    int tip;

    void setcolour(String newcolour)
    {
        colour=newcolour;
    }
    void settip(int newtip)
    {
        tip=newtip;
    }
}
class Student
{
    String name;
    int age;
    float percentage;

    void calculatepercentage(int phys,int chem,int math)
    {
        percentage=(phys+chem+math)/3;
    }

}
