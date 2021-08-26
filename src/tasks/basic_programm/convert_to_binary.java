package tasks.basic_programm;

public class convert_to_binary {
    public static void main(String[] args) {
        System.out.println(Kata.toBinary(20));

    }
    public class Kata {

        public static int toBinary(int n) {

            return Integer.parseInt(Integer.toBinaryString(n));

        }

    }

}
