package people.data;

public class Person {
	
	private String name; // Name of the person
	private Integer friendliness; // The friendliness of the person
	
	/**
	 * The following constructor creates an object of the class and defines the attributes above
	 * @param name
	 * @param friendliness
	 */
	
	public Person(String name, int friendliness) {
		
		this.name = name;
		this.friendliness = friendliness;
		
	}
	
	/**
	 * Returns the name field
	 * @return
	 */
	
	public String getName() {
		
		return name;
		
	}
	
	/**
	 * Returns the friendliness field
	 * @return
	 */
	
	public Integer getFriendliness() {
		
		return friendliness;
		
	}
	
	/**
	 * Overrides toString method
	 */
	
	public String toString() {
		
		return "Person[name: " + name + ", friendliness:" + friendliness + "]";
		
	}
}
