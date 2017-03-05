package preliminaries;
public class MultipleChoiceQuestion extends Question{

    private boolean option1; // This variable stores the answer on the mark scheme or the given answer (for option 1)
    private boolean option2; // This variable stores the answer on the mark scheme or the given answer (for option 2)
    private boolean option3; // This variable stores the answer on the mark scheme or the given answer (for option 3)
    /**
     * The following constructor allows the options and mark to be set
     */

    public MultipleChoiceQuestion(boolean option1, boolean option2, boolean option3, int mark) {

    	super(mark);
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;

    }

    /**
     * The following method returns option 1
     */

    public boolean getOption1() {

        return option1;

    }

    /**
     * The following method returns option 2
     */

    public boolean getOption2() {

        return option2;

    }

    /**
     * The following method returns option 3
     */

    public boolean getOption3() {

        return option3;

    }

}
