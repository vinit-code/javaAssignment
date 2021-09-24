package assignmentSolutions.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Que1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		String[] skills = new String[] { "React.js", "Spring-Boot", "MySQl", "Java Core", "Android App", "Kotlin",
				"Git", "Nginx", "Maven", "Linux/Windows" };

		// Adding elements to ArrayList
		addAll(list, skills);

		// Iterating through ArrayList using iterator

		traverseUsingIterator(list);

		// Adding a element to specific index
		addAt(list, 1, "React Native");

		// Remove an element from the ArrayList, Remove at an index
		removeAt(list, 1);

		// Update element at specific position
		int index = list.size() - 1;
		String newSkill = "Linux";
		update(list, index, newSkill);

		// Element is present at particular
		if (isPresentAt(list, 1, "Spring-boot")) {
			System.out.println("Spring-boot is present at index 1");

		} else {

			System.out.println("Spring-boot is not present at index 1");
		}

		// Get an element at a particular index
		String tmpSkill = list.get(1);

		// Find out the size of the ArrayList
		System.out.println("Total skills = " + list.size());

		// Check the given element is present in the ArrayList
		if (contains(list, "someRandromSkill")) {
			System.out.println("Desired skill exists");
		} else {
			System.out.println("Desired skill does not exists");
		}

		removeAll(list);

	}

	private static void removeAll(ArrayList<String> list) {
		list = new ArrayList(); // This is just one way of removing all the elements.
	}

	private static boolean contains(ArrayList<String> list, String string) {
		boolean isFound = false;

		for (String skill : list) {

			if (skill.equalsIgnoreCase(string)) {
				isFound = true;
				break;
			}

		}

		return isFound;
	}

	private static boolean isPresentAt(ArrayList<String> list, int i, String string) {

		return list.get(i).equalsIgnoreCase(string);
	}

	private static void update(ArrayList<String> list, int index, String newSkill) {
		removeAt(list, index); // 1 3, index = 2
		addAt(list, index, newSkill);

	}

	private static void removeAt(ArrayList<String> list, int i) {
		String removedSkill = list.remove(i);

	}

	private static void addAt(ArrayList<String> list, int i, String string) {

		list.add(i, string);

	}

	private static void traverseUsingIterator(ArrayList<String> list) {
		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();

	}

	private static void addAll(ArrayList<String> list, String[] skills) {

		for (String skill : skills) {
			list.add(skill);
		}

	}

}
