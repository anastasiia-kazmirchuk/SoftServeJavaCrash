package tasks.basic_programm;

public class century_from_year {
    public static void main(String[] args) {
        System.out.println(Solution.century(2021));
    }

    public static class Solution {
        public static int century(int number) {
            if (number % 10 == 0) {
                return number / 100;

            } else  {
                return number / 100 + 1;
            }
        }
    }
}


