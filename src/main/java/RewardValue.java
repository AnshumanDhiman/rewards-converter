public class RewardValue {
    double cash_value;
    double miles_value;

    public RewardValue(double cashValue) {
        cash_value = cashValue;
        miles_value = cashValue/0.0035;
    }

    public RewardValue(int mileValue) {
        miles_value = mileValue;
        cash_value = mileValue*0.0035;
    }

    public double getCashValue() {
        return cash_value;
    }

    public double getMilesValue() {
        return miles_value;
    }


}
