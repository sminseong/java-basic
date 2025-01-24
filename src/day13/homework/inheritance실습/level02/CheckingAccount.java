package day13.homework.inheritance실습.level02;

public class CheckingAccount extends Account{
    private String cardNo;

    public CheckingAccount(String accId, String ownerName, long balance, String cardNo) {
        super(accId, ownerName, balance);
        this.cardNo = cardNo;
    }

    @Override
    public void calcRate() {

    }
    public void pay(String cardNo, long amount) {
        long money = getBalance();
        if (this.cardNo.equals(cardNo) && amount<getBalance()) {
            money -= amount;
        } else {
            System.out.println("지불이 불가능합니다.");
        }
    }
}
