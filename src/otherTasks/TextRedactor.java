package otherTasks;

public class TextRedactor {
    public static void main(String[] args) {
        TextRedactor test = new TextRedactor();
        System.out.println(test.reformatLines("Java    was      originally developed\n" +
                "   by    James   Gosling at Sun Microsystems (which\n" +
                " has since been\n" +
                "acquired by Oracle) and released in 1995\n" +
                " as a core component of Sun Microsystems' Java platform."));
    }

    public String reformatLines(String text) {
        text = text.replace("\n", " ");
        while (text.contains("  ")) {
            text = text.replace("  ", " ");

        }


        if (text.startsWith(" ")) {
            text = text.substring(1);
        }
        if (text.endsWith(" ")) {
            text = text.substring(0, text.length() - 1);
        }
        for (int i = 59; i < text.length(); i = i + 60) {
            while (!Character.isWhitespace(text.charAt(i))) {
                --i;
            }
            text = text.substring(0, i) + "\n" + text.substring(i + 1);
        }

        return text;


    }
}
