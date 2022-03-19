public class LegalPerson extends Client {
    @Override
    protected void take(double amountToTake) {
        super.take(amountToTake + amountToTake / 100.0);
    }
}
