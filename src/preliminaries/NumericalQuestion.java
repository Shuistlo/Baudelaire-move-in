package preliminaries;
public class NumericalQuestion extends Question{

    private int answer; // This variable stores the answer on the mark scheme or the given answer

    /**
     * The following constructor allows answer and mark to be set when the class
     * is created
     */

    public NumericalQuestion(int answer, int mark) {

    	super(mark);
        this.answer = answer;

    }

    /**
     * The following method returns the answer variable
     */

    public int getAnswer() {

        return answer;

    }
}
