package assignmentSolutions.collections;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Que3 {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet();
		String[] names = new String[] { "Vinit", "Abhishek", "Vedansh", "Simran", "Subrat", "Shubhangi", "Uttam",
				"Nirmala", "Pinki", "Shivam" };

		// Insertion
		for (String name : names) {
			set.add(name);
		}

		// Create a clone/copy of HashSet
		Set<String> mapCopy = getCopy(set);

		// Check if the given value is in the Set
		if (set.contains("Ishita")) {
			System.out.println("Ishita is present in the set.");
		} else {
			System.out.println("Ishita is not present in the set.");
		}

		// Check if the map is empty
		if (set.isEmpty()) {
			System.out.println("Set is Empty");
		} else {
			System.out.println("Set is not empty");
		}

		// print the size of set to console
		System.out.println("Set Size = " + set.size());

		// Print all the values to the console
		for (String tmpVal : set) {
			System.out.print(tmpVal + " ");
		}
		System.out.println();

		// Remove a specific value
		set.remove("Pinki");

	}

	private static Set<String> getCopy(HashSet<String> set) {

		Set<String> copySet = new HashSet();

		for (String name : set) {
			copySet.add(name);
		}

		return copySet;

	}

}
