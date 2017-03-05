package preliminaries;
public class BooleanQuestion extends Question{

    private boolean answer; // This variable stores the answer on the mark scheme or the given answer

    /**
     * The following constructor allows answer and mark to be set when the class
     * is created
     */

    public BooleanQuestion(boolean answer, int mark) {

    	super(mark);
        this.answer = answer;
    }

    /**
     * The following method returns the answer variable
     */

    public boolean getAnswer() {

        return answer;

    }
}
