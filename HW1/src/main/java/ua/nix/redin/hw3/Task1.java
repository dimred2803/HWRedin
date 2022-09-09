package ua.nix.redin.hw3;
import java.util.Scanner;

public class Task1 {

    public static int func (String s) {
        int sum = 0;
        if (!s.equals(""))
            for (int i = 0; i < s.length(); i++)
                if (Character.isDigit(s.charAt(i)))
                    sum += Character.getNumericValue(s.charAt(i));
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(func(s));
    }
}