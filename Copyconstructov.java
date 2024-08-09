public class Copyconstructov {
    public static void main(String[] args) {
        Copyconstructoverloading c1 = new Copyconstructoverloading("John", 30);
        Copyconstructoverloading c2 = new Copyconstructoverloading(c1);
        System.out.println(c2.getName());
    }
}

class Copyconstructoverloading {
    private String name;
    private int age;
    private String password;

    public Copyconstructoverloading() {}

    public Copyconstructoverloading(Copyconstructoverloading c1) {
        this.name = c1.getName();
        this.age = c1.getAge();
        this.password = c1.getPassword();
    }

    public Copyconstructoverloading(String name) {
        this.name = name;
    }

    public Copyconstructoverloading(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }
}