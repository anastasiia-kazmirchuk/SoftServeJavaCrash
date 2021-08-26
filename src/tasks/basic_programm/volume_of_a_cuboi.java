package tasks.basic_programm;

public class volume_of_a_cuboi {
    public static void main(String[] args) {
        System.out.println(Kata.getVolumeOfCuboid(3,4,5));  //перевірка коду
    }

    public static class Kata {

        public static double getVolumeOfCuboid(final double length, final double width, final double height) {

            double volume = length*width*height;

            return volume;
        }

    }
}
