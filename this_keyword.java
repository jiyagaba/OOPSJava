public class this_keyword {
    int val;
    String str;

    public this_keyword getClassObj(){  //using this to return the current local object instance
        return this;
    }

    public void printDetails(this_keyword obj){
        System.out.println("val: " + "Name: " + str);
    }

    public void pritn(){
        this.printDetails(this);
    }

    public static void main(String[] args) {
        this_keyword obj = new this_keyword();
        obj.getClassObj();
    }
}

