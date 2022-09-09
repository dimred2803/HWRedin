package ua.nix.redin.hw3;

import java.util.Scanner;

public class Task3 {

    public static int func (int Class_num) {
        int res  = 9 * 60;
        for (int i =1;i <=Class_num;i++) {
            res +=45;
            if (i == Class_num) break;
            if (i % 2 == 0) res += 15;
            else res += 5;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the Class Number (1-10) : ");
        int Class_num = sc.nextInt();

        int res = func(Class_num);
        System.out.println(Class_num + "-th Lesson ends at "
                + res / 60 + ':' + res % 60);
    }
}