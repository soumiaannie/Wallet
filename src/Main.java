public class Main {
    public static void main(String[] args)


    {

        //Wallet wallet = new GooglePayWallet(1000.0);
        Person person1 = new Person("Soumia");
        person1.addWallet(WalletType.AMAZON,2000.0);
        person1.addWallet(WalletType.GOOGLE_PAY, 5000.0);
        person1.addMoneyToWallet(500.0, WalletType.GOOGLE_PAY);
        person1.removeMoneyFromWallet(700.0, WalletType.AMAZON);
        person1.performTransaction(3000.0, TransactionType.BILL_PAYMENT, WalletType.AMAZON);
        person1.performTransaction(1000.0, TransactionType.BILL_PAYMENT, WalletType.AMAZON);


    }
}
