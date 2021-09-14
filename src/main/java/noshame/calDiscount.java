package noshame;

public class calDiscount {
    public static double calDiscount(double price, double dis) {
       double product = 15.0;
       double discount = 5.0;
       double finishedp = product * discount;
       double finp = product - finishedp;
       return finp;
    }
    public static void main(String[] args) {
        System.out.println(calDiscount(15.0, 0.80));
    }
}

