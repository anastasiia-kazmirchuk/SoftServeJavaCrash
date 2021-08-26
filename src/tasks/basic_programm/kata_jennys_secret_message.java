package tasks.basic_programm;

public class kata_jennys_secret_message {
    public static void main(String[] args) {
        System.out.println(Greeter.greet("Johnny"));
    }



    public class Greeter {
        public static String greet(String name) {


            if(name.equals("Johnny")){
                return "Hello, my love!";
            }
            return String.format("Hello, %s!", name);
        }
    }
}
