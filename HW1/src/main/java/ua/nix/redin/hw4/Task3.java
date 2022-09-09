package ua.nix.redin.hw4;
import java.util.Random;

public class Task3 {

    public static int func (int [] a) {
        int flag = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i-1]) continue;
            else {
                flag = 0;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Random ran = new Random();
        boolean flag = true;
        int [] a = new int [4];
        for (int i = 0; i < a.length; i++)
            System.out.print((a[i]=ran.nextInt(89)+10) + " ");

        if (func(a)==1) System.out.println(" -> Yes, this sequence is strictly increasing!!!");
        else System.out.println(" -> No, this sequence is not strictly increasig!!!");
    }
}