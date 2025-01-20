package jungol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int [100];
        int[] cnt = new int [101];
        int N = sc.nextInt();

        for (int i=1; i<2*N; i++) {
            int a = sc.nextInt();
            cnt[a]++;
        }
        for (int i=1; i<N+1; i++) {
            if (cnt[i]!=0) {
                System.out.print(cnt[i]);//덜함
            }
        }


    }
}
