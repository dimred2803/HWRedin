package ua.nix.redin.hw7;

import java.util.Locale;

public class Task1234 {
    public static void main(String[] args) {
        String s = "Hello world!";
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(s.length()-1));
        char[] str = "world".toCharArray();
        for (int i=0;i<str.length;i++)
            System.out.print(str[i] + " ");

        System.out.println("\n------------------------");
        boolean b = s.endsWith("world!");
        System.out.println(b);
        boolean b1 = s.endsWith("something");
        System.out.println(b1);

        System.out.println("------------------------");
        boolean b3 = s.contains("something");
        System.out.println(b3);
        boolean b4 = s.contains("llo wor");
        System.out.println(b4);

        System.out.println("------------------------");
        String s1 = "Something GOES WROng!!!";
        String s2 = "somethinG goes wroNG!!!";
        System.out.println(s1.equals(s2));
        System.out.println(s1.toLowerCase().equals(s2.toLowerCase()));

        System.out.println("------------------------");
        boolean b5 = s.startsWith("Hello");
        System.out.println(b5);
        boolean b6 = s.startsWith("something");
        System.out.println(b6);
    }
}