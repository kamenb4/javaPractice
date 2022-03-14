import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends BankAccount {

    private LocalDate lastIncome;

    private int periodBetween;

    @Override
    protected void put(double amountToPut) {
        super.put(amountToPut);
        this.lastIncome = LocalDate.now();
        this.periodBetween = 1;
    }

    @Override
    protected void take(double amountToTake) {
        boolean diff = ChronoUnit.MONTHS.between(lastIncome, LocalDate.now()) >= periodBetween;
        if (diff) super.take(amountToTake);
    }
}
