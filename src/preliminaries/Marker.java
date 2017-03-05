package preliminaries;
public class Marker {

    /**
     * The following method marks the given attempt using the given mark scheme
     * It does this based on a set of conditions
     */

    public void markAttempt(Exam attempt, Exam markScheme) {

        /*
           The following variables temporarily store the answer to the question
           or the highest possible amount of marks awarded for the question
           This is done by using the get methods in the Exam class and the
           question classes
        */

        int q1Ans = markScheme.getQuestion1().getAnswer(); // Ans means it stores the answer
        int q1Marks = markScheme.getQuestion1().getMark(); // Marks means is stores the maximum marks available
        boolean q2Ans = markScheme.getQuestion2Answer();
        boolean q3Ans1 = markScheme.getQuestion3().getOption1();
        boolean q3Ans2 = markScheme.getQuestion3().getOption2();
        boolean q3Ans3 = markScheme.getQuestion3().getOption3();

        /*
           The following variables store the answers selected in the attempt
           This is done by using the get methods in the Exam class and the
           question classes
        */

        int q1Sel = attempt.getQuestion1().getAnswer();
        boolean q2Sel = attempt.getQuestion2Answer();
        boolean q3Sel1 = attempt.getQuestion3().getOption1();
        boolean q3Sel2 = attempt.getQuestion3().getOption2();
        boolean q3Sel3 = attempt.getQuestion3().getOption3();

        int temp = 0; // This is a temporary variable used to help calulate the marks needed for the multiple choice question

        /*
            The following if statements determine how many marks is awarded for
            question 1 of the exam attempt
            The marks are then updated using a get method for the attempt and then
            a set method for the question
        */

        // This if statement checks if the attempted answer is the correct answer
        if (q1Sel == q1Ans) {

            attempt.getQuestion1().setMark(q1Marks); // The attempt gets full marks

        // This checks if the attempt is one more or less than the correct answer
        } else if (q1Sel == (q1Ans - 1) || q1Sel == (q1Ans + 1)) {

            attempt.getQuestion1().setMark(q1Marks - 1); // The attempt gets one less than full marks

        // If the difference between the attempt and the answer is greater than 5
        } else if (q1Sel > (q1Ans + 5) || q1Sel < (q1Ans - 5)) {

            attempt.getQuestion1().setMark(0); // The attempt receives 0 marks

        } else {

            attempt.getQuestion1().setMark(1); // Otherwise the attempt is given a single mark

        }

        /*
            The following if statement determines how many marks is awarded for
            question 2 of the exam attempt
            The marks are then updated using a get method for the attempt and then
            a set method for the question
        */

        // Checks if the attempted answer is equal to the correct answer
        if (q2Sel == q2Ans) {

            attempt.setQuestion2Mark(1); // The full marks is awarded if so

        }

        /*
            The following if statements checks if the options selected for the
            attempt are correct
            The variable temp is incremented by 1 for each correct option
            The final mark is the value of temp
        */

        // Compares the selected option 1 with the correct option 1
        if (q3Sel1 == q3Ans1) {

            temp = temp + 1; // Increments the temp variable

        }

        // Compares the selected option 2 with the correct option 2
        if (q3Sel2 == q3Ans2) {

            temp = temp + 1;

        }

        // Compares the selected option 3 with the correct option 3
        if (q3Sel3 == q3Ans3) {

            temp = temp + 1;

        }

        // Updates the marks for the question if the marks is greater than 0
        if (temp > 0) {

            attempt.getQuestion3().setMark(temp); // temp becomes the mark for the question

        }

        attempt.setTotalMark(); // Finally the total amount of marks for the exam is updated using the set method in the Exa, class

    }

    /**
     *  The following method converts the total marks for the attempt into a
     *  classification and returns it
     */

    public double convertMarksToClassification(int marks, int firstBoundary, int upperSecondBoundary, int lowerSecondBoundary) {

        double classification; // Initialises the variable classification

        // Checks if the final mark is equal to or above the first boundary
        if (marks >= firstBoundary) {

            classification = 1.1; // The classification is 1.1
            return classification;

        // Checks if the final mark is between the upperSecondBoundary and the firstBoundary
        } else if (marks < firstBoundary && marks >= upperSecondBoundary) {

            classification = 2.1;
            return classification;

        // Checks if the final mark is between the lowerSecondBoundary and the upperSecondBoundary
        } else if (marks < upperSecondBoundary && marks >= lowerSecondBoundary) {

            classification = 2.2;
            return classification;

        } else {

            classification = 0.0; // Otherwise the classifcation is just 0.0
            return classification;

        }
    }
}
