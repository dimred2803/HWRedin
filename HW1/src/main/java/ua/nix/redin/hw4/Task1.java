package ua.nix.redin.hw4;
import java.util.Random;

public class Task1 {

    public static int [] func (int [] a) {
        int [] max_ind = new int[] {a[0], 0};
        for (int i = 0; i < a.length; i++)
            if (a[i] > max_ind[0]) max_ind[0] = a[i];
        for (int i = a.length-1; i>=0; i--) {
            if (a[i] == max_ind[0]) {
                max_ind[1] = i;
                break;
            }
        }
        return max_ind;
    }

    public static void main(String[] args) {
        Random ran = new Random();
        int [] a = new int[12];
        for (int i = 0; i < a.length; i++) {
            a[i] = ran.nextInt(30) - 15;
            System.out.print(a[i] + " ");
        }

        int [] res = func(a);
        System.out.println("Max = " + res[0] + " | Index = " + res[1]);
    }
}