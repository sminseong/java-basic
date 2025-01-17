package day08.ioEx;

import java.io.*;       //java.io.모든 클래스 import
import java.util.StringTokenizer;

public class BufferedReaderWriter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        String str = br.readLine();     //  한줄에 입력받기
//        bw.write(str);
//        bw.flush();
        int number = Integer.parseInt(br.readLine());   //5를 정수로 형변환 한 후 저장

        for (int i=0; i<=number; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());   //첫번째로 입력된 숫자 저장
            int second = Integer.parseInt(st.nextToken());  //두번째로 입력된 숫자 저장

            bw.write(String.valueOf(first)+ " ");
            bw.write(String.valueOf(second)+ "\n");
        }
        bw.flush();
    }
}
