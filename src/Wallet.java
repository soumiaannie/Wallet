public abstract class Wallet {
    protected Double walletAmount;
    protected String walletName;


    Wallet(Double walletAmount)
    {

        this.walletAmount=walletAmount;
    }

    public String getWalletName() {
        return walletName;
    }

    public double getwalletAmount()
    {
        return walletAmount;
    }

    public void addMoney(Double money)
    {
        walletAmount = walletAmount+money;
        //System.out.println("Money added to Wallet");
        this.displayWalletBalance();

    }

    public void deductMoney(Double money)
    {
        if (walletAmount >= money)
        {
            walletAmount = walletAmount-money;
            //System.out.println("Deducted money withdrwan from Wallet.");
            displayWalletBalance();

        }
        else
        System.out.println("This transaction cannot be done as there is not enough Money in the Wallet");
    }

    public void displayWalletBalance()
    {
        System.out.println("The current balance in the Wallet is " +walletAmount);
    }

    public  abstract void  doTransaction(Double transactionAmount, TransactionType transactionType);


}

