package people.data;

import java.util.TreeMap;

public class Banker extends Person {
	
	private TreeMap<Relative,Integer> listOfRelatives;
	
	/**
	 * The following constructor creates an object of the class and initialises the
	 * fields in the Person class as well as the map field above
	 */

	public Banker(String name, int friendliness, TreeMap<Relative,Integer> listOfRelatives) {
		
		super(name, friendliness);
		this.listOfRelatives = listOfRelatives;
		
	}
	
	/**
	 * The following method returns the closest relative
	 */
	
	public Relative findRelative() {
		
		Relative closestRelative = null;
		
		for (Relative relative : listOfRelatives.keySet()) {
			
			if (closestRelative == null) {
				
				closestRelative = relative;
				
			} else {
				
				if (listOfRelatives.get(closestRelative) > listOfRelatives.get(relative)) {
					
					closestRelative = relative;
					
				}
			}
		}
		
		return closestRelative;
	}
	
	/**
	 * The following method returns whether or not the relative is suitable
	 */
	
	public boolean moveOut(Relative relative) {
		
		if (relative.moveIn() < getFriendliness()) {
			
			listOfRelatives.remove(relative);
			return true;
			
		}
		
		return false;
	}
	
	/**
	 * Overrides toString method
	 */
	
	public String toString() {
		
		return "Banker[name: " + getName() + ", friendliness:" + getFriendliness() + ", listOfRelatives:" + listOfRelatives + "]";
		
	}

}
