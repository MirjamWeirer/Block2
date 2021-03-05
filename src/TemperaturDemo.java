public class TemperaturDemo {

    public static void main(String[] args) {
       double cuurentTemperatureCelsius =22;
       double tempertrureCelsiusCampus = 11.8;

       double fahrenheit =celsiusToFahrenheit(cuurentTemperatureCelsius);
       System.out.println(cuurentTemperatureCelsius + " Celsius sind " + fahrenheit + " Fahrenheit");
       double fahrenheitCampus =celsiusToFahrenheit(tempertrureCelsiusCampus);
       System.out.println("aktulle Temperatur am  Campus " + tempertrureCelsiusCampus + " entsprechen " +fahrenheitCampus);

        System.out.println(fahrenheitToCelsius(fahrenheitCampus));
        System.out.println(fahrenheitToCelsius(65));

    }

    public static double celsiusToFahrenheit (double celsius){
        double result= celsius * 1.8 + 32;
        return result;
    }

    public static double fahrenheitToCelsius (double fahrenheit){
        double result = (fahrenheit - 32) / 1.8;
        return result;
    }
}
