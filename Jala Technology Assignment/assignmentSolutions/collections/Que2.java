package assignmentSolutions.collections;

import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class Que2 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashedMap<>();

		// Insertion
		map.put(1, "Vinit");
		map.put(2, "Abhishek");
		map.put(3, "Vedansh");
		map.put(4, "Simran");
		map.put(5, "Shivam");
		map.put(6, "Shubhangi");
		map.put(7, "Uttam");
		map.put(8, "Subrat");
		map.put(9, "Nirmala");
		map.put(10, "Pinki");

		// Fetch the value of a key
		String student1 = map.get(1);

		// Create a clone/copy of HashMap
		Map<Integer, String> mapCopy = getCopy(map);

		// Check if the given Key is in the Map
		int key = 15;
		if (map.keySet().contains(key)) {
			System.out.println(key + " is present as a key");
		} else {
			System.out.println(key + " is not present as a key");
		}

		// Check if the given Value is in the Map
		String value = "Simran";
		if (map.values().contains(value)) {
			System.out.println(value + " is present as a value");
		} else {
			System.out.println(value + " is not present as a value");
		}

		// Check if the map is empty
		if (map.isEmpty()) {
			System.out.println("Map is Empty");
		} else {
			System.out.println("Map is not empty");
		}

		// print the size of map to console
		System.out.println("Map Size = " + map.size());

		// Print all the keys to the console
		for (int tmpKey : map.keySet()) {
			System.out.print(tmpKey + " ");
		}
		System.out.println();

		// Remove a specific key-value pair
		map.remove(10);

		// Copy all the elements of map

		Map<Integer, String> newMap = getCopy(map);

	}

	private static Map<Integer, String> getCopy(Map<Integer, String> map) {

		Map<Integer, String> mapCopy = new HashedMap();

		for (int key : map.keySet()) {
			mapCopy.put(key, map.get(key));
		}

		return mapCopy;

	}

}
