package ua.nix.redin.hw4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random ran = new Random ();
        final int size = 5;
        int [] a1 = new int[size];
        int [] a2 = new int[size];

        int sum_a1 = 0, sum_a2 = 0;

        for (int i = 0; i < size; i++){
            System.out.print((a1[i] = ran.nextInt(6))+" ");
            sum_a1+=a1[i];
        }
        System.out.println("\n---------");
        for (int i = 0; i < size; i++) {
            System.out.print((a2[i] = ran.nextInt(6))+" ");
            sum_a2+=a2[i];
        }
        //необязательно считать среднее арифметическое, все нужные выводы можно сделать и по сумме элементов.
        //Т.К. длина последовательностей одинаковая.
        if (sum_a1 > sum_a2) System.out.println("\nArithmetic average of first sequens is bigger than second one!!!");
        else if (sum_a1 < sum_a2) System.out.println("\nArithmetic average of second sequens is bigger than first one!!!");
        else System.out.println("\nThe arithmetic means of the first and second sequences are the same");
    }
}