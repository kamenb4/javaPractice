public class IndividualBusinessman extends Client {
    @Override
    protected void put(double amountToPut) {
        if (amountToPut < 1000.0) super.put(amountToPut - amountToPut / 100.0);
        else super.put(amountToPut - amountToPut / 200.0);
    }
}
