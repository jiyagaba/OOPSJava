public class Methodoveriding {
    public static void main(String[]args)
    {
        Deer d=new Deer();
        d.eat();
    }
    
}
class Animal
{
    public void eat()
    {
        System.out.println("Eats Anything");
    }
}
class Deer extends Animal
{
    public void eat()
    {
        System.out.println("Eats grass");
    }
}
