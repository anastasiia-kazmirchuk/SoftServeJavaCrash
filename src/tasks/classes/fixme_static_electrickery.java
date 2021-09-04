package tasks.classes;

public class fixme_static_electrickery {
    public static void main(String[] args) {
        System.out.println(Dinglemouse.INST.plus100(100));
    }

    public static class Dinglemouse {

        public static Dinglemouse INST = new Dinglemouse().setValue(); // final забираємо геть і викликаю метод, який присвоює перемінній значення 100

        private static int ONE_HUNDRED = 100;

        private int value; // тут теж

        private Dinglemouse() {
            value = ONE_HUNDRED;
        }

        public int plus100(int n) {
            return value + n;
        }

        public Dinglemouse setValue() { // створюємо метод для присвоєння значення
            this.value = 100;
            return this;
        }

    }
}

