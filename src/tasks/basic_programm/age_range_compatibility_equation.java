package tasks.basic_programm;

public class age_range_compatibility_equation {
    public static void main(String[] args) {
        System.out.println(Kata.datingRange(29));
    }

    public class Kata{
        public static String datingRange(int age) {
            int min = 0;
            int max = 0;
            if (age <= 14){
              min = (int) (age -(0.10 * age));
              max = (int) (age + (0.10 * age));
            }else if (age > 14){
                min = age/2 + 7;
                max = (age-7)*2;
            } return min+"-"+max; // конкантинація і автоматичний перехід інтів в стрінгу
        }
    }
}
