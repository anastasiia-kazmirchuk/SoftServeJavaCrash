package tasks.classes;

public class fixme_static_electrickery {

    public static class Dinglemouse {

        public static  Dinglemouse INST = new Dinglemouse(); // final забираємо геть

        private static int ONE_HUNDRED = 100;

        private  int value; // тут теж

        private Dinglemouse() {
            value = ONE_HUNDRED;
        }

        public int plus100(int n) {
            return value + n;
        }

    }

}

