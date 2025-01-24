package day13.homework.class실습;

public class BookMgr extends Book{

    private Book[] booklist;
    private int sum;

    public BookMgr(Book[] booklist) {
        this.booklist = booklist;
    }

    public void printBooklist(){
        for (int i=0; i<booklist.length; i++) {
            System.out.println(booklist[i].getTitle());
        }
    }

    public void printTotalPrice(){
        for (int i=0; i<booklist.length; i++) {
            sum += booklist[i].getPrice();
        }
        System.out.printf("전체 책 가격의 합 : %d", sum);
    }
}