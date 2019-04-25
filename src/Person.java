public class Person {

    private Wallet myWallet;

    /*Person(Double initialAmt){
        this.myWallet = new Wallet(initialAmt);
    }*/

    Person(Wallet myWallet)
    {
        this.myWallet=myWallet;
    }

    public void addWallet(Double money)
    {

        myWallet.putMoney(money);

    }

    public void removeWallet(Double money)
    {
        myWallet.takeMoney(money);
    }
}
