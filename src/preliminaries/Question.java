package preliminaries;

public class Question {
	
	private int mark; // stores the mark for the question
	
	/**
	 * Creates the question and sets the above field
	 * @param mark
	 */
	
	public Question(int mark) {
		
		this.mark = mark;
		
	}
	
	/**
	 * Returns the mark field
	 * @return
	 */
	
	public int getMark() {
		
		return mark;
		
	}
	
	/**
	 * Sets the mark field with the given value
	 * 
	 */
	
	public void setMark(int mark) {
		
		this.mark = mark;
		
	}

}
