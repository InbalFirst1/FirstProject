public class ILS extends Coin{
    final double value = 0.28;

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