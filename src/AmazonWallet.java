public class AmazonWallet extends Wallet {
    double discountPercentage=0;
    double cashBack=0;
    AmazonWallet(Double walletAmount)
    {
        super(walletAmount);
        this.walletName="Amazon Wallet";

    }

    @Override
    public void doTransaction(Double transactionAmount, TransactionType transactionType) {

        if (transactionType==TransactionType.ONLINE_PAYMENT)
        {
            discountPercentage=5.0;
        }
        else if (transactionType==TransactionType.BILL_PAYMENT)
        {
            discountPercentage=10;
        }


        if (super.getwalletAmount() >= transactionAmount) {

            super.deductMoney(transactionAmount);

            if (discountPercentage==0)
            {
                System.out.println("This transaction does not have any Cashback service associated. Transaction Successful");
                super.displayWalletBalance();
            }
            else
            {
                cashBack=(transactionAmount-((transactionAmount*discountPercentage)/100));
                super.addMoney(cashBack);
                System.out.println("This transaction is having a cashback of " +discountPercentage+ "%. Cashback amount " +cashBack+ "is added to your wallet. Transaction Successful");
                super.displayWalletBalance();
            }

        }






    }
}
