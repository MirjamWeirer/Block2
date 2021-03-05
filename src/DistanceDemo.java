public class DistanceDemo {

    public static void main(String[] args) {

        int kilometerValue = 12;

        double miles = kilometerToMiles(kilometerValue); //kilometerValue wird an methode geschickt
        double miles2 = kilometerToMiles(17);

        System.out.println(kilometerValue + " Kilometer sind " + miles + " Meilen");
        System.out.println(kilometerValue + " Kilometer sind " + miles2 + " Meilen");

        double MileValue = 3.45;
        double kilometer = mileToKilomter(MileValue);
        System.out.println(MileValue + " Meilen sind " + kilometer+ " Kilometer");
    }

    //Methode ist unabhängig vom Aufrufer
    public static double kilometerToMiles (int kilometer){
        double result = kilometer / 1.609;
        return result; //berechnete Mile
    }

    public static double mileToKilomter (double mile){
        double result = mile * 1.609;
        return result;
    }
}
