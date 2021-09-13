package otherTasks;

// Пишемо програму, що конвертує арабські числа на римські

public class RomanNumbers {
    public static void main(String[] args) {
        RomanNumbers test = new RomanNumbers();
        System.out.println(test.intToRoman(2021));
    }


    public String intToRoman(int number) {
        if (number <= 0 || number > 3999) {
            throw new IllegalArgumentException();
        }

        String result = new String();
        for (int i = 0; i < number; i++) {
            result = result + "I";
        }
        return result.replace("IIIII", "V")
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX")
                .replace("XXXXX", "L")
                .replace("XXXX", "XL")
                .replace("LL", "C")
                .replace("LXL", "XC")
                .replace("CCCCC", "D")
                .replace("CCCC", "CD")
                .replace("DD", "M")
                .replace("DCD", "CM");


    }
}
