package tasks.basic_programm;

public class grasshopper_debug {
    public static void main(String[] args) {
        System.out.println(GrassHopper.weatherInfo(50));  //celsius = (fahrenheit - 32) * (5/9)
    }

    public class GrassHopper {

        public static String weatherInfo(int temp) {
            double c = convertToCelsius(temp);
            if (c < 0){
                return (c + " is freezing temperature");}
            else{
                return (c + " is above freezing temperature");}
        }

        public static double convertToCelsius(int temperature) {
            double celsius = (temperature - 32) * 5/9.0;
            return celsius;
        }
    }
}
