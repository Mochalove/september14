package noshame;

public class calDiscount {
    public static double calDiscount(double price, double dis) {
       double finishedp = price * dis;
       double finp = price - finishedp;
       return finp;
    }
    public static void main(String[] args) {
        System.out.println(calDiscount(100.0, 0.20));
    }
}

