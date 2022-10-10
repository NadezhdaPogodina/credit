public class CreditPaymentService {
    public double calculate(double million, double months, double percent) {
        double sum = million;
        double term = months;
        double interest = (sum * percent) / 100;
        double allsum = sum + interest;
        double month = allsum / term;
        return month;


    }
}
