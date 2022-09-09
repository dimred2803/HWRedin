package ua.nix.redin.hw4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int size = 0;
        System.out.println("Please, enter the size of array :");
        while (true)
            if ((size = sc.nextInt()) <= 3) System.out.println("Please, enter the proper number (size > 3)!!!");
            else break;
        int [] mas = new int [size];
        ArrayList<Integer> mas2 = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.print((mas[i]=ran.nextInt(size+1))+ " ");
            if (mas[i] % 2 == 0) mas2.add(mas[i]);
        }
        System.out.println("\n----------------");
        if (mas2.isEmpty()) System.out.println("There are no even elements in the original array!!!");
        else System.out.println(mas2);
    }
}