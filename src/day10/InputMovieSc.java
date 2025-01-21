package day10;

import day10.dto.MovieDTO;

import java.util.Scanner;

public class InputMovieSc {
    static final Scanner sc = new Scanner(System.in);

    public MovieDTO inputObject(MovieDTO movie) {
        System.out.println("영화 제목 입력");
        movie.setTitle(sc.nextLine());
        System.out.println("개봉일 입력");
        movie.setStartDate(sc.nextInt());
        System.out.println("배우 이름 입력");
        movie.setActor(sc.nextLine());
        System.out.println("상영시간 입력");
        movie.setRunningTime(sc.nextLine());
        System.out.println("영화 등급 입력");
        movie.setGrade(sc.nextLine());

        return movie;
    }
}
