package tasks.basic_programm;

public class thinkful_number_drills_pixelar_planning {

    public static void main(String[] args) {
        System.out.println(Kata.isDivisible(10,2)); // приклад
    }

    public class Kata {

        public static boolean isDivisible(int wallLength, int pixelSize) {

            if(wallLength%pixelSize == 0){  //  ділення з остачею
                return true;

            }else{
                return false;
            }



        }

    }
}
