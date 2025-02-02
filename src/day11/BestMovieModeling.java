package day11;

import day11.vo.MovieVO;

import java.util.Scanner;

public class BestMovieModeling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 영화의 총 갯수를 입력하세요!");
        int movieTotal = sc.nextInt();
        System.out.println("각 영화당 상세정보의 갯수를 입력하세요.");
        int movieInfo = sc.nextInt();

        MovieVO[][] movieArray = new MovieVO[movieTotal][movieInfo];

        String title = "미입력", actor = "미입력", gener = "미입력", runningTime = "미입력", grade = "미입력";
        int startDate = 0;

        // 3개 영화의 상세정보 목록의 갯수는 3개(title, actor, grade)

        // 정보를 입력받고 해당 영화정보의 내용이 자동으로 movieArray 에 할당되도록
        for (int i=0; i<movieTotal; i++) {
            System.out.println("--- " + (i+1) + "번째 영화 입력 ---");
            for (int j=0; j<movieInfo; j++) {
                switch (j) {
                    case 0:
                        System.out.print("영화 제목 입력: ");
                        title = sc.next();
                        break;
                    case 1:
                        System.out.print("영화 개봉일 입력: ");
                        startDate = sc.nextInt();
                        break;
                    case 2:
                        System.out.print("영화 주인공 입력: ");
                        actor = sc.next();
                        break;
                    case 3:
                        System.out.print("영화 장르 입력: ");
                        gener = sc.next();
                        break;
                    case 4:
                        System.out.print("영화 러닝타임 입력: ");
                        runningTime = sc.next();
                        break;
                    case 5:
                        System.out.print("영화 등급 입력: ");
                        grade = sc.next();
                        break;
                }
            }
            movieArray[i][0] = new MovieVO(title, startDate, actor, gener, runningTime, grade);
        }

        for (int i=0; i<movieTotal; i++) {
            for (int j=0; j<movieInfo; j++) {
                System.out.print(movieArray[i][j] + " ");
            }
            System.out.println();
        }
//        MovieVO avata = new MovieVO("아바타", "12세", "액션");
//        System.out.println(avata);
//        avata.setStartDate(20250125);
//        avata.setActor("김");
//        avata.setRunningTime("120");
//
//
//
//        System.out.println("++++++++ " + avata.getTitle() + " 영화정보 ++++++++");
//        System.out.printf("제목 : %s%n", avata.getTitle());
//        System.out.printf("배우 : %s%n", avata.getActor());
//        System.out.printf("러닝타임 : %s%n", avata.getRunningTime());
//        System.out.printf("등급 : %s%n", avata.getGrade());
//        System.out.println("+".repeat(30));


    }
}
