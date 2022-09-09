package ua.nix.redin.hw6;

public class Task1 {
    public static double func1 (double n) {
        return  Math.pow(n,2);
    }
    public static String func2 (String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        double n = 25.0d;
        String s = "Something goes wrong!!!";
        System.out.println(func1(n));
        System.out.println(func2(s));
    }
}