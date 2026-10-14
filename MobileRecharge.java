public class MobileRecharge {
    


    public static double calculateRecharge(double a) {
        return a * 1.18;
    }

    public static double calculateDataPack(double b) {
        return b * 1.18;
    }

    public static double calculateSMSPack(double c) {
        return c * 1.18;
    }

    public static double calculateCallingPack(double d) {
        return d * 1.18;
    }

    public static double calculateServiceFee(double e) {
        return e * 1.18;
    }

    public static double totalBill(
            double a, double b, double c,
            double d, double e) {

        return calculateRecharge(a)
             + calculateDataPack(b)
             + calculateSMSPack(c)
             + calculateCallingPack(d)
             + calculateServiceFee(e);
    }

    public static double calculateDiscountedBill(
            double a, double b, double c,
            double d, double e) {

        double total = totalBill(a, b, c, d, e);
        double discount = total * 0.10;

        return total - discount;
    }

    public static void main(String[] args) {

        double a = 299;
        double b = 99;
        double c = 49;
        double d = 79;
        double e = 20;

        double recharge = calculateRecharge(a);
        double data = calculateDataPack(b);
        double sms = calculateSMSPack(c);
        double calling = calculateCallingPack(d);
        double service = calculateServiceFee(e);

        double total = totalBill(a, b, c, d, e);
        double payable = calculateDiscountedBill(a, b, c, d, e);
        double discount = total - payable;

        System.out.printf("Recharge Plan: Rs. %.2f%n", recharge);
        System.out.printf("Data Pack: Rs. %.2f%n", data);
        System.out.printf("SMS Pack: Rs. %.2f%n", sms);
        System.out.printf("Calling Pack: Rs. %.2f%n", calling);
        System.out.printf("Service Fee: Rs. %.2f%n", service);
        System.out.printf("Total after GST: Rs. %.2f%n", total);
        System.out.printf("Discount (10%%): Rs. %.2f%n", discount);
        System.out.printf("Final Payable Amount: Rs. %.2f%n", payable);
    }


}
