public class USD extends Coin {
    final double value = 3.52;

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public double calculate(double arg) {
        double amount = getValue();
        arg = arg*amount;
        return arg;
    }
}