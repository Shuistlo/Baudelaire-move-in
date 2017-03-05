package preliminaries;

public class MarkExams {

    /**
     *  This method creates a mark scheme and an attempt and then marks the
     *  attempt based on the mark scheme
     */

    public static void main(String[] args) {

        /*
            The following lines create a mark scheme by creating the questions
            with the correct answers and full marks and then passing them into
            an Exam object
        */

        NumericalQuestion nqMarkScheme = new NumericalQuestion(263074, 12);
        BooleanQuestion bqMarkScheme = new BooleanQuestion(false, 1);
        MultipleChoiceQuestion mcqMarkScheme = new MultipleChoiceQuestion(true, false, true, 3);
        Exam markScheme = new Exam(nqMarkScheme, bqMarkScheme, mcqMarkScheme);

        /*
            The following lines create an attempt by creating the questions with
            the selected answers and gives a mark of 0 (as the question has yet
            to be marked) and then passes them into an Exam object
        */

        NumericalQuestion nqAttempt = new NumericalQuestion(263073, 0);
        BooleanQuestion bqAttempt = new BooleanQuestion(true, 0);
        MultipleChoiceQuestion mcqAttempt = new MultipleChoiceQuestion(true, true, false, 0);
        Exam examAttempt = new Exam(nqAttempt, bqAttempt, mcqAttempt);

        Marker marker = new Marker(); // Creates a new Marker
        marker.markAttempt(examAttempt, markScheme); // Supplies the exam attempt and the mark scheme to the method that marks

        int finalMark = examAttempt.getTotalMark(); // Stores the total marks for the exam attempt

        /*
            The following lines print the amount of marks awarded for each question
            by using get methods for each question to fetch the mark awarded for
            the attempt
        */

        System.out.println("Question 1: " + nqAttempt.getMark() + " out of " + nqMarkScheme.getMark());
        System.out.println("Question 2: " + bqAttempt.getMark() + " out of " + bqMarkScheme.getMark());
        System.out.println("Question 3: " + mcqAttempt.getMark() + " out of " + mcqMarkScheme.getMark());

        /*
            The final lines print the final mark for the attempt and also the
            classification of the exam attempt is then printed by calling the
            necessary method in the marker class
        */

        System.out.println("The total mark is " + finalMark);
        System.out.println("The final grade is: " + marker.convertMarksToClassification(finalMark, 13, 10, 7));

    }
}
