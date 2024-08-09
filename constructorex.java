public class constructorex {
    int a;
    //explicitly defalut constructor
    public constructorex()
    {
        System.out.println("Construcotr called");
    }
    public constructorex(int a)
    {
        this.a=a;
        System.out.println("Construcotr called");
    }
    public static void main(String[]args)
    {
        //constructorex obj1=new constructorex();
        //Parametrized constructor(Construcotr with one or more arguments)
        constructorex obj2=new constructorex(6);
        System.out.println(obj2.a);
        


    }
    
}
