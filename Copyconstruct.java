public class Copyconstruct {
    private String name;
    private int age;
    private String address;
    public Copyconstruct(Copyconstruct obj)
    {
        this.name=obj.name;
        this.age=obj.age;
        this.address=obj.address;
    }
    public void setNmae(String name)
    {
        this.name=name;
    }   
}
