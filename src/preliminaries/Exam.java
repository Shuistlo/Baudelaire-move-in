package preliminaries;

public class Exam {

    private NumericalQuestion question1; // This variable holds the first question
    private BooleanQuestion question2; // This variable holds the second question
    private MultipleChoiceQuestion question3; // This variable holds the third question
    private int totalMark; // The total marks awarded/possible

    /**
     * The following constructor allows the questions to be set and afterwards,
     * calls the method setTotalMark to set the totalMark
     */

    public Exam(NumericalQuestion question1, BooleanQuestion question2, MultipleChoiceQuestion question3) {

        this.question1 = question1;
        this.question2 = question2;
        this.question3 = question3;

        setTotalMark();

    }

    /**
     * The following method returns question 1
     */

    public NumericalQuestion getQuestion1() {

        return question1;

    }

    /**
     * The following method returns question 2 answer
     */

    public boolean getQuestion2Answer() {

        return question2.getAnswer();

    }
    
    /**
     * The following method sets the mark for question 2
     */
    
    public void setQuestion2Mark(int mark) {
    	
    	question2.setMark(mark);
    	
    }

    /**
     * The following method returns question 3
     */

    public MultipleChoiceQuestion getQuestion3() {

        return question3;

    }

    /**
     * The following method returns the totalMark field
     */

    public int getTotalMark() {

        return totalMark;

    }

    /**
     * The following method allows the total marks to be set by giving the field
     * totalMark, the sum of all the marks for each question
     */

    public void setTotalMark() {

        totalMark = question1.getMark() + question2.getMark() + question3.getMark();

    }

}
