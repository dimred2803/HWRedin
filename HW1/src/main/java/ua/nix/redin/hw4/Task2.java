package ua.nix.redin.hw4;
import java.util.Random;

public class Task2 {

    public static int [] func (int[] a) {
        for (int i = 0; i < a.length; i++)
            if (i%2!=0) a[i]=0;
        return a;
    }

    public static void main(String[] args) {
        Random ran = new Random ();
        int [] a = new int[8];
        for (int i = 0; i < a.length; i++)
            System.out.print((a[i] = ran.nextInt(10)+1) + " ");
        System.out.println("\n--------------------------------------------");
        int [] b = func(a);
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");

    }
}