package day12;

import day08.ioEx.BufferedReaderWriter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class AllStatic {

    private AllStatic() {}
    public static int hap (int a, int b) {
        int v = a + b;
        return v;
    }
}

public class AllStaticTest {
    public static void main(String[] args) {
        //AllStatic st = new AllStatic();
        int result = AllStatic.hap(10, 20);
        System.out.println(result);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    }
}
