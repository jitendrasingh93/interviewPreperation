package spring.dipendency.injection;

import java.util.Date;

/**
 * Created by JitendraSingh on 24/12/17.
 */
public class Answer {

    private int ansId;
    private String answer;
    private Date ansDate;

    public Answer(int ansId, String answer, Date ansDate) {
        this.ansId = ansId;
        this.ansDate = ansDate;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "AnsId : " +ansId + "\n Answer : " + answer  + "\n Answer Date : " +ansDate;
    }
}
