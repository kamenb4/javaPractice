public class CardAccount extends BankAccount {
    @Override
    protected void take(double amountToTake) {
        super.take(amountToTake + amountToTake / 100.0);
    }
    // не забывайте, обращаться к методам и конструкторам родителя
    // необходимо используя super, например, super.put(10D);
}
