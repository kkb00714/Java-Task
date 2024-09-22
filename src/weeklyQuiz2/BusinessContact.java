package chap08.src.weeklyQuiz2;

public class BusinessContact extends Contact{
    protected String corporation;

    public void setCorporation(String corporation) {
        this.corporation = corporation;
    }

    public String getCorporation() {
        return this.corporation;
    }

}
