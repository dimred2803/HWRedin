package ua.nix.redin.hw6;

public class Task4 {

    static int func (int n, int m){
        if (n == 0 || m == 0) return 0;
        if (n == 1) return m;
        if (m == 1) return n;
        return n + func(n, m-1);
    }

    public static void main(String[] args) {
        System.out.println(func(0,0));
    }
}