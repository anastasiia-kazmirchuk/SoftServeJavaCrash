package otherTasks;

//Sequences "\\(", "\\)", "\\[", "\\]", "\\{" and "\\}" are not brackets.

public class Brackets {


    public boolean verifyBrackets(String text) {

        text = text.replaceAll("\\\\}","")
                .replaceAll("\\\\\\{","")
                .replaceAll("\\\\\\)","")
                .replaceAll("\\\\\\(","")
                .replaceAll("\\\\]","")
                .replaceAll("\\\\\\[","")
                .replaceAll("\\\\","");

        if (text.equals("") || text == null) {
            return true;
        }
        while(text.contains("()") || text.contains("[]")|| text.contains("{}")){
            text = text.replaceAll("\\(\\)","").replaceAll("\\[]","")
                    .replaceAll("\\{}","");
        }
        if (text.length() == 0) {
            return true;
        } else {
            return false;
        }
    }
}