public class BankAccount {

  double amount = 0;

  public double getAmount() {
    return amount;
  }

  public void put(double amountToPut) {
    if (amountToPut >= 0) amount += amountToPut;
  }

  public void take(double amountToTake) {
   if (amountToTake <= amount) amount -= amountToTake;
  }
}
