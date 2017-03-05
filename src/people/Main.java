package people;
import java.util.TreeMap;

import people.data.Relative;
import people.data.Banker;

/**
 * tests Person, Relative, and Banker class
 * by finding the closest relative the Baudelaires 
 * should move in 
 */
public class Main {

	public static void main(String[] args) {
		
		Relative josephine = new Relative("Josephine",5);
		Relative olaf = new Relative("Olaf", -10);
		Relative sir = new Relative("Sir", 0);
		Relative uncleMonty = new Relative("Uncle Monty", 10);
		
		
		TreeMap<Relative,Integer> relativeList = new TreeMap<Relative,Integer>();
		
		relativeList.put(josephine, 100);
		relativeList.put(olaf, 10);
		relativeList.put(sir, 20);
		relativeList.put(uncleMonty, 20);
		
		Banker poe = new Banker("Poe", 5, relativeList);
		
		boolean relativeFound = false;
		do{
			Relative temp = poe.findRelative();
			System.out.println("The kids are currently moving in with: " + temp.getName());
			if(poe.moveOut(temp) == true){
				System.out.println("Poe has found that this relative is not a suitable guardian");
			} else{
				System.out.println(temp.getName() + " has been found as a suitable relative");
				relativeFound = true;
			}
		}while(relativeFound == false);
		
	}

}
