public class Main {
    public static void main(String[] args)
    {
        //Wallet w = new Wallet(1000);
        //Person person = new Person(400.0);
        Person person=new Person(new Wallet(400.0));
        person.addWallet(100.0);
        person.removeWallet(600.0);


    }
}
