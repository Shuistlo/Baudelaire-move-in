package people.data;

/**
 * Relative class extends person
 * contains attribute hasMovedIn
 * implements method moveIn() which finds the friendliness of 
 * relative
 */
public class Relative extends Person implements Comparable{
	private boolean hasMovedIn;

	/*
	 * default constructor for Relative calls Person Constructor
	 */
	public Relative(String name, int nFriendliness) {
		super(name, nFriendliness);
		this.hasMovedIn = false;
	}
	
	/*
	 * moves in to relatives home and returns friendliness
	 */
	public Integer moveIn(){
		this.hasMovedIn = true;
		return getFriendliness();
	}
	
	/*
	 * gets the friendliness of the relative
	 * only if hasMovedIn is true
	 */
	public Integer getFriendliness(){
		if(this.hasMovedIn == true){
			return super.getFriendliness();
		}
		else{
			return null;
		}
	}

	/**
	 * Overrides the equals method. The objects are equal if their names are the same
	 */
	
	public boolean equals(Object person) {
		
		if (person instanceof Relative) {
			
			if (((Relative)person).getName().equals(getName())) {
				
				return true;
			}
		}
		
		return false;
	}

	/**
	 * Overrides compareTo method
	 */
	public int compareTo(Object o) {
		Relative other = (Relative) o;
		return this.getName().compareTo(other.getName());
	}
	
	/**
	 * Overrides toString method
	 */
	
	public String toString() {
		
		return "Relative[name: " + getName() + ", friendliness:" + ((Person)this).getFriendliness() + ", hasMovedIn:" + hasMovedIn + "]";
		
	}
}
