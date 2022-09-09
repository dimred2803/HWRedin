package ua.nix.redin.hw3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {

    public static Map<Character, Integer> func (String s) {
        Map<Character, Integer> a = new HashMap<>();

        if (!s.equals(""))
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) continue;
                else{
                    Character ch = s.charAt(i);
                    Integer count = a.get(ch);
                    if (count == null) {
                        count = 1;
                        a.put(ch, count);
                    }
                    else {
                        count+=1;
                        a.put(ch, count);
                    }
                }
            }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character, Integer> a = func(s);
        System.out.println(a);
    }
}