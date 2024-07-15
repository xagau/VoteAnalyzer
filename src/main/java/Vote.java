import java.util.HashMap;
import java.util.Map;

class Vote {
    private int selection;
    private long question;
    private String votee;

    // Constructors, getters, and setters

    public Vote(int selection, long question, String votee) {
        this.selection = selection;
        this.question = question;
        this.votee = votee;
    }

    public int getSelection() {
        return selection;
    }

    public void setSelection(int selection) {
        this.selection = selection;
    }

    public long getQuestion() {
        return question;
    }

    public void setQuestion(long question) {
        this.question = question;
    }

    public String getVotee() {
        return votee;
    }

    public void setVotee(String votee) {
        this.votee = votee;
    }
}



