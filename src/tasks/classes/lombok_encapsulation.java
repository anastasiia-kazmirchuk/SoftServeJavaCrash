package tasks.classes;

public class lombok_encapsulation {

    private int number;
    private String stringValue;
    private Object anObject;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setStringValue(String str) {
        this.stringValue = str;
    }

    public void setAnObject(Object obj) {
        this.anObject = obj;
    }

    public int getNumber() {
        return number;
    }

    public String getStringValue() {
        return stringValue;
    }

    public Object getAnObject() {
        return anObject;
    }

    public lombok_encapsulation() {

    }

    public lombok_encapsulation(int number, String stringValue, Object anObject) {
        this.number = number;
        this.stringValue = stringValue;
        this.anObject = anObject;

    }

}

