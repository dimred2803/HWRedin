package ua.nix.redin.hw6;

class Box {
    private String value;

    public Box(String s) {
        this.value = s;
    }
    void setValue (String value) {
        this.value = value;
    }
    String getValue () {
        return this.value;
    }
}

public class Task23 {
    public static void main(String[] args) {
        Box b = new Box ("something");
        b.setValue("something2");
        System.out.println(b.getValue());
    }
}