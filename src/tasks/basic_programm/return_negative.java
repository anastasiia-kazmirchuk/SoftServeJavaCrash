package tasks.basic_programm;

public class return_negative {
    public static void main(String[] args) {
        System.out.println(Kata.makeNegative(10));
    }

    public class Kata {

        public static int makeNegative(final int x) {

            if(x <= 0 ){
                return x;
            }else {
                return -x;
            }

        }

    }
}
