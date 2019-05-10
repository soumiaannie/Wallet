

public class Person {

    private String name;
    private Wallet googleWallet;
    private Wallet amazonWallet;


    Person(String name) {
        this.name = name;
    }

    public void addWallet(WalletType walletType, Double walletAmount) {
        if (walletType == walletType.GOOGLE_PAY) {
            googleWallet = new GooglePayWallet(walletAmount);
            System.out.println("New Google Pay Wallet Created");
            googleWallet.displayWalletBalance();
        } else if (walletType == walletType.AMAZON) {
            amazonWallet = new AmazonWallet(walletAmount);
            System.out.println("New Amazon Wallet Created");
            amazonWallet.displayWalletBalance();

        }


    }

    public void addMoneyToWallet(Double money, WalletType walletType) {

        if ((walletType == WalletType.GOOGLE_PAY)) {
            if ((googleWallet == null)) {
                System.out.println("User does not have the " + walletType + ". Money cannot be added to non existing wallet");
            } else {
                googleWallet.addMoney(money);
                System.out.println("Money added to GooglePay Wallet");
            }
        } else if (walletType == WalletType.AMAZON) {
            if ((amazonWallet == null)) {
                System.out.println("User does not have the " + walletType + ". Money cannot be added to non existing wallet");
            } else {
                amazonWallet.addMoney(money);
                System.out.println("Money added to Amazon wallet");
            }


        }
    }


    public void removeMoneyFromWallet(Double money, WalletType walletType) {
        if ((walletType == WalletType.GOOGLE_PAY)) {
            if ((googleWallet == null)) {
                System.out.println("User does not have the " + walletType + ". Money cannot be deducted from non existing wallet");
            } else {
                googleWallet.deductMoney(money);
                System.out.println("Money deducted from GooglePay Wallet");
            }
        } else if (walletType == WalletType.AMAZON) {
            if ((amazonWallet == null)) {
                System.out.println("User does not have the " + walletType + ". Money cannot be deducted from non existing wallet");
            } else {
                amazonWallet.deductMoney(money);
                System.out.println("Money deducted from Amazon Wallet");
            }

        }
    }

        public void performTransaction (Double transactionAmount, TransactionType transactionType, WalletType walletType)

        {
            if ((walletType == WalletType.GOOGLE_PAY)) {
                if ((googleWallet == null)) {
                    System.out.println("User does not have the " + walletType + ". Transaction cannot be done using non existing account");
                } else {
                    googleWallet.doTransaction(transactionAmount, transactionType);
                }
            } else if (walletType == WalletType.AMAZON) {
                if ((amazonWallet == null)) {
                    System.out.println("User does not have the " + walletType + ". Transaction cannot be done using non existing wallet");
                } else {
                    amazonWallet.doTransaction(transactionAmount, transactionType);
                }

            }

    }
}
