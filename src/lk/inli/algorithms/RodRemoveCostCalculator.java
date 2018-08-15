package lk.inli.algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Cost of removing single rod if sqrt(1) and cost of removing a group of n rods if sqrt(n).
 * Always use the ceiling value. Input: total no of rods and all pairs of rods.
*/
public class RodRemoveCostCalculator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("1 2");
		list.add("1 4");
		System.out.println(calculateCost(4, list));
		
		list = new ArrayList<>();
		list.add("1 2");
		list.add("1 4");
		list.add("8 5");
		list.add("3 8");
		list.add("6 7");
		System.out.println(calculateCost(8, list));
	}

	static int calculateCost(int n, List<String> pairs) {
		List<Set> groups = new ArrayList<>();
		long totalCost = 0;
		
		for (String pair : pairs) {
			String rod1 = "" + pair.charAt(0);
			String rod2 = "" + pair.charAt(2);
						
			boolean isGroupExist = false;
			for(Set group : groups) {
				if (null != group && group.size() > 0 && (group.contains(rod1) || group.contains(rod2))) {
					group.add(rod1);
					group.add(rod2);
					isGroupExist = true;
				}
			}
			
			if (!isGroupExist) {
				Set<String> set = new HashSet<>();
				set.add(rod1);
				set.add(rod2);
				groups.add(set);
			}
		}
		
		int noOfGroupedRods = 0;
		for (Set group : groups) {
			noOfGroupedRods += group.size();
			totalCost += Math.round(Math.ceil(Math.sqrt(group.size())));
		}
		
		int noOfSingleRods = n - noOfGroupedRods;
		totalCost += Math.round(Math.ceil(Math.sqrt(1))) * noOfSingleRods;
		
		return (int) totalCost;
	}
}
