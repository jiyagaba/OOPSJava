public class ParameterizedConstructor {
    private String name;
    private int age;
    private String address;

    public ParameterizedConstructor(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        ParameterizedConstructor cons1 = new ParameterizedConstructor("Jiya", 20, "avcs");
        System.out.println(cons1.getName());
    }
}