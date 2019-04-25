public class Wallet {
    Double amount;

    Wallet(Double amount)
    {
        this.amount=amount;
    }

    public void putMoney(Double delta)
    {
        amount = amount+delta;
        System.out.println("Amount is " +amount);
    }

    public void takeMoney(Double rDelta)
    {
        if (amount >= rDelta)
        {
            amount = amount-rDelta;
            System.out.println("Deducted amount. Current balance is " +amount);

        }
        else
        System.out.println("Not enough Money");
    }
}

