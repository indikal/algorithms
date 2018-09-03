package lk.inli.algorithms;

import java.util.Arrays;

public class AlmostSorted {
	public static void main(String[] args) {
		int[] input1 = { 4104,8529,49984,54956,63034,82534,84473,86411,92941,95929,108831,894947,125082,137123,137276,
						 142534,149840,154703,174744,180537,207563,221088,223069,231982,249517,252211,255192,260283,261543,262406,
						 270616,274600,274709,283838,289532,295589,310856,314991,322201,339198,343271,383392,385869,389367,403468,
						 441925,444543,454300,455366,469896,478627,479055,484516,499114,512738,543943,552836,560153,578730,579688,
						 591631,594436,606033,613146,621500,627475,631582,643754,658309,666435,667186,671190,674741,685292,702340,
						 705383,722375,722776,726812,748441,790023,795574,797416,813164,813248,827778,839998,843708,851728,857147,
						 860454,861956,864994,868755,116375,911042,912634,914500,920825,979477 };
		almostSorted(input1);
		
		System.out.println("2 ----------------------------------------------------");
		int[] input2 = { 4,2 };
		almostSorted(input2);

		System.out.println("3 ----------------------------------------------------");
		int[] input3 = { 1,5,4,3,2,6 };
		almostSorted(input3);
		
		System.out.println("4 ----------------------------------------------------");
		int[] input4 = { 4104,8529,49984,54956,63034,82534,84473,86411,92941,95929,108831,979577,125082,137123,137276,
				 142534,149840,154703,174744,180537,207563,221088,223069,231982,249517,252211,255192,260283,261543,262406,
				 270616,274600,274709,283838,289532,295589,310856,314991,322201,339198,343271,383392,385869,389367,403468,
				 441925,444543,454300,455366,469896,478627,479055,484516,499114,512738,543943,552836,560153,578730,579688,
				 591631,594436,606033,613146,621500,627475,631582,643754,658309,666435,667186,671190,674741,685292,702340,
				 705383,722375,722776,726812,748441,790023,795574,797416,813164,813248,827778,839998,843708,851728,857147,
				 860454,861956,864994,868755,911042,912634,914500,920825,979477,116375 };
		almostSorted(input4);

		System.out.println("5 ----------------------------------------------------");
		int[] input5 = { 1,5,4,3,2 };
		almostSorted(input5);

		System.out.println("6 ----------------------------------------------------");
		int[] input6 = { 5,4,3,2,1,6 };
		almostSorted(input6);

		System.out.println("7 ----------------------------------------------------");
		int[] input7 = { 5,4,3,2,1 };
		almostSorted(input7);
		
		System.out.println("8 ----------------------------------------------------");
		int[] input8 = { 4104,8529,49984,54956,63034,82534,84473,86411,92941,95929,108831,116375,125082,137123,137276,
		142534,149840,154703,174744,180537,207563,221088,223069,231982,249517,252211,255192,260283,261543,262406,
		579688,578730,560153,552836,543943,512738,499114,484516,479055,478627,469896,455366,454300,444543,441925,
		403468,389367,385869,383392,343271,339198,322201,314991,310856,295589,289532,283838,274709,274600,270616,
		591631,594436,606033,613146,621500,627475,631582,643754,658309,666435,667186,671190,674741,685292,702340,
		705383,722375,722776,726812,748441,790023,795574,797416,813164,813248,827778,839998,843708,851728,857147,
		860454,861956,864994,868755,911042,912634,914500,920825,979477,979577 };
		almostSorted(input8);
		
		System.out.println("9 ----------------------------------------------------");
		int[] input9 = { 1,2,4,3,5,6 };
		almostSorted(input9);
	}

	static void almostSorted(int[] arr) {

		for (int i = 0; i < (arr.length - 1); i++) {
			if (arr[i] > arr[i + 1]) {
				if (isSwapSolve(arr, i)) {
					// swap solves the problem
					//System.out.println("yes");
					//System.out.println("swap " + (i + 1) + " " + (i + 2)); // index starts from 1
					break;
				} else if (isReverseSolve(arr, i)) {
					// reverse solves the problem
					break;
				} else {
					System.out.println("no");
					break;
				}
			}
		}
	}

	private static boolean isAscending(int[] arr) {
		for (int i=0; i< (arr.length - 1); i++) {
			if (arr[i] > arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isSwapSolve(int[] arr, int index) {
		System.out.println("isSwapSolve: start index " + index + "=" + arr[index]);
		
		if (arr[index] > arr[index + 1]) {
			
			if (arr.length == 2) {
				System.out.println("isSwapSolve: only two elements to swap");
				System.out.println("yes");
				System.out.println("swap 1 2");
				return true;
			} else if ((index + 2) < arr.length && arr[index] < arr[index + 2]) {
				int[] newArr = Arrays.copyOfRange(arr, 0, arr.length);
				//Arrays.stream(newArr).forEach(e -> System.out.println(e));
				newArr[index] = arr[index+1];
				newArr[index+1] = arr[index];
				
				if (isAscending(newArr)) {
					System.out.println("isSwapSolve: next swap partner is element " + (index+1));
					System.out.println("yes");
					System.out.println("swap " + (index + 1) + " " + (index + 2));
					return true;
				} else {
					return false;
				}
			} else {
				//find the other swap partner
				for (int i=index + 1; i<arr.length; i++) {
					if ((i + 1) < arr.length && arr[i] > arr[i + 1]) {
						int[] newArr = Arrays.copyOfRange(arr, 0, arr.length);
						//Arrays.stream(newArr).forEach(e -> System.out.println(e));
						newArr[i+1] = arr[index];
						newArr[index] = arr[i+1];
						
						if (isAscending(newArr)) {
							System.out.println("isSwapSolve: next swap partner is element " + i);
							System.out.println("yes");
							System.out.println("swap " + (index + 1) + " " + (i + 2));
							return true;
						} else {
							return false;
						}
					}
				}
			}
		}
		
		System.out.println("isSwapSolve: array is not swappable");
		return false;
	}

	private static boolean isReverseSolve(int[] arr, int index) {
		System.out.println("isReverseSolve: start index " + index + "=" + arr[index]);
		int endReverse = index;
		
		if ((arr.length - index) < 3) {
			System.out.println("isReverseSolve: should have minimum 3 elements to proceed with reverse");
			return false;
		}

		for (int i = index; i < (arr.length - 1); i++) {
			if ((i + 1) == (arr.length -1) && arr[i] > arr[i + 1]) {
				endReverse = i + 1;
				System.out.println("yes");
				System.out.println("reverse " + (index + 1) + " " + (endReverse + 1)); // index starts from 1
				return true;
			} else if (arr[i] > arr[i + 1]) {
				// continue
				endReverse = i;
				System.out.println("isReverseSolve: element " + i + " is reversible");
			} else {
				// end of reverse
				System.out.println("isReverseSolve: reversible sub-sequence ends at " + i + ", val: " + arr[i]);
				endReverse = i;
				if ((index - 1) < 0 || arr[index - 1] < arr[i] && arr[index] < arr[i+1]) {
					// reverse possible
					System.out.println("isReverseSolve: reverse posible");
					break;
				}
			}
		}

		if ((endReverse + 1) < arr.length) {
			System.out.println("isReverseSolve: checking if rest of the array in ascending order");
			for (int i = endReverse + 1; i < (arr.length - 1); i++) {
				if (arr[i] > arr[i + 1]) {
					System.out.println("isReverseSolve: rest of the array not in ascending order");
					System.out.println("isReverseSolve: elem" + i + "=" + arr[i] + "and elem" + (i+1) + "=" + arr[i+1]);
					return false;
				}
			}
		}

		System.out.println("yes");
		System.out.println("reverse " + (index + 1) + " " + (endReverse + 1)); // index starts from 1
		return true;
	}
}
