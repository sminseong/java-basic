package practice;

public class MemberService {
    String id;
    String password;

    public boolean login(String id, String password) {
        if (id == "hong" && password == "12345") {
            return true;
        } else return false;
    }
    public String logout(String id) {
        return id + "님이 로그아웃 되었습니다.";
    }
}
