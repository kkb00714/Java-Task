package chap08.src.weeklyQuiz2_solution;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "이름: " + name + ", 전화번호: " + phoneNumber + ", ";
    }
}
