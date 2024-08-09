public class Accessmodifier {
    public static void main(String args[])
    {
        BankAccount myAcc=new BankAccount();
        myAcc.username="Jiyagaba";
        //Now we can't change password
        //myAcc.password="abcs";
        myAcc.setpassword("abcsedfr");
        myAcc.printpassword();

    }
    
}
class BankAccount
{
    //default String username;
    public String username;
    private String password;
    public void setpassword(String pwd)
    {
        password=pwd;
    }
    public void printpassword()
    {
        System.out.println(password);
    }


}