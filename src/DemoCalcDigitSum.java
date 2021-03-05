public class DemoCalcDigitSum {
    public static void main(String[] args) {

        System.out.println("sum = " + calDigitSum(54321));
        System.out.println("sum = " + calDigitSum(9876543));
        System.out.println("sum = " + calDigitSum(12));
    }
    public static int calDigitSum (int value){
        int ziffernsumme = 0;
        while (value>0){
            ziffernsumme = ziffernsumme +(value % 10);
            value = value / 10;
        }
        return ziffernsumme;
    }
}
